package com.company.java014_ex;

interface Calc{ public double exec(double num1, double num2); }

public class NoNameClassEx001 {
	public static void main(String[] args) {
		Calc calc =new Calc() {
			@Override public double exec(double num1, double num2) { return num1+num2; }
		};
		System.out.println(calc.exec(10,3));
		// interface
		// Calc calc =new Calc();  (X)
		// Calc calc =new Calc(){ 메서드구현  };   (O)
	}
}
/*
연습문제1)  익명클래스
패키지명 : com.company.java014_ex
클래스명 : NoNameClassEx001
다음과 같이 코드를 작성하시오.
    interface Calc{ public double exec(double num1, double num2); }

   사용하는부분)  익명클래스 Calc 인터페이스 테스트하기
   - 구현객체안만들고 exec를 이용해서 더하기 기능이 가능한지 확인
   System.out.println(calc.exec(10,3));  //13  더하기기능
*/