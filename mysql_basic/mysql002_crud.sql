#1. rdb : 관계형데이터베이스 - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
#2. 데이터베이스 언어
# 정의어 DDL - create, alter, drop
# 조작어 DML - insert, select, update, delete - crud
# 제어어 DCL - grant, revoke 

#실습1) insert
use mbasic;
show tables;
desc userinfo;

#1-1 table 구조와 순서를 알고 있을때 
/*
mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
dml : insert, select, update, delete
*/

insert into userinfo values (1, 'first', 11);
insert into userinfo values ('second', 22, 2); # 필드 순서 안맞음!
# Error Code: 1366. Incorrect integer value: 'second' for column 'no' at row 1	0.000 sec
select * from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo (name, age) values ('second', 22);
# 1 row(s) affected	

insert into userinfo (age, name) values (33, 'third');
select * from userinfo;

use mbasic;
show tables;
desc emp;

insert into emp values(7369 , 'SMITH'  , 'CLERK'     , 7902 , '1980-12-17' ,  800 , NULL ,   20);
insert into emp values(7499 , 'ALLEN'  , 'SALESMAN'  , 7698 , '1981-02-20' , 1600 ,  300 ,   30);
insert into emp values(7521 , 'WARD'   , 'SALESMAN'  , 7698 , '1981-02-22' , 1250 ,  500 ,   30);
insert into emp values(7566 , 'JONES'  , 'MANAGER'   , 7839 , '1981-04-02' , 2975 , NULL ,   20);
insert into emp values(7654 , 'ARTIN'  , 'SALESMAN'  , 7698 , '1981-09-28' , 1250 , 1400 ,   30);
insert into emp values(7698 , 'BLAKE'  , 'MANAGER'   , 7839 , '1981-05-01' , 2850 , NULL ,   30);
insert into emp values(7782 , 'CLARK'  , 'MANAGER'   , 7839 , '1981-06-09' , 2450 , NULL ,   10);
insert into emp values(7788 , 'SCOTT'  , 'ANALYST'   , 7566 , '1987-04-19' , 3000 , NULL ,   20);
insert into emp values(7839 , 'KING'   , 'PRESIDENT' , NULL , '1981-11-17' , 5000 , NULL ,   10);
insert into emp values(7844 , 'TURNER' , 'SALESMAN'  , 7698 , '1981-09-08' , 1500 ,    0 ,   30);
insert into emp values(7876 , 'ADAMS'  , 'CLERK'     , 7788 , '1987-05-23' , 1100 , NULL ,   20);
insert into emp values(7900 , 'JAMES'  , 'CLERK'     , 7698 , '1981-12-03' ,  950 , NULL ,   30);
insert into emp values(7902 , 'FORD'   , 'ANALYST'   , 7566 , '1981-12-03' , 3000 , NULL ,   20);
insert into emp values(7934 , 'MILLER' , 'CLERK'     , 7782 , '1982-01-23' , 1300 , NULL ,   10);
select * from emp;

desc dept;
insert into dept values(10 , 'ACCOUNTING' , 'NEWYORK');
insert into dept values(20 , 'RESEARCH'   , 'DALLAS' );
insert into dept values(30 , 'SALES'      , 'CHICAGO');
insert into dept values(40 , 'OPERATIONS' , 'BOSTON' );
select * from dept;


desc salagrade;
insert into salagrade values(1 ,   700 ,  1200);
insert into salagrade values(2 ,  1201 ,  1400);
insert into salagrade values(3 ,  1401 ,  2000);
insert into salagrade values(4 ,  2001 ,  3000);
insert into salagrade values(5 ,  3001 ,  9999);
select * from salagrade;
alter table salagrade rename salgrade;

select * from salgrade;

#실습2) update
/*
		update 테이블명 
		set    필드1 = 값1, 필드2 = 값2
		where  조건
*/

