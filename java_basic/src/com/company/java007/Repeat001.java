package com.company.java007;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자 한개 입력>");
		ch = scanner.next().charAt(0);
		
		     if(ch=='a') { System.out.println("apple");   }
		else if(ch=='b') { System.out.println("banana");  }
		else if(ch=='c') { System.out.println("coconut"); }
		
		
	}  // end main
}      // end class

/*
0)  이론
1.   자바의 자료형은 (  기본형  )   /  (  참조형  )  로 분류된다.
2.   자바의 기본형은 ( boolean   , char    , byte   , short  , int   , long  , float   , double   ) 가 있다.
3.   자바의 형변환은 (  boolean ) 빼고 기본형에서 가능하다. 
4.   ch  가 대문자일경우 조건식작성                 ch>= 'A' && ch<='Z' 
5.   ch  가 소문자일경우 조건식작성                 ch>= 'a' && ch<='z'
6.   a   가 0~100사이일 경우 조건식 작성            a>=0    &&  a<=100
*/