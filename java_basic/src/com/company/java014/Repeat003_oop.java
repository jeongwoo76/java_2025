package com.company.java014;

abstract class Fruit {
	@Override public String toString() { return "Fruit "; }
	public abstract void myfruit();
}
class Apple extends Fruit{ 
	@Override public void myfruit() { System.out.println("사과는 빨갛다."); }
}
class Banana extends Fruit{ 
	@Override public void myfruit() { System.out.println("바나나는 노랗다."); }
}
class Coconut extends Fruit{ 
	@Override public void myfruit() { System.out.println("코코넛은 코코하다."); }
}
public class Repeat003_oop {
	public static void main(String[] args) {
	 	Fruit [] fruits = {new Apple() , new Banana() , new Coconut()};
	 	// 부모			= 자식들
	 	// 한개의 자료형(부모)으로 여러개의 객체들(자식들)을 관리
	 	for(Fruit f: fruits) {   f.myfruit(); } 
	}
}
/* 
Fruit (------------)
↑	    ↑	    ↑
Apple  Banana  Coconut -  myfruit() - @Override

*/
 

/*
Q9.    abstract 란?   추상화 , 일반화, 공통의 기능  → IS A 고양이는 동물이다.

Q10.   interface 란?  실체화관계  →  can do this! 약속할께,, 구현객체를통해서 이서비스약속

Q11.  abstract 과 interface 의 차이점은?
 공통점 :  자식클래스를 통해서 설계부분을 구현한다.
 차이점 :  추상화정도가 interface 가 높다
          abstract 일반클래스+ 설계도 
 		  interface         설계도  
 		  멤버변수는 public static final 이 붙은 상수
 		  멤버함수는 public abstract       abstsract 메서드
 		  

Q12. 다음과 같이 출력되게 코드를 작성하시오.
--------------------------------
ㅁ 출력된화면
사과는 빨갛다.
바나나는 노랗다.
코코넛은 코코하다.

----------------------------------------------
     Fruit
↑	    ↑	    ↑
Apple  Banana  Coconut
----------------------------------------------

abstract class Fruit {
	@Override public String toString() { return "Fruit "; }
	public abstract void myfruit();
}  

public class Abstract005 {
  public static void main(String[] args) {  
	  	Fruit [] fruits = {new Apple() , new Banana() , new Coconut()};
 
  }
}

 
*/