package com.company.java004_ex;

import java.util.Scanner;

public class ForEx006_2 {
	public static void main(String[] args) {
		int num1=-1, num2=-2; String result="";
		char op=' ';
		Scanner scanner = new Scanner(System.in);
		// 입력
		/*  break (빠져나와!)  / continue (밑에꺼 skip)
		 for(;;) {  // 1-1. 무한반복
		     // #todo1 if(잘못썼으면){ 숫자1입력받기 } -> if(!(0<=num1 && num1<=100)){ 숫자1입력받기 }
		     // #todo2 if(잘못썼으면){ 숫자2입력받기 }
		     // #todo3 if(잘못썼으면){ 연산자입력받기 }
		     // 1-2 빠져나올조건- 빠져나오기 break
		 
		 */
		for(;;) {
			if(!(0<=num1 && num1<=100)){  // 잘쓴범위가 아니라면 입력시도/  잘쓴범위면 입력x
			System.out.print("정수1을 하나 입력해주세요>"); num1 = scanner.nextInt();   continue;
			  // continue;       잘못입력받았으면 아래꺼 진행하면 안됨.
			}
			if( 0>num2 || num2>100){   // -1  || 101
				System.out.print("정수2을 하나 입력해주세요>"); num2 = scanner.nextInt(); continue;
			}
			if(!(op=='+' || op=='-' || op=='*' || op=='/') ) { // 잘쓴범위가 아니라면 입력시도/  잘쓴범위면 입력x
			System.out.print("연산자를 입력해주세요>"); op = scanner.next().charAt(0); continue;
			      // continue;       잘못입력받았으면 아래꺼 진행하면 안됨.
			}       
			break;  // num1, num2, op 잘쓴경우
			
		}
		
		
		     if (op=='+') { result="" +(num1+num2);                          }
		else if (op=='-') { result="" +(num1-num2);                          }
		else if (op=='*') { result="" +(num1*num2);                          }
		else if (op=='/') { result=String.format("%.2f",(num1/(float)num2)); }
		     
		    System.out.println(""+ num1 + op + num2 + "=" + result);
		
	} // end main
}  // end class

/*연습문제6)  for 무한반복
패키지명 : com.company.java004_ex
클래스명 :  ForEx006
출력내용 :  계산기

1)  각 연산자에 맞게 계산처리
2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
     

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13
 */
