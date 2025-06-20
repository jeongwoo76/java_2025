package com.thejoa.project001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.project001.domain.Member;
import com.thejoa.project001.member.MemberMapper;
import com.thejoa.project001.member.MemberRole;

@SpringBootTest
class Project001ApplicationTests {
	
	@Autowired MemberMapper memberMapper;
	
	@Disabled @Test public void insert() {
		Member member = new Member();
		member.setUsername("first");
		member.setPassword("1111");
		member.setEmail("first@gmail.com");
		member.setNickname("first");
		member.setImage("1.png");
		member.setRole(MemberRole.MEMBER);
		member.setProvider("thejoa");
		memberMapper.insert(member);
	}
	
	@Disabled @Test public void findByAll() {
		System.out.println(memberMapper.findAll());
	}
	
	@Disabled @Test public void findByUsername() {
		System.out.println(memberMapper.findByUsername("first"));
	}
	
	@Disabled @Test public void updateByIdAndPassword() {
		System.out.println(memberMapper.updateByIdAndPassword(67L, "1111", "1234"));
	}
	
	@Test public void delete() {
		System.out.println(memberMapper.delete(67L));
	}
	
}
