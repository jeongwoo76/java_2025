package com.company.java008;

public class Method003 {
	
	
	public static String   sign() {return "sally";}
	public static int       num() {return (int) (Math.random()*45); } // 0~0.9999

	/////////////////////////////////////////////
	public static void main(String[] args) {
		// public static 리턴값 메서드명(파라미터) 
		// public static sally sign(    )  {return "sally";  }
		// public static String sign(    )  {return "sally"; }
		System.out.println("당신의 이름은? " +sign());
		//                  당신의 이름은?   sally  
		
		// public static 리턴값 메서드명(파라미터) { }
		// public static int num() {return 좋아하는 숫자; }
		                  int yournum = num();
		System.out.println("랜덤숫자 : "+yournum);
		
		// public static 리턴값 메서드명(파라미터) { }
		// public static 3.1414592 pie() { }
		// public static double    pie() { return 3.141592; }
		System.out.println("파이값? " +pie());  // 3.141592
		
		// public static 리턴값 메서드명(파라미터) { }
		// public static "안녕 alpha" hello("alpha") { }
		// public static String      hello(String str) {return "안녕 " + str; }		
		System.out.println( hello("sally") );  // 안녕 sally
		System.out.println( hello("alpha") );  // 안녕 alpha
	}
   //////////////////////////////////////////////
	public static double    pie() { return 3.141592; }
	public static String      hello(String str) {return "안녕 " + str; }
}
