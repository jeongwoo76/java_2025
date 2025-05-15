const express = require('express');
const router = express.Router();
const bcrypt = require('bcrypt');
const passport = require('passport');
const { User, Post } = require('../models');
const { isLoggedIn, isNotLoggedIn } = require('./middlewares');

// 1. 회원가입
// post  :  localhost:3065/user/
// 설정1 :  Header   Content-Type : application/json
// 설정2 :  Body     -[Raw]   -[JSON]
// {  "email": "test@test.com",  "nickname": "test",  "password": "test" }
router.post('/', isNotLoggedIn, async(req, res, next) => {  // res.send('.... join');
  try{
  // 1. 이메일중복확인 sql - select : 객체.findOne
  const user = await User.findOne({where : {email : req.body?.email, }});
  // 2. 결과확인 - 존재하면 이미사용중인 아이디입니다.
  if (user) { return res.status(403).send('이미사용중인 아이디입니다.'); }
  // 3. 비밀번호 암호화
  const hashPassword = await bcrypt.hash(req.body.password, 12);  // 암호화강도 10~13
  // 4. 사용자 생성 객체.create
  await User.create({
    email : req.body.email,
    nickname : req.body.nickname,
    password : hashPassword,
  });
  // 5. 응답 - 회원가입 성공 ok
  res.status(201).send('회원가입완료!');
  } catch(error) {
    console.error(error);
    next(error);
  }
});


// 2. 로그인
// localhost:3065/user/login
router.post('/login', isNotLoggedIn, async(req, res, next) => { // res.send('.... login');
  passport.authenticate('local', ( err, user, info ) => { 
    // 1. err 오류처리
    if (err) { console.error(err); return next(err); }

    // 2. 인증정보있다면 - 세션 401 상태코드 ( 인증필요 )
    if (info) { return res.status(401).send(info.reason); }

    // 3. 사용자세션에 등록
    return req.login( user, async (loginErr) => {
      // 3-1. 로그인시 에러발생
      if (loginErr) { console.error(loginErr); return next(loginErr); }
      // 3-2. 사용자정보조회   ( sql - join )
      const fullUser = await User.findOne({   // sql : select
        where:{ id: user.id } , // 아이디를 이용해서 정보조회
        attributes: { exclude : ['password'] }, // password 제외하고 조회
        include: [{model: Post, attributes : ['id']}
                  ,{model: User, as:'Followings', attributes : ['id']}   // 사용자가 팔로우한   다른user id
                  ,{model: User, as:'Followers', attributes : ['id']}    // 사용자를 팔로우하는 다른user id
        ],   
      });
      return res.status(200).json(fullUser);
    });
  })(req, res, next);     // passport.authenticate() 의 반환값을 즉시실행 
}); 

//3. 로그인한 경우 사용자의 정보가져오기
// GET : localhost:3065/user

/*
3-1. router.get 이용해서 - 사용자정보페이지 출력 #
3-2. 1) 로그인사용자확인, 로그인한유저 정보반환
*/
router.get('/', isLoggedIn, (req, res, next) => {
  res.send('사용자정보조회');
});

module.exports = router;