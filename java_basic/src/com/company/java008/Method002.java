package com.company.java008;

public class Method002 {
	// #1. 함수정의                    파라미터연습
	// public static  리턴값   메서드명 (파라미터)  { }
	public static void myint(int a) { System.out.println(a);}
	
	public static void myadd(int a, int b)  {System.out.println(a+b);}
	
	/////////////////////////////////////////////
	public static void main(String[] args) {
		                 myint(1);  // 1 출력
		                 myint(2);  // 2 출력
		                 
		//public static void myadd(int a, int b)  {해당더해서 출력}
		                 myadd(1,2);  // 3 
		                 myadd(10,3);  // 13 
		                 
		//public static void myint(int a)  {해당값 출력}
	}

}
