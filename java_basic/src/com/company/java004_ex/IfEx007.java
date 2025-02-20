package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		int num1, num2; String result=""; 
		char operator=' ';
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 하나 입력해주세요>"); 
		num1 = scanner.nextInt();
		System.out.print("정수를 하나 입력해주세요>"); 
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/)>"); 
		operator =scanner.next().charAt(0); 
		
		     if (operator=='+')  { result ="" +(num1+num2);                           }
		else if (operator=='-')  { result ="" +(num1-num2);                           }
		else if (operator=='*')  { result ="" +(num1*num2);                           }
		else if (operator=='/')  { result =String.format("%.2f",(num1/(float)num2));  }  
		
		     System.out.println(""+ num1+ operator+ num2 + "=" + result);
		     

	}
}
/*연습문제7)  ※ 숙제
패키지명 : com.company.java004_ex
클래스명 :  IfEx007
출력내용 :  계산기

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > -
10-3=7
출처: https://hi-sally03915.tistory.com/1595 [:DB:DBIG:티스토리]
*/