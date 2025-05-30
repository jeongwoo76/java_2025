
import React, { useEffect, useState} from 'react';
import { useRouter } from 'next/router';
import axios from 'axios';

import AppLayout from '../../components/AppLayout';
import PostCard from '../../components/PostCard';


const Hashtag = () => {
    const router = useRouter();   // router
    const { tag } = router.query;   // query
    const [ mainPosts     , setMainPosts ] = useState([]);
    const [ hasMorePosts  , setHasMorePosts ] = useState(true); 
    const [ loading       , setLoading ] = useState(true);
    const [ error         , setError ] = useState(null);
  /////////////////////////// code
   useEffect( () => {
    ///////// axios
      const fetchData = async () => { 
      try{
        setLoading(true);

        const response = await axios.get(`http://localhost:3065/hashtag/${tag}`, {withCredentials:true}
        );
        setMainPosts(response.data);
        setHasMorePosts(response.data.length>0);
      } catch (err) {
          setError(err);
      } finally { 
          setLoading(false);
      } 
      };
      if(tag){ fetchData(); }
    }, [tag]);


  //## 스크롤내려서 맨끝에서 다시 로딩
    useEffect(()=> {
      const onScroll = () => {
        /// screenY vs pageYOffset
        //  screenY : 현재창에서 마우스커서 Y
        //  pageYOffset : 페이지를 스크롤 측정 Y  
         //            내가 내린길이    + 화면에 보이는 높이  >   브라우저길이-200px 아래정도로 오면은
         if( window.pageYOffset + document.documentElement.clientHeight > document.documentElement.scrollHeight - 200) { 
            if(hasMorePosts && !loading) {
              axios.get(`http://localhost:3065/hashtag/${tag}?lastId=${mainPosts[mainPosts.length-1]?.id}`, {withCredentials:true})
                .then((response) => {
                  setMainPosts((prev) => [...prev, ...response.data]);
                  setHasMorePosts( response.data.length>0);
                })
                .catch((err) => setError(err));
            }
          } 
      }
      window.addEventListener('scroll', onScroll);
      return () => {
        window.removeEventListener('scroll', onScroll);  // 스크롤했으면 스크롤했던거 remove, 메모리에 쌓임
      }
    } , [mainPosts, hasMorePosts, tag, loading]);

    if( loading ){ return <div>해시태그 게시글 ing ...</div>; }
    if( error ){ return <div>error ...</div>; }

  /////////////////////////// view
  return(<AppLayout> 
    { mainPosts.map((c)=> { 
      return( <PostCard   post={c}  key={c.id} /> ); } )}
  </AppLayout>);
};

export default Hashtag;