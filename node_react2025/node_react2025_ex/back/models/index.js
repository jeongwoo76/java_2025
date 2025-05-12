const Sequelize = require('sequelize');

const env = Process.env.NODE_ENV || 'development';
const config = require('../config/config')[env];
const db = {}; // 객체를 생성해서 객체저장공간만들기

const Sequelize = new Sequelize(config.database, config.username, config.password, config);
// db, username, password, config 설정정보이용해서 인스턴스 생성

db.sequelize = sequelize; // 인스턴스
db.Sequelize = Sequelize; // Sequelize 라이브러리 db객체에 저장

module.exports =db;   // 다른파일에서도 db 사용가능하게
