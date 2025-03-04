package selftest;

import java.util.Scanner;

public class SelfTest003 {
	public static void main(String[] args) {
		String name=" ";
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요>"); name= scanner.next();
		System.out.println("당신의이름은" + name + "입니다");
	}
}
/*
[SelfTest003] 입력   Scanner 테스트
		   	당신의 이름을 입력하세요. __입력받기
		 	당신의 이름은 __입니다.
*/
