package com.company.java006;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		for (;;) { 
			System.out.println("1을 입력하세요");
			int a= scanner.nextInt();
			if(a==1) {break;}
			}
	}

}
