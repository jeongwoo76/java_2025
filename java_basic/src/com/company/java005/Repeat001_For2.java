package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		//무한반복
		for(;;) {  // #1. 조건이 없으면 무한반복
			System.out.println("숫자1을 입력하시오.");
			int a = scanner.nextInt();
			if(a==1) {break;}
			// a가 1이라면 나가기  #2.나갈조건
		}
		
		// for - break
		//  1 2   - 3뒤로 없어짐! break
		for (int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.print(i+"\t");
		}
		System.out.println();
		// for - continue   - skip
		// 1 2 (3) 4 5 6 7 8 9 10
		for (int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.print(i+"\t");
		}
		
		
		
		
		
	}   // end main
 
}       // end class
// 25