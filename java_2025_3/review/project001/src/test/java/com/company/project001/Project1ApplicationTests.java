package com.company.project001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.project001.dao.AuthDao;
import com.company.project001.dao.EmpDao;
import com.company.project001.dto.EmpDto;
import com.company.project001.dto.UserDto;
import com.company.project001.service.TestService;

@SpringBootTest 
class Project1ApplicationTests {

	@Autowired TestService service;
	@Disabled@Test void contextLoads() { System.out.println("....." + service.test()); }
	//////////////////////////////////////////////////////////
	@Autowired AuthDao authdao;
	@Test public void authTest() {
			UserDto dto = new UserDto();
			dto.setUserid("first");	
			System.out.println(authdao.readAuth(dto));
		}	
	
	/////////////////////////////////////////////////////////
	@Autowired EmpDao dao;
	@Disabled @Test public void test1() {
		Map<String, String> para = new HashMap<>();
		//para.put("searchType" , "ename");
		//para.put("keyword"    , "SMITH");
		para.put("searchType" , "job");
		para.put("keyword"    , "clerk");
		System.out.println(dao.test1(para));
	}
	
//	select * from EMP WHERE ename='SMITH';
//	select * from EMP WHERE ename='SMITH' and job='clerk';	
	@Disabled @Test public void test2() {
		EmpDto dto = new EmpDto();
		dto.setEname("SMITH");	dto.setJob("clerk");	
		System.out.println(dao.test2(dto));
	}

//	mysql> select * from emp   where  empno=7369 and mgr=7902
//	mysql> select * from emp   where  empno=7369 and ename='SMITH'  and  mgr=7902
//	mysql> select * from emp   where  empno=7369 and ename='SMITH'  and  job='clerk'  
//	mysql> select * from emp   where  empno=7369 and ename='SMITH'  and  job='clerk'  and mgr=7902
	@Disabled @Test public void test3() {
		EmpDto dto = new EmpDto();
		dto.setEmpno(7369);
		//dto.setEname("SMITH");	
		//dto.setJob("clerk");	
		dto.setMgr(7902);	
		System.out.println(dao.test3(dto));
	}
	
//	mysql> select * from emp
//	mysql> select * from emp   where  ename='SMITH'   
//	mysql> select * from emp   where  job='clerk' 
//	mysql> select * from emp   where  ename='SMITH'  and  job='clerk' 	
	@Disabled @Test public void test4() {
		EmpDto dto = new EmpDto();
		//dto.setEname("SMITH");	
		dto.setJob("clerk");	
		System.out.println(dao.test4(dto));
	}	
	
//	mysql>	update emp set ename='SMITH-NEW'				where empno=7369	
//	mysql>	update emp set job='DEVELOPER' 					where empno=7369
//	mysql>	update emp set ename='SMITH' , job='CLERK'  	where empno=7369	
	@Disabled @Test public void test5() {
		EmpDto dto = new EmpDto();
		//dto.setEname("SMITH-NEW");	//dto.setJob("DEVELOPER");
		dto.setEname("SMITH");	dto.setJob("CLERK");	
		dto.setEmpno(7369);
		System.out.println(dao.test5(dto));
	}	
		
// mysql> select * from emp   where  empno in ( 7369, 7499, 7521 )	
	@Disabled @Test public void test6() {
		List<Integer> list = new ArrayList<>();
		list.add(7369);	//list.add(7499);	//list.add(7521);
		System.out.println(dao.test6(list));
	}	
		
	
	
}
