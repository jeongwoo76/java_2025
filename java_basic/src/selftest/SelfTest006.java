package selftest;

import java.util.Scanner;

public class SelfTest006 {
	public static void main(String[] args) {
		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요>"); kor = scanner.nextInt();
		if (kor>=90) {System.out.println("수");}
		else if (kor>=80) {System.out.println("우");}
		else if (kor>=70) {System.out.println("미");}
		else if (kor>=60) {System.out.println("양");}
		else {System.out.println("가");}

	}
}
/*
[SelfTest006] If ~ ELSE (3형식)
 * 여러개의 조건
   	[1]국어점수를입력해주세요 __입력받기
   	90점이상이라면 수	 / 80점 이상이라면 우/ 70점 이상이라면 미 /60점이상이라면 양 / 그 이외 가
*/