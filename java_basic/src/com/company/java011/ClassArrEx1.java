package com.company.java011;

import java.util.Arrays;

import com.company.java011_ex.Apple;

public class ClassArrEx1 {
	 public static void main(String[] args) {
	        Apple[] apples= new Apple[3]; // apples [null, null, null]
	    
	        apples[0] = new Apple("RED", "iron", 2, 1000);
	        apples[1] = new Apple("GREEN", "hulk", 1, 1500);
	        apples[2] = new Apple("GOLD", "captain", 3, 2000);
	        //위의 화면처럼 값 셋팅
	        //위의 화면처럼 출력
			//	        System.out.println(apples[0]);
			//	        System.out.println(apples[1]);
			//	        System.out.println(apples[2]);
	        //for (int i=0; i<apples.length; i++) {System.out.println(apples[i]);}
	        
	        // 향상된 for ( 해당자료형 one   :  배열  )  {}
	        for (Apple one : apples)  {   System.out.println(one);  }
	  }
}
/*
Apple [name=RED, order=iron, num=2, price=1000]
Apple [name=GREEN, order=hulk, num=1, price=1500]
Apple [name=GOLD, order=captain, num=3, price=2000]

연습문제1)  클래스배열
패키지명 : com.company.java011_ex
클래스명 : ClassArrEx1
다음과 같이 코드를 작성하시오.
ㅁ출력된 화면
Apple [name=RED, order=iron, num=2, price=1000]
Apple [name=GREEN, order=hulk, num=1, price=1500]
Apple [name=GOLD, order=captain, num=3, price=2000]

ㅁ주어진 옵션
public class Apple{   //// 실행 main과 파일을 분리해주세요!
   private String name;
   private String order;
   private int num;
   private int price;
}

public class ClassArrEx1{
  public static void main(String[] args) {
        Apple[] apples= new Apple[3]; 
        //위의 화면처럼 값 셋팅
        //위의 화면처럼 출력
  }
}
*/