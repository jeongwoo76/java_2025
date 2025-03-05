package com.company.java012;
//1. 클래스는 부품객체
//2. 상태는 멤버변수 + 행위는 멤버함수
//3. 클래스 재사용(재활용)  , 오버라이드(@Override)- 부모메서드 나한테맞게 수정
/*                                         MobileNote9 my9= new MobileNote9();              
    Object                                            Object()     {#4        }#5 
      ↑
    MobileNote7  String iris(private)                 MobileNote7(){#3        }#6 iris초기화
    		     void newshow(){} , getter/setter
      ↑
    MobileNote8  String face(private)                 MobileNote8(){#2        }#7 face초기화
    			 void newshow(){} , getter/setter
      ↑
    MobileNote9 int battery(private)                  MobileNote9(){#1        }#8 battery초기화
    			void newshow(){} , getter/setter
*/
class MobileNote7 extends Object     { 
	private String iris;
	void newshow(){ System.out.println(":::: NOTE 7 = 홍채인식 >" +this.iris);}
	// public > protected > package(#) 보다 더 넓게 > private 
	public String getIris() { return iris; }
	public void setIris(String iris) { this.iris = iris; }
}
class MobileNote8 extends MobileNote7{ 
	private String face;
	@Override protected void newshow(){ 
		super.newshow(); //MobileNote7의 newshow()
		System.out.println(":::: NOTE 8 = 안면인식 >" +this.face);}
	
	public String getFace() { return face; }
	public void setFace(String face) { this.face = face; }
}
class MobileNote9 extends MobileNote8{ 
	private int battery=24;  // 기본값 -> 명시적 ->초기화블록  ->생성자
	//@Override void newshow1(){  // MobileNote9 must override or implement a supertype method
	@Override public void newshow(){ 
		super.newshow();  //MobileNote8의 newshow()
		System.out.println(":::: NOTE 9 = 하루종일 배터리사용 >" +this.battery);}
	
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; } 
}


public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9= new MobileNote9();
		my9.setIris("brown"); my9.setFace("pretty"); my9.newshow();
	}
}
