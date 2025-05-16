use mbasic;
create table board (
bno int not null auto_increment primary key,
btitle varchar(1000) not null,
bcontent text not null,
bname varchar(100) not null,
bhit int default 0,
bdate timestamp not null default current_timestamp,
bip	varchar(100) not null );
desc board;

create table sboard (
bno int not null auto_increment primary key,
bname varchar(100) not null,
bpass varchar(50) not null,
btitle varchar(1000) not null,
bcontent text not null,
bdate timestamp not null default current_timestamp,
bhit int not null default 0,
bip	varchar(50) not null );
desc sboard;
alter table sboard modify bhit int not null default 0;
select * from sboard;

create database myboot;
use myboot;
show tables;
desc team;
select * from team;

drop database yoonlee3;
create database yoonlee3;
use yoonlee3;
show tables;
drop table follow;
drop table user;

ALTER DATABASE yoonlee3
CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


ALTER TABLE diary CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER DATABASE yoonlee3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

SHOW VARIABLES LIKE 'character_set%';
SHOW VARIABLES LIKE 'collation%';

SELECT DATABASE();

ALTER TABLE your_database_name.diary CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

create database mytest;
use mytest;
show tables;
create table board (
id bigint not null auto_increment primary key,
btitle varchar(200) ,
bcontent text ,
bpass varchar(255) ,
bhit bigint ,
create_date datetime(6) ,
bip	varchar(255) );
desc board;
select * from board;


desc member;


drop database node_react;
create database node_react;


use node_react;
show tables;
select * from users;
select * from posts;
select * from hashtags;
select * from images;

desc `like`;
select * from `like`;
select * from comments;




