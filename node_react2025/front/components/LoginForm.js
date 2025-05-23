import React, { useState, useCallback } from 'react';
import { Input, Button, Form, Row, Col} from 'antd';
import Link from 'next/Link';
import Password from 'antd/lib/input/Password';
import userInput from '../hooks/userInput';
import { loginAction } from '../reducers/user';    //#1. redux
import { useDispatch, useSelector } from 'react-redux';    //#2. redux - useDispatch

// const LoginForm = ({setIsLogin}) => {
  const LoginForm = () => { //#3. redux

  const { logInLoading } = useSelector(  (state) => state.user );    
  //////////////////////////////////////////////////// code
  const [id, onChangeId] = userInput('');
  const [password, onChangePassword] = userInput('');   // userInput 줄이기

  const dispatch = useDispatch();   //#4. redux

  const onSubmitForm = useCallback(() => { // 컴포넌트가 처음 렌더링될때 한번만 생성
      console.log(".......", id, password);
    //  setIsLogin(true);
    dispatch( loginAction({id, password}) );    //#5. redux
  }, [id, password]);     //id, password 값이 변경될때  

  //////////////////////////////////////////////////// view
  return ( 
  <>
    <Form layout="vertical" style={{ padding:'3%'}} onFinish={onSubmitForm}  >
      <Form.Item label="아이디" name="id"  >
        <Input placeholder="user@gmail.com 형식으로 입력" 
              value={id} onChange={onChangeId}  required />
      </Form.Item>
      <Form.Item label="비밀번호" name="password"  >
        <Input.Password  placeholder="비밀번호 입력" 
                        value={password} onChange={onChangePassword} required />
      </Form.Item>
      <Form.Item style={{textAlign:'center'}}>
      {/*<Button type="primary" style={{marginRight:'2%'}} onClick={onCount} >로그인 {count}</Button>*/}

      <Button type="primary" 
      style={{marginRight:'2%'}} 
      htmlType='submit'
      loading={logInLoading}
      >로그인</Button>
      
      <Link href="/signup" legacyBehavior><a><Button>회원가입</Button></a></Link>
      </Form.Item>
    </Form>
  </>
);
};

export default LoginForm;