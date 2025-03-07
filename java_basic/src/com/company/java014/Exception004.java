package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception004 {
	public static int nextInt()  throws InputMismatchException{   //##2-2 발생한지점
		int a=-1;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("숫자 1 입력> "); 
		a= scanner.nextInt(); //1. nextInt() 숫자입력받기를 기다림.		 			
		return a;
	}
	public static void main(String[] args) /*throws Exception */ {
		int a=-1;
	while(true) {
		try {
			a = nextInt(); //##2-2  오류났어!  InputMismatchException
			if(a==1) break;
		} catch(Exception e) {System.out.println("오류났어!"); }
	}
	System.out.println("결과물: "+a); 
	
  } // end main
}   // end class


/* 1) main 안에서
Exception in thread "main" java.util.InputMismatchException    //##1
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception001.main(Exception001.java:12)   //##2

 2) method 
Exception in thread "main" java.util.InputMismatchException
at java.base/java.util.Scanner.throwFor(Scanner.java:964)
at java.base/java.util.Scanner.next(Scanner.java:1619)
at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
at com.company.java014.Exception004.nextInt(Exception004.java:11)  ##2-2 발생한지점
at com.company.java014.Exception004.main(Exception004.java:15)     ##2-1 호출한애 
*/


