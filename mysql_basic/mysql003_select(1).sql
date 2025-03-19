## ■ part001 복습문제

/*
Q1. milk 테이블의 구조는 다음과 같다 
mysql>
mysql> desc milk;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| mno    | int         | NO   | PRI | NULL    | auto_increment |
| mname  | varchar(20) | NO   |     | NULL    |                |
| mprice | int         | NO   |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
3 rows in set (0.04 sec)

mysql>
mysql> select * from milk;
+-----+-------+--------+
| mno | mname | mprice |
+-----+-------+--------+
|  1  | white |   1000 |
|  2  | choco |   1200 |
|  3  | banana|   1800 | 
+-----+-------+--------+
6 rows in set (0.03 sec)

  4 , melon ,  5000 데이터를 추가하시오.
insert into milk values (4, 'melon', 5000)
insert into milk (mnane, mprice) values  ('melon', 5000) 

 Q2.  no가 4번인 데이터의 mprice를 1500로 변경하시오.
update milk set mprice=1500 where mno=4;

 Q3.  no가 4번이고 name이 melon인데이터를 삭제하시오.
delete from milk where mno=4 and mname='melon';
 Q4.  milk 데이터를 출력하시오. 
 select * from milk;
 */
 
use mbasic;
show tables;
desc milk;
alter table milk drop mnum;
alter table milk drop mtotal;
insert into milk values(1,'white',1000);
insert into milk values(2,'choco',1200);
insert into milk values(3,'banana',1800);
#[Q1]
insert into milk values (4, 'melon', 5000);  
## 한줄 실행  ctrl + enter 
## 여러줄 실행 ctrl + shift + enter
#[Q2]
update milk set mprice=1500 where mno=4;
#[Q3]
delete from milk where mno=4 and mname='melon';
#[Q4]
select  * from milk;

## ■ part002 진도 -select basic
select * from userinfo;
-- 구조 + 데이터 복사
create table select_userinfo select * from userinfo;
desc select_userinfo;
alter table select_userinfo modify no int not null auto_increment primary key;

insert into userinfo values(5,'first',55);
insert into userinfo values(6,'third',66);

select * from select_userinfo;

##2-2  ctrl + enter 실행
-- 1. 전체 데이터 검색
select * from select_userinfo;
-- 2. 부분검색
select name, age from select_userinfo;
-- 3. 중복제거 (distinct)
select distinct name from select_userinfo;
-- 4. 별명 
select name as`이름`, age `나이` from select_userinfo;

