package com.company.project001.member;

import lombok.Getter;

@Getter
public enum MemberRole {
	ADMIN("ROLE_ADMIN"), MEMBER("ROLE_MEMBER");
	
	private String value;
	private MemberRole(String value) { this.value = value; }

}
