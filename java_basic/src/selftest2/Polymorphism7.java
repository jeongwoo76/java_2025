package selftest2;
/*
	Object
	  ↑
	 Papa { money = 10000 /  sing()  }
	  ↑
	 Son2 { money = 1500  /  sing()  }
*/
class Papa extends Object{  
	   int money = 10000;     
	   public Papa() { super(); }
	   public void sing() {  System.out.println("GOD-거짓말");  }
}// end class
class Son2 extends Papa{ 
	   int money = 1500;
	   public Son2() { super(); }
	   @Override public void sing() {  System.out.println("빅뱅-거짓말"); }
} // end class

public class Polymorphism7 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		//Papa mypapa 								 { money = 10000 /  sing()  }
		//new Son2() -{ money = 1500  /  sing()  } - { money = 10000 /  ------- }  @Override
		System.out.println(mypapa.money); //##1. 예상되는 출력결과? money = 10000
		mypapa.sing();  //##1. 예상되는 출력결과? 빅뱅-거짓말
		
		//##2. 1500 출력되게 해주세요
		System.out.println( ((Son2)mypapa).money);
		 
	} // end main
}     //end class
