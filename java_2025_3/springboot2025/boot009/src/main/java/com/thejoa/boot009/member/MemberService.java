package com.thejoa.boot009.member;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Member insertMember(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		return memberRepository.save(member);
	}
	
	public List<Member> selectMemberAll(){
		return memberRepository.findAll();
	}
	
	public Member selectMember(Long id) {
		return memberRepository.findById(id).get();
	}
	
	public int updateByPass(Member member, String old) {
		return memberRepository.updateByIdAndPassword(member.getPassword(), old, member.getId());
	}
	
	public Member updateByEmail(Member member) {
		Member find = memberRepository.findById(member.getId()).get();
		find.setEmail(member.getEmail());
		return memberRepository.save(find);
	}
	
	public void deleteMember(Long id) {
		Member find = memberRepository.findById(id).get();
		memberRepository.delete(find);
	}

	public Optional<Member> findMemberByUsername(String username) {
		 return memberRepository.findByUsername(username);
	}
}
