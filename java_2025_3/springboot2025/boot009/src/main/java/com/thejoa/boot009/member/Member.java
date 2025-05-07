package com.thejoa.boot009.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thejoa.boot009.board.Board;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String email;
	private String password;
	private String username;
	
	@Column(updatable=false)
	private LocalDateTime udate = LocalDateTime.now();
	private LocalDateTime createDate = LocalDateTime.now();
	
	@OneToMany
	List<Board> board = new ArrayList<>();
}
