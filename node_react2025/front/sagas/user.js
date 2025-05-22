import {all, put, delay, fork, takeLatest} from 'redux-saga/effects';  //#1

///// step3) 
function loginApi(data) {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.POST('/user/login', data);
}
function* login(action) {
  // const result = yield call ( loginApi, action.data ); 처리함수, 처리파라미터
  try{
    yield delay(1000);  // 1초
    yield put({
      type:'LOG_IN_SUCCESS',
      data:action.data    // result.data
    })
  } catch(error) {
    yield put({
      type:'LOG_IN_FAILURE',
      data:error.response.data
    })
  }
}
// -- 
function logoutApi() {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.POST('/user/logout');
}
function* logout() {
  // const result = yield call ( logoutApi );   처리함수, 처리파라미터
  try{
    yield delay(1000);  
    yield put({
      type:'LOG_OUT_SUCCESS',
      data:result.data    // result.data
    })
  } catch(error) {
    yield put({
      type:'LOG_OUT_FAILURE',
      data:errorToJSON.response.data
    })
  }
} 


///// step2) ACTION 기능추가
function* watchLogin() {
  yield takeLatest('LOG_IN_REQUEST', login );  // LOG_IN 액션이 실행될때까지 기다리기
}
function* watchLogout() { 
  yield takeLatest('LOG_OUT_REQUEST' , logout );
}

///// step1) all()
export default function* userSaga() {
  yield all([   // all - 동시에 배열로 받은 fork들을 동시에 실행
    fork(watchLogin) ,  // fork - generator 함수들을 실행해줌.
    fork(watchLogout) ,
  ]);
} 
 


