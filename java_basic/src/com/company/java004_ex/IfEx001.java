package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		int avg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("평균을 입력하시오"); avg = scanner.nextInt();
		if (avg>=60) { System.out.println("합격");  }
		else         { System.out.println("불합격"); }
		
		// 평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오.
		// gigo
		// 변수
		// 		int avg; String result ="불합격";
		// 		Scanner scanner = new Scanner(System.in);
		// 입력
		// 		System.out.print("평균을 입력하시오>"); avg = scanner.nextInt();
		// 처리 
		//     - if(60점이상이면) {합격} 
		//
		// 		if (avg>=60) {result ="합격";}
		// 출력
		// 		System.out.println(result);  }  불합격 -조건에 맞으면 합격
		 
	} // end main
}   // end class
/*연습문제1)
패키지명 : com.company.java004_ex
클래스명 :  IfEx001
출력내용 : 평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오.
*/