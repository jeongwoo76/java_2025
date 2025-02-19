package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[] args) {
		int kor, eng, math, total; double avg;
		Scanner scanner =new Scanner(System.in);
		System.out.print("국어점수를 입력하시오 >"); kor =scanner.nextInt();
		System.out.print("영어점수를 입력하시오 >"); eng =scanner.nextInt();
		System.out.print("수학점수를 입력하시오 >"); math =scanner.nextInt();
		total = kor + eng + math;
		avg = total / 3.0;
		System.out.printf(" 총점 : %d \n 평균 : %.2f",total, avg);
	}
}
