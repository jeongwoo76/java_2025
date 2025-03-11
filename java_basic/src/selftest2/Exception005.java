package selftest2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception005 {
	public static int nextInt() throws InputMismatchException {
		int one=-1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1을 입력하세요>");
		one =scanner.nextInt();
		return one;  
	}

	public static void main(String[] args) {
		int one =0;
		while(true) {
			try {
				one = nextInt(); 
				if(one==1) break;
			} catch(Exception e) {System.out.println("숫자만입력가능합니다."); }
		}
		
	} // end main
}     // end class
