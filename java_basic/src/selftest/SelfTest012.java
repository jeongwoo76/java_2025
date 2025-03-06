package selftest;

import java.util.Scanner;

public class SelfTest012 {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요>"); num = scanner.nextInt();
			if (num>=1 && num<=100) {break;} 
		}	
		

	}

}
/*
[SelfTest012] while
 * 1~100사이를 입력할때까지 무한반복하기 
 * 만약 1~100사이를 입력하면 빠져나오기
*/