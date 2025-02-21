package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[] args) {
		int count=0;
		for (int i=97; i<=122; i++) {
			if (i==97 || i==101 || i==105 || i==111 || i==117) {
				System.out.print((char)i+"\t");            
				count= count+1;
		}
	}        System.out.println("\n소문자 a~z까지 모음의 갯수는 = "+count);
	
			
	}  // end main
}   // end class
/*
연습문제5)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx005
출력내용 :   for 이용
소문자 a~z까지 모음의 갯수를 출력하시오. 
*/