import {all, put, delay, fork, takeLatest, call} from 'redux-saga/effects';  //#1
import axios from 'axios';  //##

import {
  LOG_IN_REQUEST,
  LOG_IN_SUCCESS, 
  LOG_IN_FAILURE,

  LOG_OUT_REQUEST,
  LOG_OUT_SUCCESS,
  LOG_OUT_FAILURE,

  SIGN_UP_REQUEST,
  SIGN_UP_SUCCESS,
  SIGN_UP_FAILURE,

  CHANGE_NICKNAME_REQUEST,
  CHANGE_NICKNAME_SUCCESS,
  CHANGE_NICKNAME_FAILURE, 

  FOLLOW_REQUEST,
  FOLLOW_SUCCESS,
  FOLLOW_FAILURE,

  UNFOLLOW_REQUEST,
  UNFOLLOW_SUCCESS,
  UNFOLLOW_FAILURE

} from '../reducers/user';

///// step3)  login
function loginApi(data) {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.post('/user/login', data);
}
function* login(action) {
  
  try{
    const result = yield call ( loginApi, action.data );  // 처리함수, 처리파라미터
    //yield delay(1000);  // 1초
    yield put({
      type: LOG_IN_SUCCESS,
      data: result.data , // action.data // 
    })
  } catch(error) {
    yield put({
      type:LOG_IN_FAILURE,
      data:error.response.data
    })
  }
}
// logout 
function logoutApi() {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.post('/user/logout');
}
function* logout() {
  
  try{
    const result = yield call ( logoutApi );   // 처리함수, 처리파라미터
    // yield delay(1000);  
    yield put({
      type:LOG_OUT_SUCCESS,
    })
  } catch(error) {
    yield put({
      type:LOG_OUT_FAILURE,
      data:error.response.data
    })
  }
} 
// signUp 
function signUpApi(data) {   //*  function* (X)   - 서버에 넘겨주는 값
  return axios.post('/user/', data);        //    /user 경로, post, 회원가입정보(data)
}
function* signUp(action) {
  try{
    const result = yield call ( signUpApi, action.data );   // 처리함수, 처리파라미터   // 사용자가 화면에서 넘겨준값
    console.log(result);
    // yield delay(1000);  
    yield put({
      type:SIGN_UP_SUCCESS,
    })
  } catch(error) {
    yield put({
      type:SIGN_UP_FAILURE,
      data:error.response.data
    })
  }
} 

// changeNickname
function changeNicknameApi(data) {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.POST('/user/nickname', {nickname : data});
}
function* changeNickname(action) {
  try{
    yield delay(1000);  
    yield put({
      type: CHANGE_NICKNAME_SUCCESS,
      data: action.data
    })
  } catch(error) {
    yield put({
      type: CHANGE_NICKNAME_FAILURE,
      data: error.response.data
    })
  }
} 

///// step2) ACTION 기능추가
function* watchLogin() {
  yield takeLatest(LOG_IN_REQUEST, login );  // LOG_IN 액션이 실행될때까지 기다리기
}
function* watchLogout() { 
  yield takeLatest(LOG_OUT_REQUEST , logout );
}
function* watchSignup() {   
  yield takeLatest(SIGN_UP_REQUEST , signUp );    // 요청 10 -> 응답1
}
function* watchChangeNickname() {   
  yield takeLatest(CHANGE_NICKNAME_REQUEST , changeNickname );    // 요청 10 -> 응답1
}

///// step1) all()
export default function* userSaga() {
  yield all([   // all - 동시에 배열로 받은 fork들을 동시에 실행
    fork(watchLogin) ,  // fork - generator 함수들을 실행해줌.
    fork(watchLogout) ,
    fork(watchSignup) , // 7.  ##
    
    fork(watchChangeNickname) ,

  ]);
} 
 


