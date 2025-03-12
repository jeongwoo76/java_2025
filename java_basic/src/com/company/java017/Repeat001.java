package com.company.java017;

final class  FinalBasic extends Object{
	final static String MERRY_CHRISTMAS = "12-25";  // 1) 
	String name;        
	int    age;		 
	final  void show() {
		System.out.println("::::::::::: static + final");
		System.out.println(":: 이름 : "  + this.name );
		System.out.println(":: 나이 : "  + this.age  );
	}
	@Override public String toString() { return "FinalBasic [name=" + name + ", age=" + age + "]"; }
}
//class   FinalBasic2 extends  FinalBasic{
//	@Override void show() {  System.out.println("HELLO~" +  name); }
//}
public class Repeat001 {

}
/*
9-1.  오류나는 부위를 적으시오.
1)  class   FinalBasic2 extends  FinalBasic
2)  @Override void show() {  System.out.println("HELLO~" +  name); }

final -수정하지마
클래스 - 상속하지마 / 멤버변수 - 상수 / 멤버함수 - 오버라이딩하지마

9-2.  오버로딩과 오버라이딩의 차이점은?
 오버로딩 : 비슷한 기능을 하는 메서드들의 이름을 같게 하고 알규먼트의 자료형과 갯수로 구분하는것. 
 오버라이딩 :  상속시 부모의메서드를 자식클래스에 맞게 수정하는것.
*/