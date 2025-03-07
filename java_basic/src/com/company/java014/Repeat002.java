package com.company.java014;

import java.util.ArrayList;

//Q2. Papa와 Son의 상속도를 그리시오.
/*
 *     Object                                 Object(){#3 }#4
        ↑
 		Papa money=10;          /toString     Papa(){#2   }#5
 		↑
 		Son  money=150/  car=2; /toString     Son() {#1   }#6  @ Override
*/

class Papa{
	int money =10;
	public Papa() { }
	public Papa(int money) {  this.money = money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa{
	int money =150;
	int car =2;
	public Son() { super(); }
	public Son(int money ) { super(money); }
	public Son(int money, int car) {  this.money = money; this.car = car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}


public class Repeat002 {
	public static void main(String[] args) {
	//--------------------------------------------------------------------STEP1
	Papa p1 = new Papa();  //[money=10,toString] = 1번지 Papa(){money=10,  toString }
	System.out.println(p1); // Papa [money =10]
	// Q3. 출력되는 화면을 적으시오. 만약 컴파일시 에러가 난다면 오류가 나는 이유를 적으시오.
	// Papa [money =10]
	
	//--------------------------------------------------------------------STEP2
	Son s2 = new Son(); // Son s2 [money=150,car=2/toString]-[money=10/toString]
	// s2 2번지  {money=150,car=2/toString}-{money=10/-------}
	System.out.println(s2); // Son [money =150, car=2]
	// Q4. 출력되는 화면을 적으시오. 만약 컴파일시 에러가 난다면 오류가 나는 이유를 적으시오.
	// Son [money =150, car=2]
	
	//--------------------------------------------------------------------STEP3
	//Son s3 =(Son) new Papa(); // Son s3 [money=150,car=2/toString]-[money=10/toString]
	// s3 = 3번지                                               Papa(){money=10/toString }
	//System.out.println(s3);
	// Q5. 출력되는 화면을 적으시오. 만약 컴파일시 에러가 난다면 오류가 나는 이유를 적으시오.
	// 오류 : Type mismatch: cannot convert from Papa to Son 코드 작성시 오류 없지만 컴파일시 오류 
	// 자식생성자가 청소한적이 없어서
	
	//--------------------------------------------------------------------STEP4
	Papa p4 = new Son();                             // [money=10,toString]
	// p4 = 4번지 Son()  {money=150,car=2/toString}-Papa(){money=10/-------}  @Override
	System.out.println(p4);  // Son [money =150, car=2]
	// Q6-1. 출력되는 화면을 적으시오. 만약 컴파일시 에러가 난다면 오류가 나는 이유를 적으시오.
	// Son [money =150, car=2]
	System.out.println(p4.money);  // 10
	// Q6-2. 출력되는 화면을 적으시오.
	// 10
	
	//--------------------------------------------------------------------STEP5
	Papa p5 = new Son(); //1. 부모 = 자식  / 업캐스팅 / 타입캐스팅필요 X
	Son s5= (Son) p5;    //2. 자식 = 부모 / 다운캐스팅 / 타입캐스팅필요 O/ 부모는 자식생성자를 호출한적이 있어야한다.
	// Son s5  [money=150,car=2/toString]-[money=10/toString]
	// p5 = 5번지 Son(){money=150,car=2/toString}-Papa(){money=10/-------}
	System.out.println(s5); // Son [money =150, car=2]
	// Q7-1. 출력되는 화면을 적으시오. 만약 컴파일시 에러가 난다면 오류가 나는 이유를 적으시오.
	// Son [money =150, car=2]
	System.out.println(s5.money); // 150
	// Q7-2. 출력되는 화면을 적으시오.
	// 150
	System.out.println(((Papa)s5).money); // 10
	System.out.println(((Papa)s5).toString()); // Son [money=150, car=2]
	
	ArrayList<String> list = new ArrayList<>(); // 다음주 진행 ctrl + shift + o (import)
	
	// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
	
	
	
	} // end main
}     // end class

/*Q8. 오버로딩과 오버라이딩의 차이점을 적으시오.
오버로딩 : 메서드의 이름을 같게, 알규먼트 자료형과 갯수를 다르게해 구분 / 비슷한기능
오버라이딩: 상속시 부모의 메서드를 자식에게 맞게 수정해서 사용 
*/ 
















