package com.thejoa.project001.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thejoa.project001.domain.Member;

@Mapper
public interface MemberMapper {
	public Member findByUsername(String username);
	public Member findById(Long id);
	public List<Member> findAll();
	public int insert(Member member);
	public int update(Member member);
	public int delete(Long id);
	public int updateByIdAndPassword( @Param("id") Long id, @Param("oldPassword") String oldPassword,  @Param("newPassword") String newPassword );
}
