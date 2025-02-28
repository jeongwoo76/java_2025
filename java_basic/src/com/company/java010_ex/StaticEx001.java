package com.company.java010_ex;

class Area1 {
	
	static double pi=3.14159;
	static   double  rect(int a,int b)  { return a*b; }
	static   double  triangle(int a,int b)  { return a*b*0.5; }
	
}

public class StaticEx001 {
	public static void main(String[] args) {  
	System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
	System.out.println("사각형의 면적 : " + Area1.rect(10, 5));  //50.0
	//            리턴값 메서드명() {해야할일 }
	//           double  rect(10,5)  {return 10*5; }
	//  static   double  rect(int a,int b)  {return a*b; }
	System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5)); // 25.0
	//  리턴값 메서드명() {해야할일 }
	//           double  triangle(10,5)  {return 10*5; }
	//  static   double  triangle(int a,int b)  {return a*b*0.5; }
  }
}
/*
연습문제1)  static
패키지명 : com.company.java010_ex
클래스명 :  StaticEx001
-- class Area1 작성해주세요   ※ pi값은 3.14159
public class StaticEx001{
  public static void main(String[] args) {  
   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
  }
}

출력내용 : 
원의 면적    : 314.159
사각형의 면적 : 50.0
삼각형의 면적 : 25.0
*/