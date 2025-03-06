package selftest;

public class SelfTest020 {
	
	public static String      hi(String str) {return "Hi! " + str;  }
	
	public static void main(String[] args) {
		
		System.out.println(  hi("sally"));
	}
}
/*
[SelfTest020] 함수(3) : return 
1. 메인은 다음과 같다.
	System.out.println(  hi("sally"));
	
2. 다음과 같이 출력    Hi! sally~!
*/