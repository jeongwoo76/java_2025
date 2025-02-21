package com.company.java005;

public class Repeat001_For {
	public static void main(String[] args) {
		// step1
		System.out.println("step1) ");
		System.out.print(1+"\t");   // {}      시작1
		System.out.print(2+"\t");   // {변수}   증감1
		System.out.print(3+"\t");   //         종료3
		
		
		// step2
		System.out.println("\n\nstep2) ");
		// {반복}  {변수}   for(시작;종료;변화)
		for (int i=1; i<=3; i++)
		{ System.out.print(i+"\t"); }         
		
		// step3
		System.out.println("\n\nstep3) ");
		for (int i=11; i<=20; i++)    // 11~20   
		{ System.out.print(i+"\t"); }                System.out.println();
		
		for (int i=3; i<=8; i++)    // 3~8
		{ System.out.print(i+"\t"); }                System.out.println();   
		
		for (int i=1; i<=10; i++)    // 1~10
		{ System.out.print(i+"\t"); }                System.out.println();
		
		
		for (int i=1; i<=5; i+=2)    // 1 3 5
		{ System.out.print(i+"\t"); }                System.out.println();
		
		
	}  // end main
}   // end class
  