// hashtag/[tag].js
import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useRouter } from 'next/router';
import { END } from 'redux-saga';

import axios from 'axios';
import { LOAD_HASHTAG_POSTS_REQUEST } from '../../reducers/post';
import PostCard from '../../components/PostCard';
import wrapper from '../../store/configureStore';
import { LOAD_MY_INFO_REQUEST } from '../../reducers/user';
import AppLayout from '../../components/AppLayout';

//--
const Hashtag = () => {
  const dispatch = useDispatch();   
  const router = useRouter();
  const { tag } = router.query;

  const {mainPosts ,hasMorePosts , loadPostsLoading } = useSelector(state => state.post);
  // const [mainPosts, setMainPosts] = useState([]);
  // const [hasMorePosts, setHasMorePosts] = useState(true);
  // const [loading, setLoading] = useState(true);
  // const [error, setError] = useState(null);
/*
  useEffect(() => {
    const fetchPosts = async () => {
      try {
        setLoading(true);
        const response = await axios.get(`http://localhost:3065/hashtag/${tag}`, { withCredentials: true });
        setMainPosts(response.data);
        setHasMorePosts(response.data.length > 0);
      } catch (err) {
        setError(err);
      } finally {
        setLoading(false);
      }
    };
    if (tag) { fetchPosts(); }
  }, [tag]);
*/
  //## 스크롤내려서 맨끝에서 다시 로딩
  useEffect(() => {
    const onScroll = () => {
      //  screenY  vs  pageYOffset
      //  screenY      :   현재창에서 마우스커서 Y
      //  pageYOffset  :   페이지를 스크롤 측정 Y
      if (window.pageYOffset + document.documentElement.clientHeight > document.documentElement.scrollHeight - 200) {
        // console.log(pageYOffset  , document.documentElement.clientHeight);
        if (hasMorePosts && !loadPostsLoading) {  //##
          dispatch({
            type: LOAD_HASHTAG_POSTS_REQUEST, 
            lastId: mainPosts[mainPosts.length - 1] && mainPosts[mainPosts.length - 1].id , 
            data : tag
          })
          /*axios.get(`http://localhost:3065/hashtag/${tag}?lastId=${mainPosts[mainPosts.length - 1]?.id}`, { withCredentials: true })
            .then((response) => {
              setMainPosts((prev) => [...prev, ...response.data]);
              setHasMorePosts(response.data.length > 0);
            }) .catch((err) => setError(err)); */
        }
      }
    };
    window.addEventListener('scroll', onScroll);
    return () => {
      window.removeEventListener('scroll', onScroll);  //스크롤했으면 스크롤했던거 remove, 메모리에 쌓임
    };
  }, [mainPosts.length, hasMorePosts, tag, loadPostsLoading]);

  // if (loading) { return <div> 해쉬태그 게시글 ing ...</div>; }
  // if (error) { return <div> error ...</div>; }

  return (
    <AppLayout>
      {mainPosts.map((post) => (
        <PostCard key={post.id} post={post} />
      ))}
    </AppLayout>
  );
};
///////////////////////////////////////////////////////////
export const getServerSideProps = wrapper.getServerSideProps(async (context) => { 
  //1. cookie 설정
  const cookie = context.req ? context.req.headers.cookie : '';
  axios.defaults.headers.Cookie = '';
  
  if (context.req  && cookie ) { axios.defaults.headers.Cookie = cookie;   }

  //2. redux 액션
  context.store.dispatch({ type: LOAD_MY_INFO_REQUEST}); 
  context.store.dispatch({ type: LOAD_HASHTAG_POSTS_REQUEST , data:context.params.tag });
  context.store.dispatch(END);

  await  context.store.sagaTask.toPromise();
}); 
///////////////////////////////////////////////////////////
export default Hashtag;