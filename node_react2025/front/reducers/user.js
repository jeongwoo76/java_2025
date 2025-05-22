//    [reducers] -user.js
// step1) 초기값
export const initialState = {
    logInLoading: false,  // 로그인 시도중  - 로딩창
    logInDone: false, 
    logInError: null, 

    logOutLoading: false,  // 로그아웃 시도중  - 로딩창
    logOutDone: false, 
    logOutError: null, 

    user: null, 
    signupDate: {},
    LoginData : {}
};

// step2) 로그인할때마다 설정 함수
export const loginAction  = ( data ) => { 
  return { type:'LOG_IN_REQUEST' , data,  }
};

export const logoutAction = { 
      type:'LOG_OUT_REQUEST', 
};


// step3) 이전 + 상태 = 다음상태
export default ( state=initialState, action  ) => { 
  switch(action.type) { 
    case 'LOG_IN_REQUEST':    // 액션
      return {
        ... state,    // 이전상태
        logInLoading: true,  // 로그인 시도중  - 로딩창
        logInDone: false, 
        logInError: null, 
      }
    case 'LOG_IN_SUCCESS':    // 액션
      return {
        ... state,    // 이전상태
        logInLoading: false,  // 로그인 시도중  - 로딩창
        logInDone: true, 
        user : { ...action.data, nickname:'jw' } 
      }
    case 'LOG_IN_FAILURE':    // 액션
      return {
        ... state,    // 이전상태
        logInLoading: false,  // 로그인 시도중  - 로딩창
        logInError: action.error, 
      }  
    case 'LOG_OUT_REQUEST':    // 액션
      return {
        ... state,    // 이전상태
        logOutLoading: true,  // 로그아웃 시도중  - 로딩창
        logOutDone: false, 
        logOutError: null, 
      }
    case 'LOG_OUT_SUCCESS':    // 액션
      return {
        ... state,    // 이전상태
        logOutLoading: false,  // 로그아웃 시도중  - 로딩창
        logOutDone: true, 
        user : null
      }
    case 'LOG_OUT_FAILURE':    // 액션
      return {
        ... state,    // 이전상태
        logOutLoading: false,  // 로그아웃 시도중  - 로딩창
        logOutError: action.error, 
      }  
      default:
      return { ...state }
  }
};