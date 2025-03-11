package selftest2;

class Sawon005{
	int pay=10000; //(1) 인스턴스변수, heap, new O, 실체화,  this 각각
	
	static int su=10; //(2) 클래스변수, method, new X, 공유
	//static int basicpay=pay; //// ###000 //X 클래스변수 = 인스턴스변수 (3)클래스변수 - this, 인스턴스사용불가 
	static int basicpay2;   //(4) 클래스변수, method, new X, 공유
	static { basicpay2=20000; }
	
	public static void showSu() { System.out.println(su); } //// ###001 
	// (5) 클래스 메서드, method, new X, 공유 Sawon005.showSu()
	//public static void showPay() { System.out.println(this.pay); } //// ###002  // static 에서는 this 사용할수 없다.
	public void showAll001() { //// ###003 //(6) 인스턴스메서드, heap, new O, 실체화,  this 각각
	System.out.println(su);
	System.out.println(this.pay);
	}
/*	public static void showAll002() {////###004 //X (7) 클래스메서드- method - new X - 공유
		showAll001();                
		System.out.println(this.pay);   // static 에서는 this, 인스턴스사용불가  
	} */
}
public class Class029 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
		

	} // end main
}     // end class

/* 이론
8.  static
   1. jvm이    method area  에 1번만 메모리를 올림
   2. 클래스명.변수명, 클래스명.메서드명
   3. 예시)
    가. 클래스변수        나. method area  다. new X  공용   라. A.company
     class A{ static String company; }
*/
