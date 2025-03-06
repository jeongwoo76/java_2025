package com.company.java013;
//Q6 컴파일에러 
//1. 클래스는 부품객체 ( 상태-멤버변수 와 행위-멤버함수)
//				클래스변수, 인스턴스변수, 지역변수 / 클래스메서드, 인스턴스메서드
//  변수 초기화 단계
//  					기본값		명시적초기화	초기화블록		생성자
//     classValue       1) 0		2) 20       3) 20       4) X
//	instanceValue       5) 0        6) 10       7) 10       8) 10

class MemberCall001{
	int instanceValue=10;     // 인스턴스변수 , heap area, new O , this
	static int classValue=20; // 클래스변수 , method area, new X, 공유 , 클래스명.변수명
	
	int instanceValue2 = classValue; // 인스턴스변수(5) = 클래스변수 (1)
	
	//static int classValue2 = instanceValue;  //#1 error-  static은 instance 사용불가
	//	 static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	
	 static void staticMethod1() {//# 2 static은 instance 사용불가 
		System.out.println(classValue);
		//System.out.println(instanceValue);
	} 
    //	 static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);
	}//3
	/*
	static void staticMethod2() { //# 4 static은 instance 사용불가
		System.out.println(classValue);
		instanceMethod1();
	} //4
	 //	 static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	*/
	void instanceMethod2() { //#5 인스턴스메서드 - heap area -  new O -  this
		staticMethod1();
	}//5
}

public class Repeat002_OOP_67 {
	public static void main(String[] args) {
		 
	}
}

// Q7.  private( 클래스내부 ) < package(default : 폴터내부) < protected( extends : 상속 ) <public(아무데서나)






