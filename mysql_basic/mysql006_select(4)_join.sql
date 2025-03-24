use mbasic;
show tables;
-- Q1
create table join_userban (
no int not null auto_increment primary key,
name varchar(20) not null,
ban char(2) );
desc join_userban;
-- Q2
select * from join_userban;
insert into join_userban values (1,'first','A');
insert into join_userban values (2,'second','B');
insert into join_userban values (3,'third','A');
insert into join_userban values (4,'fourth','C');
insert into join_userban values (5,'fifth','B');
insert into join_userban values (6,'sixth','C');
insert into join_userban values (7,'fifth','B');
insert into join_userban values (8,'sixth','C');
-- Q3
update join_userban set ban='D' where no>=7;
-- Q4
delete from join_userban where no>=7;
-- Q5
select ban, count(*) `학생수`
from join_userban
group by ban;

## 데이터베이스언어 ★
# DDL - create, alter, drop
# DML - insert, select #, update, delete
# DCL - grant, revoke

# e(entity:테이블) r(relation:관계) 속성:pk, fk
# join ★
-- 두개이상의 테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리 (pk, fk)

# 종류 :inner join, outer join
desc userinfo;
select * from userinfo;

create table join_userinfo select * from userinfo;
desc join_userinfo;
select * from join_userinfo;
delete from join_userinfo where no>=5;
-- error 1175 해결방법 (update 안전모드 끄기)
set sql_safe_updates =0;

/*
question1) join을 이용하여 join_userinfo
  학생의 번호, 이름, 나이, 반을 출력하시오.
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  1 | first  |  11 | A    |
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
|  4 | fourth |  44 | C    |
+----+--------+-----+------+
>>> (1) = join
Error Code: 1052. Column 'no' in field list is ambiguous	0.000 sec
*/
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no =b.no;

#>>> (2) join  on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no);

#>>> (3) join  using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no);

#>>> (4) natural join - natural join 알아서 join 연결할 부위찾아서 연결해줌.
select no, name, age, ban
from join_userinfo natural join join_userban;


/*
question2)  inner join을 이용하여 join_userinfo
  테이블의 20세이상 40세 이하 학생의 번호, 이름, 나이, 반을 출력하시오.   번호.이름
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
+----+--------+-----+------+
*/
#>>> (1) = join
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no and age between 20 and 40;

select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no and age>= 20 and age<= 40;

#>>> (2) join  on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no) 
where age between 20 and 40;

#>>> (3) join  using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no) 
where age between 20 and 40;

#>>> (4) natural join 
select no, name, age, ban
from join_userinfo natural join join_userban 
where age between 20 and 40;

#question3)  outer join
## right join은 오른쪽값 보장
select a.no, a.name, b.ban, a.age
from  join_userinfo a right join join_userban b on a.no = b.no;

## left join은 왼쪽값 보장
select a.no, a.name, b.ban, a.age
from  join_userban b  left join join_userinfo a on a.no = b.no;

#question4)  left,right join
# right join
select b.no, b.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no=b.no;

# left join
select b.no, b.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no=b.no;

## select join 연습문제
-- 1
show tables;
select * from emp;
select * from dept;
select * from emp, dept order by empno;
-- emp 14 / dept 4   14*4 = 56줄
-- join 연결부위 찾아야함!  (주의사항!)
-- 2
select *
from emp, dept
where emp.deptno = dept.deptno
order by empno;

select empno, ename, job, mgr, hiredate, sal, comm, deptno, deptno, dname, loc
from emp natural join dept;
-- 3
select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.deptno, d.dname, d.loc
from emp e join dept d using(deptno);
-- 4
select empno, ename, deptno, dname, loc 
from emp e, dept d
where e.deptno = d.deptno;
# 소속을 정해줘야 함 (필드가 확실하지 않은경우만)
-- 5
select empno, ename, e.deptno, dname, loc 
from emp e, dept d
where e.deptno = d.deptno;
# 소속을 정해줘야 함 (필드가 확실하지 않은경우만)
-- 6
select empno, ename, sal, e.deptno, dname, loc 
from emp e, dept d
where e.deptno = d.deptno and sal>=3000;

select empno, ename, sal, e.deptno, dname, loc 
from emp e join dept d on (e.deptno = d.deptno )
where sal>=3000;

select empno, ename, sal, e.deptno, dname, loc 
from emp e join dept d using (deptno)
where sal>=3000;

select empno, ename, sal, deptno, dname, loc 
from emp e natural join dept d
where sal>=3000;
-- 7
show tables;
select * from salgrade;
select *
from emp e, salgrade s 
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, s.grade, s.losal, s.hisal
from emp e, salgrade s 
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;
-- 8
-- emp1 사원정보 , emp2 매니저정보 , salgrade 급여정보 
-- 사원정보 mgr , 매니저정보 empno, 사원정보의 급여 salgrade 최소 최대 사이값
-- 정렬 매니저정보의 사원번호기준으로 오름차순
-- ##13줄
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1, emp e2, salgrade s
where e1.mgr = e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc;
-- 9
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1 left join emp e2 on ( e1.mgr = e2.empno );
-- 10
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1 right join emp e2 on ( e1.mgr = e2.empno )
order by e1.empno;
-- right join은 right 쪽의 테이블 값 보장

-- 11
select * from emp;
select * from dept;
select empno, ename, job, mgr, hiredate, sal, comm, d.deptno, dname, loc
from emp e natural join dept d
order by deptno, empno;
/*
반드시 두 테이블 간의 같은 이름, 타입을 가진 컬럼이 필요하다
조인에 이용되는 컬럼은 명시하지 않아도 자동으로 조인에 사용된다
동일한 이름을 갖는 컬럼이 있지만 데이터타입이 다르면 에러가 발생한다.
*/
-- 12
select empno, ename, job, mgr, hiredate, sal, comm, e.deptno, dname, loc
from emp e join dept d using(deptno)
where sal>=3000
order by deptno, empno;
-- 13
select empno, ename, job, mgr, hiredate, sal, comm, d.deptno, dname, loc
from emp e join dept d on (e.deptno=d.deptno)
where sal<=3000
order by deptno, empno;
-- 14
select d.deptno, dname, empno, ename, sal
from emp e , dept d
where e.deptno=d.deptno and sal>2000;
-- 15
select deptno, dname, empno, ename, sal
from emp e natural join dept d
where sal>2000;
-- 16
select d.deptno, d.dname, avg(sal) `AVG_SAL`, max(sal) `MAX_SAL`, min(sal) `MIN_SAL`, count(*) `CNT`
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname
order by d.deptno, d.dname;
-- 17 
select d.deptno, d.dname, avg(sal) `AVG_SAL`, max(sal) `MAX_SAL`, min(sal) `MIN_SAL`, count(*) `CNT`
from emp e join dept d using(deptno)
group by d.deptno, d.dname
order by d.deptno, d.dname;
-- 18
select d.deptno, dname, empno, ename, job, sal
from dept d left join emp e using(deptno)
order by deptno asc, ename;
-- 19
select d.deptno, dname, empno, ename, job, sal
from emp e right join dept d using(deptno)
order by deptno asc, ename;
-- 20
select d.deptno, dname, e.empno, e.ename, e.mgr, e.sal, e.deptno, s.losal, s.hisal, s.grade, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e right join dept d    on(e.deptno=d.deptno)
		   left join salgrade s on(e.sal between s.losal and s.hisal)
           left join emp e2     on(e.mgr=e2.empno)
order by d.deptno, e.empno;  





         