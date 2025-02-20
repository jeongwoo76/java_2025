package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		char ch ='\u0000';   // ch=' ';
		String result="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 한개 입력하시오>"); 
		// ch = 'A' ;   문자한개 'A' / String str ="abc" 문자열
		ch =scanner.next().charAt(0);    // scanner.next() "a(0)b(1)c문자열" / charAt(0)
		     if( ch>='A' && ch<='Z' ) { System.out.println("대문자입니다");         }
		else if( ch>='a' && ch<='z' ) { System.out.println("소문자입니다.");        }
		else                          { System.out.println("알파벳만 입력가능합니다!");}
		
		     
		// if( ch>='A' && ch<='Z' ) { result ="대문자"; } 
		// else if( ch>='a' && ch<='z' ) { result ="소문자"; } 
		//     System.out.println(result);
		     
		     
		     
	} // end main
}    // end class
/*연습문제4)
패키지명 : com.company.java004_ex
클래스명 :  IfEx004
출력내용 : 문자한개를 입력받아 
   대문자인지,  소문자인지 판별하는 프로그램을 작성하시오.
   ※  대문자  ch>='A' && ch<='Z' / 소문자  ch>='a'  &&  ch<='z'  

*/