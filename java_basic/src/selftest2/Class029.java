package selftest2;

class Sawon005{
	int pay=10000;
	
	static int su=10;
	//static int basicpay=pay; //// ###000 //X 클래스변수 = 인스턴스변수 (클래스변수, 클래스메서드 - this, 인스턴스사용불가) 
	static int basicpay2;
	static { basicpay2=20000; }
	
	public static void showSu() { System.out.println(su); } //// ###001
	//public static void showPay() { System.out.println(this.pay); } //// ###002  // static 에서는 this 사용할수 없다.
	public void showAll001() { //// ###003
	System.out.println(su);
	System.out.println(this.pay);
	}
/*	public static void showAll002() {////###004 //X 클래스함수- method - new X - 공유
		showAll001();                // // 인스턴스 사용불가 - heap -new O -this, 생성자 
		System.out.println(this.pay);   // static 에서는 this 사용할수 없다. 
	} */
}
public class Class029 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
		

	} // end main
}     // end class
