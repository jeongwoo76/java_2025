package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
	int cnt=0;
	char[] ch= {'B', 'a', 'n', 'a', 'n', 'a' };
	
	// ver-0 ch 배열에서 a의 갯수 세기
	// ver-1 'B' 소문자 'a'라면 갯수세기
	// ver-1 'a' 소문자 'a'라면 갯수세기
	
	// ver-2 if('B' 소문자 'a'라면){ 갯수세기 }
	// ver-2 if('a' 소문자 'a'라면){ 갯수세기 }
	
	// ver-3 if(ch[0] == 'a'){ 갯수세기 }
	// ver-3 if(ch[1] == 'a'){ 갯수세기 }
	
	// ver-4 for() {} ......
	for (int i=0; i<ch.length; i++) { if(ch[i]=='a') { cnt++; } }
	 System.out.println("ch 배열에서 a의 갯수 : "+ cnt); 
		
		
	}  // end main
}     // end class
/*
연습문제4)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx004
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 a의 갯수 세기
*/