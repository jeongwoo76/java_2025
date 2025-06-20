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


create database node_react_test;
use node_react_test;

use node_react;
show tables;
select * from users;
select * from posts;
select * from hashtags;
select * from images;
select * from follow;


desc `like`;
select * from `like`;
select * from comments;
desc comments;


SET SQL_SAFE_UPDATES = 0;
DELETE FROM posts;
delete from users;
DELETE FROM categories;
DELETE FROM myprizes;
DELETE FROM issuedrandomboxes; 
DELETE FROM authorities;
SET SQL_SAFE_UPDATES = 1;


drop database ssdam;


create database ssdam;
use ssdam;
show tables;

select * from users;
select * from categories;
select * from animals;
select * from posts;
select * from prizes;
select * from myprizes;
select * from issuedrandomboxes;


ALTER TABLE myprizes ADD COLUMN barcode VARCHAR(255);



desc users;
desc animals; 
desc myPrizes;

DESCRIBE Categories;



ALTER TABLE Prizes DROP COLUMN type;

ALTER TABLE MyPrizes MODIFY COLUMN dueAt DATETIME NULL;

SHOW INDEX FROM MyPrizes;
ALTER TABLE MyPrizes DROP INDEX MyPrizes_PrizeId_UserId_unique;

SELECT
  CONSTRAINT_NAME,
  TABLE_NAME,
  COLUMN_NAME,
  REFERENCED_TABLE_NAME,
  REFERENCED_COLUMN_NAME
FROM
  information_schema.KEY_COLUMN_USAGE
WHERE
  TABLE_NAME = 'MyPrizes'
  AND TABLE_SCHEMA = 'ssdam';

SHOW CREATE TABLE MyPrizes;
SHOW INDEX FROM MyPrizes;

ALTER TABLE MyPrizes DROP FOREIGN KEY myprizes_ibfk_1;
ALTER TABLE MyPrizes DROP FOREIGN KEY myprizes_ibfk_2;

ALTER TABLE MyPrizes DROP INDEX MyPrizes_PrizeId_UserId_unique;

ALTER TABLE myPrizes
ADD CONSTRAINT fk_myprizes_user FOREIGN KEY (UserId) REFERENCES Users(id),
ADD CONSTRAINT fk_myprizes_prize FOREIGN KEY (PrizeId) REFERENCES Prizes(id);

ALTER TABLE prizes
CHANGE COLUMN createAt createdAt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
CHANGE COLUMN updateAt updatedAt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;




use mbasic;
show tables;
desc emp;
select * from emp;
select * from EMP WHERE ename='SMITH';
select * from EMP WHERE job='clerk';

create table users (userid  varchar(50) not null  , userpw  varchar(100) not null, enabled  char(1) , primary key(userid) );  
create table authorities (userid  varchar(50) not null  , auth   varchar(50) not null );
insert into users (userid, userpw ) values ('first'  , '1111');
insert into users (userid, userpw ) values ('second' , '2222');

insert into authorities (userid, auth ) values ('first'  , 'ADMIN');
insert into authorities (userid, auth ) values ('first'  , 'MEMBER');
insert into authorities (userid, auth ) values ('second' , 'MEMBER');

select * from users;
select * from authorities;


select 	m.userid, userpw, auth
from	users	m	,	authorities a
where	m.userid = a.userid and m.userid='first';

select 	m.userid, userpw, auth
from	users	m	natural join	authorities a	
where	m.userid='first';

select 	m.userid, userpw, auth
from	users	m	left join	authorities a	using( userid ) 
where	m.userid='first';

select 	m.userid, userpw, auth
from	users	m	left join	authorities a	on m.userid = a.userid
where	m.userid='first';



create database thejoa;
use thejoa;
show tables;
desc board;
desc member;
desc member_board;
select * from board;
select * from member;
select * from member_board;










