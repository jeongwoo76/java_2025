import React from 'react';
import AppLayout from '../components/AppLayout';
// import 'antd/dist/antd.css';
import PostForm from '../components/PostForm';
import PostCard from '../components/PostCard';
import Reply from '../components/Reply';

import { useSelector } from 'react-redux'; //##

const Home = () => {
  const { isLogin }   = useSelector( state => state.user);
  const { mainPosts } = useSelector( state => state.post);

  return(<AppLayout> 
    { isLogin && <PostForm /> }
    { mainPosts.map( ( c )=> { return(
      <PostCard   post={c}  key={c.id} /> 
    ); } )}
    <Reply/>
  </AppLayout>);
 };
export default Home;



