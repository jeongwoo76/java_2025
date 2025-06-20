package com.thejoa.project001.domain;

import java.time.LocalDateTime;
import java.util.List;

import com.thejoa.project001.member.MemberRole;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Member {
	private Long id;
	private String username;
	private String password;
	private String email;
	private String nickname;
	private String image;
	private LocalDateTime udate= LocalDateTime.now();
	private MemberRole role; // ROLE_ADMIN , ROLE_SYSTEM , ROLE_MEMBER
	private String provider; // thejoa, kakao, naver, google
	
//	private List<Board> board;
	
	@Builder
	public Member(String username, String email, String nickname, String image, MemberRole role, String provider) {
		super();
		this.username = username;
		this.email = email;
		this.nickname = nickname;
		this.image = image;
		this.role = role;
		this.provider = provider;
	} //연관된 게시물 목록 (Mybatis에서 직접매핑)

}


/*
mysql> desc member;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | bigint       | NO   | PRI | NULL    | auto_increment |
| email    | varchar(255) | YES  |     | NULL    |                |
| password | varchar(255) | YES  |     | NULL    |                |
| provider | varchar(255) | YES  |     | NULL    |                |
| role     | varchar(255) | NO   |     | NULL    |                |
| udate    | datetime(6)  | YES  |     | NULL    |                |
| username | varchar(255) | YES  | UNI | NULL    |                |
| nickname | varchar(255) | YES  |     | NULL    |                |
| img      | varchar(255) | YES  |     | NULL    |                |
| image    | varchar(255) | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
*/