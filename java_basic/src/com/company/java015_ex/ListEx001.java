package com.company.java015_ex;

import java.util.ArrayList;

public class ListEx001 {
	public static void main(String[] args) {
		// 1.  ArrayList이용해서 colors 만들기
		ArrayList<String> colors = new ArrayList<>();
		
		//  2. red, green, blue 데이터 추가
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		// 3. 출력 for + size
		System.out.println(colors);
		System.out.println(colors.get(0)); // red
		System.out.println(colors.get(1)); // green
		System.out.println(colors.get(2)); // blue
		
		System.out.println();
		System.out.println();
		for(int i=0; i<colors.size(); i++){System.out.println(colors.get(i));}
	}
}
/*
연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : ListEx001
다음과 같이 코드를 작성하시오.
 1.  ArrayList이용해서 colors 만들기
 2. red, green, blue 데이터 추가
 3. 출력
*/