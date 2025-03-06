package selftest;

public class SelfTest021 {
	
	static void print (int x, int y) {  System.out.println(x+y);  }
	static void print (double x, double y) {  System.out.println(x+y);  }
	
	public static void main(String[] args) {
		print(3,5);	
		print(1.2,3.4);
	}
	

}
/*
[SelfTest021] 함수(4) : 메서드오버로딩
	1. 다음의 결과가 나오게 메서드를 구현하시오		    
	print(3,5);			결과값 :   8 출력
	print(1.2,3.4);		결과값 :   4.6출력
*/