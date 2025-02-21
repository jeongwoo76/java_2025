package com.company.java005;

import java.util.Scanner;

public class RepeatEx006_menu {
	public static void main(String[] args) {
		// 1. 변수
		int num=-1; 
		Scanner scanner = new Scanner(System.in);
		// 기능1) 2. 입력 3.처리 4.출력
		for(;;) {   // 1-1 무한반복
			System.out.println("======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
			num = scanner.nextInt();
			if(num==9) {break;}    //  #1-2 빠져나올조건
		
		switch(num) {
		case 1: System.out.println("추가"); break;
		case 2: System.out.println("조회"); break;
		case 3: System.out.println("입금"); break;
		case 4: System.out.println("출금"); break;
		case 5: System.out.println("삭제"); break;
		
        }
	}
		
	}  // end main
}      // end class
/////// 메뉴판 만들기
	// 	RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
	