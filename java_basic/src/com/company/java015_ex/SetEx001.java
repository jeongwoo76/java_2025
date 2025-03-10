package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		//1.  Hash이용해서 colors 만들기
		Set<String> colors = new HashSet<>();
		//2. red, green, blue ,green 데이터 추가
		colors.add("red"); // String e
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		//3. 출력
		// 향상된 for
		for(String c :colors) {System.out.println(c);} System.out.println();
		
		// iterator
		
		Iterator<String> iter = colors.iterator(); //1. set요소들 모으기
		while (iter.hasNext()) {  //2. 처리대상확인
			System.out.println(iter.next());  //3. 객체요소한개 꺼내오기
		}
		
		//4. 갯수출력  
		System.out.println(colors.size()); // 3개
		
	}
}
/*
연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx001
다음과 같이 코드를 작성하시오.
 1.  HashSet이용해서 colors 만들기
 2. red, green, blue ,green 데이터 추가
 3. 출력
 4. 갯수출력  
*/