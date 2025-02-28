package com.company.java010_ex;

// 1. 클래스는 부품객체
// 2. 클래스 상태(멤버변수) 행위(멤버함수)  - 특징
class Coffee{
	  // 멤버변수
	  String name;  int  num, price;
	  // 멤버함수
	  void show(){
		  System.out.println("=====커피\r\n"
		  		+ "커피명 : "  + name +"\r\n"
		  		+ "커피잔수 : " + num + "\r\n"
		  		+ "커피가격 : " + num*price);
	  }   //커피정보출력
	  // 생성자  - 사용자가 넣어준 값
	  public Coffee(String name, int num, int price ) { // 수동작성
			  super();
			  this.name = name;
			  this.num = num;
			  this.price = price; 
	  }
	  public Coffee() { 
		  name= "아메리카노";  num=1; price=2000; }  // 기본생성자 자동생성취소
	  
}

public class ClassEx003 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼", 2, 4000); a1.show();
		Coffee a2 = new Coffee();                  a2.show();

	}

}
/*
연습문제3)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx003
-- 생성자 작성하시오.
class Coffee{
  멤버변수 : String name;  int  price, num;
  멤버함수 : void show(){}   //커피정보출력
}
public class Class003 {
   public static void main(String[] args) {
   Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();
   Coffee a2 = new Coffee();                    a2.show();
  }
}
출력내용 :
=====커피
커피명 : 까페라떼
커피잔수 : 2 
커피가격 : 8000
=====커피
커피명 : 아메리카노
커피잔수 : 1
커피가격 : 2000
*/