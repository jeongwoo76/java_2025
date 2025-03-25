## 2025.03.25 복습문제
use mbasic;
show tables;
desc userinfo;
desc group_userinfo;
create table sub_userinfo select * from group_userinfo;
desc sub_userinfo;
alter table sub_userinfo modify no int not null auto_increment primary key;
select * from sub_userinfo;

/*
1. 서브쿼리
- select 구문안에 select 구문 
- 서브쿼리 결과가 하나이상이 반환시 in, any, all 사용

2. 형식
select 컬럼 from 테이블명 where 컬럼 in ( select 문);

*/
/*
-- BASIC1. 평균나이 이상인 레코드를 추출하시오.
+----+--------+-----+------+------+------+------+------+------+
| no | name   | age | sex  | kor  | eng  | math | ban  | sns  |
+----+--------+-----+------+------+------+------+------+------+
|  4 | fourth |  44 | f    |   40 |   42 |   67 | C    | n    |
|  5 | fifth  |  55 | f    |   89 |   86 |   99 | B    | y    |
|  6 | sixth  |  66 | m    |   10 |   20 |   44 | C    | n    |
+----+--------+-----+------+------+------+------+------+------+
3 rows in set (0.02 sec)
*/

#1-1. 평균나이 이상인 레코드를 추출하시오.
-- select * from sub_userinfo where age>= 평균나이
#1-2. 평균나이
-- select avg(age) from sub_userinfo;
#1-3. 1+2
select * from sub_userinfo where age>= (select avg(age) from sub_userinfo);

/*
-- BASIC2. first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오.
+------+-------+------+------+------+
| ban  | name  | kor  | eng  | math |
+------+-------+------+------+------+
| A    | first |  100 |  100 |   99 |
| A    | third |   90 |   92 |   97 |
+------+-------+------+------+------+
2 rows in set (0.00 sec)

2-1 first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오.
2-2 first의 반
2-3 1+2
*/
select ban, name, kor, eng, math from sub_userinfo where ban=first반;
select ban from sub_userinfo where name='first';

select ban, name, kor, eng, math from sub_userinfo 
where ban=(select ban from sub_userinfo where name='first');

/*
-- BASIC3. first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
+------+---------+---------+---------+
| ban  | kor     | eng     | math    |
+------+---------+---------+---------+
| A    | 95.0000 | 96.0000 | 98.0000 |
+------+---------+---------+---------+

3-1 first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
3-2 first 반
3-3 1+2
*/
select ban, avg(kor), avg(eng), avg(math) 
from sub_userinfo 
where ban=first반
group by ban;

select ban from sub_userinfo where name ='first';

select ban, avg(kor), avg(eng), avg(math) 
from sub_userinfo 
where ban=(select ban from sub_userinfo where name ='first')
group by ban;

## 연습문제 1~13

-- 1 
select * from emp;
select sal from emp where ename='JONES';
-- 2
select * from emp where sal >2975;
-- 3
-- 3-1 select * from emp where sal > 'JONES'급여
-- 3-2 select sal from emp where ename = 'JONES'; 
-- 3-3
select * from emp where sal > (select sal from emp where ename = 'JONES');
-- 4
-- select * from emp where hiredate < 'scott'입사날짜 
select hiredate from emp where ename = 'scott';
select * from emp where hiredate < (select hiredate from emp where ename = 'scott');
-- 5
show tables;
select * from dept;
select empno, ename, job, sal, deptno, dname, loc 
from emp natural join dept;
select avg(sal) from emp;

select empno, ename, job, sal, deptno, dname, loc 
from emp natural join dept
where deptno=20 and sal> (select avg(sal) from emp) 
order by empno desc;
-- 6
select * from emp
where deptno in(20,30);
-- 7 
select max(sal) from emp
group by deptno
order by max(sal) desc;
-- 8
-- 8-1 
-- select * from emp where sal in(각부서별 최고급여);
-- 8-2 각부서별 최고급여
select max(sal) from emp group by deptno;
-- 8-3  1+2
select * from emp where sal in(select max(sal) from emp group by deptno);

/*
1. 다중행 연산자 
-  in, any(some), all
2. in  : 서브쿼리의 결과가 하나라도 일치하면 true
3. any : 서브쿼리의 결과가 하나이상이면 true
4. all : 서브쿼리의 결과가 모두 만족하면 true

2. any : 하나라도 일치하면 참 (선한개)
컬럼명 < any(1,2,3)   ←←←|1  ←←|2   ←|3   최대값보다 작다
컬럼명 > any(1,2,3)   1|→  2|→→   3|→→→   최소값보다 크다

3. all : 모두가 일치하면 참 (선 3개)
컬럼명 < all(1,2,3)   ←←←|1  ←←|2   ←|3    최소값보다 작다
컬럼명 > all(1,2,3)   1|→  2|→→   3|→→→    최대값보다 크다

*/

create table atest as 		  select 1 num from dual
				   union all  select 2     from dual
				   union all  select 3     from dual
				   union all  select 4     from dual
				   union all  select 5     from dual
				   union all  select 6     from dual;
                   
select * from atest;

select num from atest where num < any(select num from atest where num in(3,4,5)) order by num;
-- 최대값보다 작다 			5보다 작다 -> 결과값 1,2,3,4
select num from atest where num > any(select num from atest where num in(3,4,5)) order by num;
-- 최소값보다 크다			3보다 크다 -> 결과값 4,5,6
select num from atest where num < all(select num from atest where num in(3,4,5)) order by num;
-- 최소값보다 작다(all #) 	3보다 작다 -> 결과값 1,2
select num from atest where num > all(select num from atest where num in(3,4,5)) order by num;
-- 최대값보다 크다(all #)   5보다 크다 -> 결과값 6

-- 9
select * from emp where sal = any (select max(sal) from emp group by deptno);
-- 10
select * from emp where sal = some (select max(sal) from emp group by deptno);
-- 11
select sal from emp where deptno =30;
-- 12 ## 문제수정!!
-- any 최대값보다 작다 # 2850 / 최소값보다 크다 (1600 ,1250, 2850, 1500, 950)
-- all 최소값보다 작다 / 최대값보다 크다
-- 12-1. emp테이블에서 부서번호가 30인 사원의 급여를 조회하시오 (1600 ,1250, 2850, 1500, 950)
-- 12-2. 부서번호가 30인 사원의 최대급여보다 작은 급여를  받는 사원의 데이터를 조회하시오.
select * from emp where sal < any(select sal from emp where deptno=30) order by sal; 
-- 13
select * from emp where sal > any (select sal from emp where deptno=30) order by sal desc;

use mbasic;
show tables;
create table member (
no int not null auto_increment primary key,
name varchar(100) not null,
pass varchar(50) not null
);
desc member;
select * from member;
insert into member (name, pass) values ('first', '11');
insert into member (name, pass) values ('second', '22');
insert into member (name, pass) values ('third', '33');
insert into member (name, pass) values ('fourth', '44');








 