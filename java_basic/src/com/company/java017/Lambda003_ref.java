package com.company.java017;

class 		RefClass { void method(String str) { System.out.println(str); } }
interface InterUsing { void inter(RefClass c, String str);          	    }

public class Lambda003_ref {
	public static void main(String[] args) {
		//#1. 익명클래스 
		InterUsing a1 = new InterUsing() {
			@Override public void inter(RefClass c, String str) {  
				c.method(str);
			}
		};
		// RefClass c = new RefClass() , String str = "Hello :)"
		a1.inter(new RefClass(), "Hello :)"); 
		
		//#2. 람다 () -> {}
		InterUsing a2 = (RefClass c, 		String str) -> { c.method(str); };
		a2.inter(		new RefClass(), 	"Hello :)"); 
		
		
		//#3. :: 표현식 (참조)
		InterUsing a3 =        RefClass::method;
		a3.inter(		new RefClass(),  "Hello :)"); 
		
		//#4. interface InterBasic { int  method(int a, int b);    }
		//								리턴값 O         파라미터O
		InterBasic basic = 			(int a, int b) -> { return Math.max(a, b); };
		System.out.println( basic.method(10, 3)  );   // 큰값 
		
		InterBasic basic2 = 			(a, b) ->  Math.max(a, b); 
		System.out.println( basic2.method(10, 3)  );   // 큰값 
		
		InterBasic basic3 = 			Math::max;
		System.out.println( basic3.method(10, 3)  );   // 큰값 
		
		//Ex1 interface InterEx1 {   int  method(String str  );    }
		// 아래식을 :: 바꾸기
		InterEx1 ex1 =  str -> str.length();  // String 클래스의 length() 사용
		System.out.println(ex1.method("ABC"));
		
		InterEx1 ex11 =   String::length;
		System.out.println(ex11.method("ABC"));
		
		//Ex2 interface InterEx2 {   void  method(int num );    }
		// 아래식을 :: 바꾸기
		InterEx2 ex2 = num -> System.out.println(num);
		ex2.method(100);
		
		InterEx2 ex21 = System.out::println; // System.out의 println() 사용
		ex21.method(100);
		
	}
}

interface InterBasic {   int  method(int a, int b);  }
interface InterEx1   {   int  method(String str  );  }
interface InterEx2   {   void method(int num );      }




