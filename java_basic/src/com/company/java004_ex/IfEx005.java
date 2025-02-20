package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자한개를 입력하시오>");
		ch = scanner.next().charAt(0);
		// (대문자이면) {소문자로},  (소문자이면) {대문자로}
		     if (ch>='A' && ch<='Z') {System.out.println(ch = (char) (ch + 32) ); }
		else if (ch>='a' && ch<='z') {System.out.println(ch = (char) (ch - 32) ); }
		
		
		
		
	}
}
/*연습문제5)
패키지명 : com.company.java004_ex
클래스명 :  IfEx005
출력내용 : 문자한개를 입력받아 
   대문자인지 이면 소문자로,  소문자이면 대문자로 변경하는 프로그램을 작성하시오.
   ※  a = 'A' + 32    
*/