package com.company.java005_ex;

public class ForEx005_1 {
	public static void main(String[] args) {
		// 변수
		int cnt=0; 
		// 입력
		// 처리
		// 출력  소문자 a~z까지 모음의 갯수를 출력하시오. 
		
		//ver-1 대상 어떠하다
		// a가 모음이라면 카운트:갯수증가
		// b가 모음이라면 카운트:갯수증가
		// c가 모음이라면 카운트:갯수증가
		
		//ver-2 구조   a가 a, e, i, o, u 이라면
		// if( a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u' ) { 카운트:갯수증가 cnt++; }
		// if( b=='a'|| b=='e'|| b=='i'|| b=='o'|| b=='u' ) { 카운트:갯수증가 cnt++; }
		// if( c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' ) { 카운트:갯수증가 cnt++; }		
		
		for (char ch='a'; ch<='z'; ch++)
		{if( ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) { cnt++; }}
		
		System.out.println("소문자 a~z까지 모음의 갯수> " + cnt);
	}

}
/*연습문제5)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx005
출력내용 :   for 이용
소문자 a~z까지 모음의 갯수를 출력하시오. 
*/