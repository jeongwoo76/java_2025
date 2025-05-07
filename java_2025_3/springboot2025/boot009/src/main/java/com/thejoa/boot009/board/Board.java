package com.thejoa.boot009.board;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.thejoa.boot009.member.Member;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length =200)
	private String btitle;
	
	@Column (columnDefinition = "text")
	private String bcontent;
	
	private String bpass;
	private Long bhit=0L;
	private String bip;
	
	@Column (updatable = false)
	private LocalDateTime createDate = LocalDateTime.now();

	@ManyToOne @JoinColumn(name="member_id")
	private Member member;
}
