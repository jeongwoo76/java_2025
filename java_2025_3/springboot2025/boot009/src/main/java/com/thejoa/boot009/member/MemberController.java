package com.thejoa.boot009.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@Autowired MemberService service;
	
	@GetMapping("/")
	public String main() { return "member/login"; }
	
	@GetMapping("/member/member")
	public String member() { return "member/member";}
	
	@GetMapping("/member/login")
	public String login() { return "member/login"; }
	
	@GetMapping("/member/join")
	public String join(MemberForm memberForm) { return "member/join";}
	
    @GetMapping("/idByUsername/{username}")
    public Map<String, String> checkIdDuplicate(@PathVariable String username) {
        Map<String, String> response = new HashMap<>();
        Optional<Member> member = service.findMemberByUsername(username);

        if (member.isPresent()) {
            response.put("result", "taken"); 
        } else {
            response.put("result", "available"); 
        }

        return response;
    }
	
	@PostMapping("/member/join")
	public String join(@Valid MemberForm memberForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {return "member/join"; }
		if(!memberForm.getPassword().equals(memberForm.getPassword2())) {
			bindingResult.rejectValue("password2", "passwordInCorrect", "패스워드를 확인해주세요");
			return "member/join";
		}
		
		try {
			Member member = new Member();
			member.setUsername(memberForm.getUsername());
			member.setEmail(memberForm.getEmail());
			member.setPassword(memberForm.getPassword());
			service.insertMember(member);
		}catch(DataIntegrityViolationException e) {
			e.printStackTrace();
			bindingResult.reject("failed", e.getMessage());
			return "member/join";
		}
			return "member/login";
	}
	
	  @PostMapping("/member/login")
	    public String login(@RequestParam("username") String username, @RequestParam("password") String password, BindingResult bindingResult) {

	        Optional<Member> memberOptional = service.findMemberByUsername(username);

	        if (!memberOptional.isPresent()) {
	            bindingResult.reject("loginFailed", "사용자ID가 존재하지 않습니다.");
	            return "member/login";  
	        }

	        Member member = memberOptional.get();

	        if (!member.getPassword().equals(password)) {
	            bindingResult.reject("loginFailed", "비밀번호가 올바르지 않습니다.");
	            return "member/login";  
	        }

	        return "redirect:/member/member";  
	    }

}
