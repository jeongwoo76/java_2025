package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[] args) {
		// 변수
		int kor, eng, math, total, level; double avg;
		Scanner scanner = new Scanner(System.in);
		// 입력
		// 국어점수 입력 > 100
		// 영어점수 입력 > 100
		// 수학점수 입력 > 99
		System.out.print("국어점수 입력 >"); kor  = scanner.nextInt();
		System.out.print("영어점수 입력 >"); eng  = scanner.nextInt();
		System.out.print("수학점수 입력 >"); math = scanner.nextInt();
		// 처리 (총점, 평균, 레벨)
		total = kor + eng + math;
		avg = total/3.0;     // (double) total /3;     total /(double)3;   
		level = (int) avg /10;
		// 출력
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ ":: GOOD  IT SCORE ::\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "국어\t영어\t수학\t총점\t평균\t레벨");
		System.out.println(kor + "\t"  + eng +"\t" + math + "\t" + total + "\t" + String.format("%.2f",avg) + "\t" + level);
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d\t", kor, eng, math, total, avg, level);
		
		
		
//		int kor, eng, math, total, level; double avg;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("국어점수 입력 >"); kor  = scanner.nextInt();
//		System.out.print("영어점수 입력 >"); eng  = scanner.nextInt();
//		System.out.print("수학점수 입력 >"); math = scanner.nextInt();
//		
//		total = kor + eng + math;
//		avg = total/3.0;
//		level = (int) avg /10;
//		System.out.printf("국어 : %d 영어 : %d 수학 : %d 총점 : %d 평균 : %.2f 레벨 : %d ", kor, eng, math, total, avg, level);
		
	}// end main
} // end class
/*연습문제2)
패키지명 : com.company.java003_ex
클래스명 : CastingEx002
출력내용 :  Scanner이용해서  성적처리를 입력받고 출력하시오.
 1.  국어, 영어, 수학, 총점☆자료형을 int 
 2.  레벨 - 평균이 90점대이면 레벨 9, 80점대면 8, 70점대면 7, 60점대면 6,,,,

국어점수 입력 > 100
영어점수 입력 > 100
수학점수 입력 > 99

:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
:: GOOD  IT SCORE ::
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
국어   영어   수학   총점   평균   레벨
100   100   99   299   99.67   9

*/