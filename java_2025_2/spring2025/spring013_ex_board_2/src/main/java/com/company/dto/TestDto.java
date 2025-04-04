package com.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
//@NoArgsConstructor(force=true) //해결1. 오류나면 수동으로 생성자 만들어야함
@NoArgsConstructor(force=true)   //해결2. 강제로필드에 null or 0초기화
@RequiredArgsConstructor // final TestDto(String)
public class TestDto {
	private final String company;
	private int year;
	
}
