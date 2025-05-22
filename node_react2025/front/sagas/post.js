import {all, delay, fork, takeLatest} from 'redux-saga/effects';  //#1

///// step3) 
function addpostApi(data) {   //*  여기는 generator 함수가 아니라서 * 빠짐  function* (X)  
  return axios.POST('/post');
}
function* addpost(action) {
  // const result = yield call ( addpostApi, action.data);   처리함수, 처리파라미터
  try{
    yield delay(1000);  
    yield put({
      type:'ADD_POST_SUCCESS',
      data:result.data    // result.data
    })
  } catch(error) {
    yield put({
      type:'ADD_POST_FAILURE',
      data:error.response.data
    })
  }
} 

///// step2) ACTION 기능추가
function* watchAddPost() { 
  // yield take('ADD_POST' , addpost );              // ver-1. take는 일회용 - 로그인1번, 게시글도1번만
  yield takeLatest('ADD_POST' , addpost );           // ver-2. 3번요청 → 응답 1번
  // yield throttle('ADD_POST' , addpost, 10000 );   // ver-3. 몇초뒤에 실행, 시간설정가능 -10초뒤에
}

///// step1) all()
export default function* postSaga() {
  yield all([   // all - 동시에 배열로 받은 fork들을 동시에 실행
    fork(watchAddPost) ,  // fork - generator 함수들을 실행해줌.
  ]);
} 
 


