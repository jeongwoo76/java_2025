package com.company.java014_ex;

import java.util.Arrays;
import java.util.Calendar;

interface Launch{ int MONEY =10000; void eat();  }
class Burger implements Launch {
	int price;
	public Burger() { this.price = 3900; }
	@Override public void eat() {  System.out.println("Burger 냠냠!");}
	@Override public String toString() { return "Burger "; }
}
class KimchiStew implements Launch {
	int price;
	public KimchiStew() {  this.price = 4000; }
	@Override public void eat() {  System.out.println("KimchiStew 냠냠!");}
	@Override public String toString() { return "KimchiStew "; }
}
class User{
	int money; int cnt;
	Launch[] plate;
	User() { money = Launch.MONEY; plate = new Launch[3]; cnt=0;}
	
	void order(Launch a){ // Launch a = new Burger(); / Launch a = new KimchiStew();
		//1. 주문한 메뉴의 값 확인
		int temp=0;
		     if( a instanceof Burger     ) {System.out.println("버거하나요~");    temp = ((Burger)a).price;     }
		else if( a instanceof KimchiStew ) {System.out.println("김치찌개하나요~"); temp = ((KimchiStew)a).price; }
		//2. 내가 가진돈 확인
		if(money<temp) {System.out.println(">> 잔액부족 주문불가능");   return;}
		money-=temp;
		//3. plate에 주문받은거 넣기
		plate[cnt++] = a;   //System.out.println(money+ "-" + Arrays.toString(plate));
		// 버거하나요~  김치찌개하나요~  버거하나요~ / 잔액부족 주문불가능
	} //주문   주문이 처음에는 3개공간처리, 공간이 없으면 3,6,9,,, 증가되도록 처리하시오.
					       // 10000을 넘으면 잔액이 부족합니다.를 출력합니다.
	void show() {
		String order ="주문 :";
		for(int i=0; i<cnt; i++) { order+= ((i!=0) ?"," :" ") + plate[i]; }
		System.out.println("\n\n "+ order);
		System.out.println("주문금액 : "+ (Launch.MONEY-money));
		System.out.println("잔액 : "+money);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(1)     + "년" +      // 년
						  ( today.get(2)+1) + "월" +      // 월 0~11 (0: 1월)
						    today.get(5)    + "일"     ); // 일
		
		//java.lang.NullPointerException - 공간은 있으나 값이 없다.
		//for(Launch a : plate) {a.eat();} //  부모에서 메서드호출시 @Override - 자식메서드호출
		for( int i=0; i<cnt; i++ ) { plate[i].eat(); }
	} //출력 
	// 주문 : 
	// 주문금액 :
	// 잔액 :
	// 날짜 :
	// eat()
}

/* 연관관계
 				 <<interface>> static final  MONEY =10000
User     →		  Launch     abstract 		 void eat();
money			   ↑         ↑
plate			Burger        KimchiStew
				price=3900    price=4000
				eat()         eat()         @Override

*/

public class InterfaceEx004 {
	public static void main(String[] args) {
		User launchorder = new User();
												 // 리턴값 메서드명(파라미터)
		launchorder.order(new  Burger());        // void order(Launch a){}
		launchorder.order(new  KimchiStew());    // Launch a = new KimchiStew() 부모 = 자식
		launchorder.order(new  Burger());		 // Launch a = new Burger() 부모 = 자식
												 
		launchorder.show();     // 리턴값 메서드명(파라미터)
								// void show() {}

	}

}
