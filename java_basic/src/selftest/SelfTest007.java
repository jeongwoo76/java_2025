package selftest;

import java.util.Scanner;

public class SelfTest007 {

	public static void main(String[] args) {
	char ch=' ';
	Scanner scanner = new Scanner(System.in); 
	System.out.print("a,b,c 중에 입력해주세요>");  ch = scanner.next().charAt(0);
	
	switch(ch) {
	case 'a' :   System.out.println("apple");   break;
	case 'A' :   System.out.println("apple");   break;
	case 'b' :   System.out.println("banana");  break;
	case 'B' :   System.out.println("banana");  break;
	case 'c' :   System.out.println("coconut"); break;
	case 'C' :   System.out.println("coconut"); break;
	
	}
	

	}
}
/*
[SelfTest007] SWITCH
	a,b,c중에 입력해주세요
	a또는 A라면 apple
	b또는 B라면 banana
	c또는 C라면 coconut
	그이외 대소문자 관계없이 a,b,c만 입력가능합니다 
*/