-- 5. where 조건 (= 같다, != <> 다르다 , < <= > >=
select * from select_userinfo where name ='second';
select * from select_userinfo where name !='second';
select * from select_userinfo where name <>'second';

select * from select_userinfo where age <33;
select * from select_userinfo where age <=33;
select * from select_userinfo where age >33; 
select * from select_userinfo where age >=33;

-- 6. 모든조건 and , between and  / 조건중에 or  , in
select * from select_userinfo where age>=22 and age<=33;
select * from select_userinfo where age between 22 and 33;

select * from select_userinfo where age=22 or age=33;
select * from select_userinfo where age in (22,33);

-- 7. null 검색 (is null, is not null, not in, not between)
desc select_userinfo;
alter table select_userinfo modify age int;

select * from select_userinfo;
insert into select_userinfo (name) values ('seven');

## null 값이 비어있다라는 상태
select * from select_userinfo where age=null;  -- (X)
select * from select_userinfo where age!=null; -- (X)

select * from select_userinfo where age is null; 
select * from select_userinfo where age is not null; 

select * from select_userinfo where age not between 22 and 33;
select * from select_userinfo where age not in (22,33);

-- 8. like 문자열검색 ( like 'a%' , '%a', '%a%', '_a%'   )
select * from select_userinfo where name = 'first';
select * from select_userinfo where name like 'f%'; -- f로 시작
select * from select_userinfo where name like '%t'; -- t로 끝남
select * from select_userinfo where name like '%i%'; -- i 포함
select * from select_userinfo where name like '_e%'; -- 두번째글자e

#### select 연습문제
-- 실습0
select * from emp;
desc emp;
create table select_emp select * from emp; -- 구조 + 데이터복사
desc select_emp;
alter table select_emp modify empno int not null auto_increment primary key;
alter table select_emp change dept deptno int;
# 실습1 모든열 출력
select * from select_emp;
# 실습 2 deptno가 30 데이터 출력
select * from select_emp where deptno=30;
# 실습 3 deptno가 30이고 job이  SALESMAN인 데이터 조회
select * from select_emp where deptno=30 and job='SALESMAN';
# 실습 4 deptno가 30이거나 job이 CLERK인 데이터 조회
select * from select_emp where deptno=30 or job='CLERK';
# 실습 5 급여*12 값이 36000인 행을 조회
select * from select_emp where sal*12=36000;
# 실습 6 급여가 3000이상인 사원정보 조회
select * from select_emp where sal>=3000;
# 실습 7 사원의 첫문자가 F와 같거나 뒤쪽인 사원정보조회
select * from select_emp where ename >='F';
# 실습 8 사원의 이름이 ford 문자열보다 알파벳순서로 앞에있는행 출력
update select_emp set ename='MARTIN' where empno=7654;
select * from select_emp where ename <='FORD';
# 실습 9 != 이용하여 급여가 3000이 아닌 사원 데이터 조회
select * from select_emp where sal !=3000;
# 실습 10 <> 이용하여 급여가 3000이 아닌 사원데이터 조회
select * from select_emp where sal <>3000;
-- 실습 11
select * from select_emp where not sal=3000; 
select * from select_emp where sal not in(3000); 
-- 실습 12
select * from select_emp where job='MANAGER' or job='SALESMAN' or job='CLERK';
-- 실습 13
select * from select_emp where job in('MANAGER','SALESMAN','CLERK');
-- 실습 14
select * from select_emp where job !='MANAGER' and job!='SALESMAN' and job <>'CLERK';
-- 실습 15
select * from select_emp where job not in('MANAGER','SALESMAN','CLERK');
-- 실습 16
select * from select_emp where sal>=2000 and sal<=3000;
-- 실습 17
select * from select_emp where  sal between 2000 and 3000;
-- 실습 18
select * from select_emp where  sal not between 2000 and 3000;
-- 실습 19
select * from select_emp where  not (sal>=2000 and sal<=3000);
-- 실습 20
select * from select_emp where  empno=7499 and deptno=30;
-- 실습 21
select * from select_emp where  deptno= 20 or job='SALESMAN';
-- 실습 22
select * from select_emp where  sal>=2500 and job='ANALYST';
-- 실습 23
select * from select_emp where deptno in(10,20);
-- 24
select * from select_emp where deptno not in(10,20);
-- 25
select * from select_emp where ename like 'S%';
-- 26
select * from select_emp where ename like '_L%';
-- 27
select * from select_emp where ename like '%AM%';
-- 28
select * from select_emp where ename not like  '%AM%';
-- 29  숫자 + null 계산안됨.
select ename, sal, sal*12+comm `annsal`, comm from select_emp where ename like '%AM%';
-- 30
select * from select_emp where comm =null;  #  X
-- 31
select * from select_emp where comm is null;
-- 32
select * from select_emp where mgr is not null;
-- 33 null 값없어요 상태  등가비교연산자를 사용할수 없음
select * from select_emp where sal > null;
-- 34                           null     or   true => true
select * from select_emp where sal > null or comm is null;
-- 35
select * from select_emp where ename like '%S';
-- 36
select empno, ename, job, sal, deptno from select_emp where deptno=30 and job='SALESMAN';
-- 37
select empno, ename, job, sal, deptno from select_emp where deptno in(20,30) and sal>2000;
-- 38
select * from select_emp where sal<2000 or sal>3000;
select * from select_emp where not( sal>=2000 and sal<=3000);
-- 39
select ename, empno, sal, deptno from select_emp where deptno=30 and ename like '%E%' and sal not between 1000 and 2000;
-- 40
select * from select_emp where comm is null and mgr is not null and job in('MANAGER','CLERK') and ename not like '_L%';