-- 데이터 준비
desc userinfo;
insert into userinfo (name, age) values ('fourth', 44);
select * from userinfo;

#2-1. 전체데이터 수정
set sql_safe_updates=0; -- error code 1175
update userinfo set age =0;
select * from userinfo;

#2-2. 바꿀데이터 여러개
update userinfo set age=11 where no=1;
update userinfo set age=22, name='two' where no=2;
update userinfo set name='second' where no=2 and age=22;

#- no가 3이고 age가 10인  유저의 이름을 'third' , 나이를 33살로 수정합니다.
#- no가 4이고 name 'first'인  유저의 이름을 'fourth' , 나이를 44살로 수정합니다.

update userinfo set name='third' , age=33 where  age=10;
update userinfo set name='fourth' and age=44 where no=4 and name='first';
-- 조건이 안맞으면 반영X 
update userinfo set age=33 where name='third';
update userinfo set age=44 where name='fourth';

select * from userinfo;

#2-3 연습문제 
desc score;

insert into score values (1,'aaa',100,100,100,100,NULL,NULL,'NULL'); 
insert into score values (2,'bbb',90,98,88,100,NULL,NULL,'NULL');
insert into score values (3,'ccc',70,20,78,80,NULL,NULL,'NULL');
insert into score values (4,'ddd',78,89,68,98,NULL,NULL,'NULL');
insert into score values (5,'abc',89,98,69,77,NULL,NULL,'NULL');
#[001]
update score set sjava=90, sjsp=90, sspring=90 where sname='ccc';
#[002]
update score set semail='admin@gmail.com'; 
#[003]
update score set sstotal=sjava+sjsp+sspring+sproject;
#[004]
alter table score modify ssavg double;
update score set ssavg=sstotal/4;
desc score;
select * from score;
#[005]
update score set semail='first@gmail.com' where ssavg=100;
#[006]
update score set sjava=92, sjsp=78,sstotal=sjava+sjsp+sspring+sproject, ssavg=sstotal/4 where sname='bbb';
#[007]
update score set semail='second@gmail.com', sname='second' where ssavg=89.5;
select * from score;
#[008]
update score set semail='ccc@gmail.com' where sname='ccc';
#[009]
update score set semail='blackstudent@gmail.com' where sproject<80;
#[010]   -- 조건식 맞는데이터가 없으면 수정이 안됨!
update score set semail='hello@gmail.com' where ssavg=89.5 and sproject=98;


#실습3) delete
/*
	delete from 테이블명 
    where 조건식
*/


-- 준비  구조 + 데이터복사
create table userinfo_delete select * from userinfo;
alter table userinfo_delete add primary key(no);
alter table userinfo_delete modify no int not null auto_increment;

desc userinfo_delete;
select * from userinfo_delete;

#3-1 age가 11인 유저 삭제
delete from userinfo_delete where age=11;
select * from userinfo_delete;   #ctrl +enter

#이름이 second이고 나이가 22살인 유저
delete from userinfo_delete where name='second' and age=22;

#전체데이터삭제
delete from userinfo_delete;


#3-2 연습문제

-- emp 테이블을 구조 +데이터복사해서 emp_del 준비

create table emp_del select * from emp;
alter table emp_del modify empno int not null auto_increment primary key;
desc emp_del;
select * from emp_del;

#[001] [TABLE : emp_del] (직책(JOB)이  'SALESMAN'인 데이터를 삭제하시오.  ) 
delete from emp_del where job='SALESMAN';
select * from emp_del;

#[002] [TABLE : emp_del] (직책(JOB)이  'MANAGER'이고  이름(ENAME)이 'JONES'인 데이터를 삭제하시오.  ) 
delete from emp_del where job='MANAGER' and ename='JONES';
select * from emp_del;
#[003] [TABLE : emp_del] (emp_del 테이블의 모든 데이터를 삭제하시오. ) 
delete from emp_del;
select * from emp_del;