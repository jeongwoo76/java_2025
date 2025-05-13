const express = require('express');
const router = express.Router();

router.post('', (req, res) => {res.send('회원가입')});

router.post('/login', (req, res) => {res.send('로그인')});

router.get('', (req, res) => {res.json([
  { id:1, email:'one@gmail.com'}
 ]);
});

router.post('/logout', (req, res) => {res.send('로그아웃')});

module.exports = router; 