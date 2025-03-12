package com.company.java017;

class Marine{   
	// 멤버변수
	int x; int y;  int hp; 	     // 각 병사의 x, y좌표 ,  hp 병사의 체력    인스턴스변수
			     //   heap area, new O , this, 각각
	static int weapon = 5;    // 공격력         클래스변수   
	static int armor  = 0;      // 방어력         클래스변수
			      //  method area, new X, 공유
	// 멤버함수
	void move(int x, int y){  this.x = x;   this.y=y; }    // 지역변수 int x, int y
														   //  stack 영역
    void weaponUp() {  weapon++; }	        
	void armorUp()  {  armor++;  } 
	// 생성자
}
public class Repeat002 {

}
/*
10-1.  Marine은 각 병사가 가진 내용이다.  (각 병사의 x, y좌표 ,  hp 병사의 체력)
공격력과 방어력은 병사들이 합쳐진 힘이다.
static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가  ?

> 공통으로 사용하는 변수는 static을 붙여서 공유. runtime - method area

static int weapon
static int armor

10-2.  인스턴스변수, 클래스변수 구분하고 메모리 위치를 적으시오. 
*/