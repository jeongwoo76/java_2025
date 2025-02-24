package com.company.java006;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		int a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 한개 입력>");
		a= scanner.nextInt();
		
		switch (a) {
		case 10: System.out.print("10이다");   break;
		case 20: System.out.print("20이다");   break;
		case 30: System.out.print("30이다");   break;
		}
	}

}
