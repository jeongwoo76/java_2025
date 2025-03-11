package selftest2;

/*
1. 상속? 재사용
2. class 자식클래스 extends 부모클래스
3.
	Object				#4 Object() {       #5}객체생성
	  ↑
	  A1  {a}			#3 A1() {	 a=0;   #6}
	  ↑
	  B1  {b}			#2 B1() {	 b=0;   #7}
	  ↑
	  C1  {c}			#1 C1() {	 c=0;   #8}
	  
	  객체호출순서 :	C1()	B1()	A1()	Object()
	  객체생성순서 :	Object	A1		B1		C1
	  
*/
class A1 extends Object  {// Object를 상속받는다
	int a;
	public A1() { super(); }
	public A1(int a) { super(); this.a = a; }
}
class B1 extends A1 { // A1을 상속받는다
	int b;  
	public B1() { super(); }
	public B1(int b) { super(); this.b = b; }
	public B1(int a, int b) { super(a); this.b = b; }
}
class C1 extends B1 { // B1을 상속받는다
	int c;  
	public void showC() {
	System.out.println("상속받은 A클래스의 a:" + a ); 
	System.out.println("상속받은 B클래스의 b:" + b ); 
	System.out.println("자신의멤버  C클래스의 c:" +c ); 
	}
}

public class Extends001 {
	public static void main(String[] args) {
		C1 myc =new C1();
		myc.a =10; myc.b=20; myc.c=30; myc.showC();
		
	}
}
/*
Q1) 클래스를 상속하는 이유를 적으시오.
클래스를 재사용하기위해서

Q2) 상속의 형식을 적으시오.
class 자식클래스 extends 부모클래스

출력결과
상속받은 A클래스의 a:10
상속받은 B클래스의 b:20
자신의멤버  C클래스의 c:30
*/

