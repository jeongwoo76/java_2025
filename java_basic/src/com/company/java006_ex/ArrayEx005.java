package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
	int cnt1=0, cnt2=0;
	char[] ch= {'B', 'a', 'n', 'a', 'n', 'a' };	
	
	// ver-0  ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
	// ver-1 'B' 대문자의 갯수카운트, 소문자의 갯수 카운트
	// ver-1 'a' 대문자의 갯수카운트, 소문자의 갯수 카운트

	
	// ver-2 if('B' 대문자의){ 갯수카운트 },else if('B' 소문자의 ){갯수 카운트 }
	// ver-2 if('a' 대문자의){ 갯수카운트 },else if('a' 소문자의 ){갯수 카운트 }
	// 
	
	// ver-3 if(ch[0]>='A' && ch[0]<='Z'){ 갯수세기}
	// ver-3 if(ch[1]>='a' && ch[1]<='z'){ 갯수세기}
	
	// ver-4 for () {}   ........
	for (int i=0; i<ch.length; i++) {
		 if (ch[i]>='A' && ch[i]<='Z') { cnt1++; }
	else if (ch[i]>='a' && ch[i]<='z') { cnt2++; } 
    }
	System.out.println("ch배열에서 대문자의 개수 : "+ cnt1+"\nch배열에서 소문자의 개수 : "+ cnt2);
	
		
	}  // end main
}      // end class
/*
연습문제5)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx005
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
*/