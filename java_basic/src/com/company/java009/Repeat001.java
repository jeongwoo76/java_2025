package com.company.java009;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
    

	Scanner scanner = new Scanner(System.in);
	System.out.print("문자 한개 입력>"); char a = scanner.next().charAt(0);
	
	     if (a=='j') {System.out.println("java");}
	else if (a=='h') {System.out.println("html");}
	else if (a=='c') {System.out.println("css");}
	     
	} // end main
}     // end class

/* 1) 클래스명 : Repeat001
문자를 한개 입력받아
if ver - 가   'j'이면  java,  'h'이면   html,   'c'이면 css
*/
