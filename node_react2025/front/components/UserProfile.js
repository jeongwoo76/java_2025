import React, { useCallback } from 'react'
import { Card, Avatar, Button } from 'antd';
import styled from 'styled-components';
import Link from 'next/Link';

import { useDispatch, useSelector } from 'react-redux';  //## 2. redux
//import { logoutAction } from '../reducers/user';   //##### 1. redux
import { LOG_OUT_REQUEST } from '../reducers/user';

const ButtonWrapper = styled.div`
     margin-top:5%;
`;

//const UserProfile = ({setIsLogin}) => {
const UserProfile = () => {    //## 3. redux

  const { logOutLoading, user } = useSelector(state => state.user); // 중앙저장소
  ////////////////////////// code
  const dispatch = useDispatch();
  const onLogout = useCallback(() => {
    //dispatch(logoutAction);
    dispatch({ type: LOG_OUT_REQUEST })
  }, []);
  ////////////////////////// view
  return (<Card
    actions={[
      <div key="sns"><Link href={`/user/${user.id}`}>
        <span>게시글<br /> {user.Posts ? user.Posts.length : 0}</span>
        </Link></div>
      , <div key="followings"><Link href={`/profile`}>
        <span>팔로잉<br />{user.Followings ? user.Followings.length : 0}</span>
        </Link></div>
      , <div key="followers"><Link href='/profile'>   {/* 이것도 가능*/} 
        <span> 팔로워<br />{user.Followers ? user.Followers.length : 0}</span>
        </Link></div>
    ]}
  >
    <Card.Meta avatar={<Avatar>{user.nickname[0]}</Avatar>}
      title={user.nickname} />
    <ButtonWrapper>
      <Button onClick={onLogout} loading={logOutLoading} >로그아웃</Button>
    </ButtonWrapper>
  </Card>);
};

export default UserProfile;