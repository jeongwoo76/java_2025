package com.company.java002_ex;

public class VarEx002 {
	public static void main(String[] args) {
		int a = 0; //1-1
		a= 10;     //1-2
		int b = 3; //1-3   ,   1-4 
		//a= 20;
		//b= 7;
		System.out.println( a + "+" + b + "=" + (a+b) );
		System.out.println( a + "-" + b + "=" + (a-b) );
		System.out.println( a + "*" + b + "=" + (a*b) );
		System.out.println( a + "/" + b + "=" + (a/b) );
		
		System.out.printf("%d + %d = %d\n", a, b ,a+b);
		System.out.printf("%d - %d = %d\n", a, b ,a-b);
		System.out.printf("%d * %d = %d\n", a, b ,a*b);
		System.out.printf("%d / %d = %d\n", a, b ,a/b);
		
		// 정수 %d 1,2,3  실수 %f 1.1
				// 정수/정수 =정수 10/3 =3  정수/실수 ,  실수/정수
		System.out.printf("%d / %d = %f\n", a, b ,a/(float)b);
		
		
	}
}
/* 연습문제2)  
패키지명 : com.company.java002_ex
클래스명 : VarEx002
출력내용 : 
   1-1.  정수형데이터를 담을수 있는 변수 a 만들고   
   1-2.  a에 10대입하시오
   1-3.  정수형데이터를 담을수 있는 변수 b 만들고   
   1-4.  b에 3대입하시오
   1-5.  System.out.println 을 4번사용해서 
   10 + 3 = 13
   10  - 3 = 7
   10  * 3 = 30
   10  / 3 = 3
*/