package com.company.java006_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
	
		// ver-1 눈에 보이는 대로 출력
		// ABCDE   
		// FGHIJ
		// KLMNO
		// PQRST
		// UVWXY
		// Z 
		
		//		System.out.println();System.out.print('A');System.out.print('B');System.out.print('C');System.out.print('D');System.out.print('E');
		//		System.out.println();System.out.print('F');System.out.print('G');System.out.print('H');System.out.print('I');System.out.print('J');
		//		System.out.println();System.out.print('K');System.out.print('L');System.out.print('M');System.out.print('N');System.out.print('O');
		//		System.out.println();System.out.print('P');System.out.print('Q');System.out.print('R');System.out.print('S');System.out.print('T');
		//		System.out.println();System.out.print('U');System.out.print('V');System.out.print('W');System.out.print('X');System.out.print('Y');
		//		System.out.println();System.out.print('Z');
		
		// ver-2 
		// System.out.println();    1)줄바꿈 - 5번째마다
		// System.out.println('A'); 2)알파벳 5개 출력           2)알파벳이랑 연결? A(65) F(70)  K(75)
		
		//		if('A'%5==0) {System.out.println();} System.out.print('A');
		//		if('B'%5==0) {System.out.println();} System.out.print('B');
		//		if('C'%5==0) {System.out.println();} System.out.print('C');
		//		if('D'%5==0) {System.out.println();} System.out.print('D');
		//		if('E'%5==0) {System.out.println();} System.out.print('E');
		//		if('F'%5==0) {System.out.println();} System.out.print('F');
		
		for(char ch='A'; ch<='Z'; ch++) { if(ch%5==0) {System.out.println(); } System.out.print(ch); }   System.out.println();
		
		char ch='A'; while( ch<='Z') { if(ch%5==0) {System.out.println(); } System.out.print(ch);  ch++; }  System.out.println();
	
		ch='A'; do { if(ch%5==0) {System.out.println(); } System.out.print(ch);  ch++; }while( ch<='Z'); 
		
		
		
	}  // end main
}   // end class
/*
연습문제9)  for/while/do while
패키지명 : com.company.java006_ex
클래스명 :  RepeatEx009
for , while , do while 3가지 버젼으로 
ABCDE   
FGHIJ
KLMNO
PQRST
UVWXY
Z 
*/