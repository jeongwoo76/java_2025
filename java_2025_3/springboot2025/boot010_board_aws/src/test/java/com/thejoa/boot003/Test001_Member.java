package com.thejoa.boot003;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.thejoa.boot003.member.Member;
import com.thejoa.boot003.member.MemberRepository;

@SpringBootTest
class Test001_Member {
	//@Autowired MemberRepository memberRepository;

	/*
	@Disabled //@Test
	public void insert() {
		Member member =new Member();
		member.setUsername("first");
		memberRepository.save(member);
	}

	@Disabled //@Test
	public void selectAll() {
		List<Member> list =memberRepository.findAll();
		System.out.println(list.size());
		System.out.println(list.get(0).getUsername());
	}
	
	@Disabled //@Test
	public void update() {
		Optional<Member> findMember = memberRepository.findById(1L);
		System.out.println(findMember.isPresent() );
		
		Member member = findMember.get();
		member.setUsername("second");
		memberRepository.save(member);
	}
	
	@Test
	public void delete() {
		Optional<Member> findMember = memberRepository.findById(1L);
		System.out.println(findMember.isPresent() );
		
		Member member = findMember.get();
		memberRepository.delete(member);
	}
	*/
}
/*
mysql> desc member;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | bigint       | NO   | PRI | NULL    | auto_increment |
| age            | int          | NO   |     | NULL    |                |
| crea_date_time | datetime(6)  | YES  |     | NULL    |                |
| name           | varchar(255) | NO   |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec) 
*/