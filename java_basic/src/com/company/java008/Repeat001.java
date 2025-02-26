package com.company.java008;

public class Repeat001 {
	public static void main(String[] args) {
    // Q1 int보다 작은 자료형 -byte, short/char 연산시 int기본형으로변환
	byte b1=1;   byte b2=2;   
	byte result1 =  (byte) (b1+b2);	
	int result2 =  b1+b2;	
	System.out.println(result1+"\n"+result2);
		
	} // end main
}     // end class
/*1) 클래스명 : Repeat001
다음 오류를 해결하시오.  오류가 나는 이유는?
byte b1=1;   byte b2=2;   byte result = b1+b2;
 */
