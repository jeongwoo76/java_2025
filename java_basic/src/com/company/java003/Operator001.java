package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main(String[] args) {
		// 먼저()  값 (+,-,*,/,%,++,--) 비교(>,<,>=,<=) 조건 (&&, ||, ?:) 대입(=)
		// 1.  값 (+,-,*,/,%,++,--)
		int a=10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);   // 몫     3
		System.out.println(a%b);   // 나머지  1
		
		//Q1. 나머지연산자 - 짝수니? 홀수니?
		//Q2. 3의배수?
		
		//A1. 나머지연산자 - 짝수니? 홀수니?
		//짝수 : 0(짝수) 1(홀수) 2(짝수) 3(홀수) - 2로 나웠을떄 나머지가 0이라면 짝수
		// 0%2 = 0이면 짝수
		// 1%2 = 1이면 홀수 
		// 2%2 = 0이면 짝수
		System.out.println(0%2 + " " + 1%2 + " " + 2%2 + " " + 3%2 );
		
		//A2. 3의배수
		//1%3 =1 나머지 1
		//2%3 =2 나머지 2
		//3%3 =0 나머지 0    // 3의배수라면 0   나머지 1,2
		System.out.println(1%3 + " " + 2%3 + " " + 3%3 );  // 1 2 0
		
		
		//2. 비교(==, !=, <, >, <=(이하), >=(이상))
		//Q1. 나머지연산자 - 짝수니? 홀수니?
	    //Q2. 3의배수?
		System.out.println(10>3);   // true
		System.out.println(10<3);   // false
		// a =10   a가 짝수니?  == 2로 나눈 나머지연산시 0 == a%2 ==0
		System.out.println(a%2 == 0);    // 짝수표현    true
		System.out.println(a%2 == 1);    // 홀수표현    false
		// b=3 b가 3의 배수니? == 3으로 나눈 나머지 연산시 0
		System.out.println(b%3 == 0);  // true
		
		//3. 조건( &  &&(조건1, 조건2 모든 조건 만족시)  |  ||(조건1, 조건2 여러조건중 하나)
		System.out.println( true  &  true   );  // true
		System.out.println( true  && true   );  // true         모든조건 만족시
		System.out.println( false &  true   );  // false        & 처음도 false 뒤에조건까지 읽음
		System.out.println( false && true   );  // false        Dead code
		
		System.out.println( true  |  true   );  // true    하나라도 조건에 맞으면 ok
		System.out.println( true  || true   );  // true    Dead code
		System.out.println( false |  true   );  // true
		System.out.println( false || true   );  // true
		
		
		//4. :(조건)? 참:거짓
		System.out.println( (a>b)? "a>b":"a<b"  );
		System.out.println( (3%2==0)? "짝수":"홀수" );
		
		//q1) 2의 배수이면서 5의배수라면 true / false
		System.out.println(a%2==0 && a%5==0);
		//q2) 2의 배수이거나 3의배수라면 true / false
		System.out.println(a%2==0 || a%3==0);
		
		//q3) 숫자를 입력받아 0보다크면 양수, 0보다 작으면 음수, 아니라면 0
		// 변수 -입력-처리-출력
		int q3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("좋아하는 숫자 입력 양수, 음수, 0 >");
		q3 = scanner.nextInt();
		System.out.println( (q3>0)? "양수" :   (q3<0)? "음수":"0" );
		
		
		
		//5. 대입
		a =10;
		System.out.println(a +=b);  // 1)a+b  2) a= 1번한결과
		System.out.println(a -=b);   
		System.out.println(a *=b);
		System.out.println(a /=b);
		System.out.println(a %=b);
		
		// () 값 비교조건 대입
		
		// 6. ++, -- ( 단항 )
		int a1=1, b1=1, c1=1, d1=1;        
		//                    ←
		System.out.println(++a1);  //2     1)증가 2)출력
		System.out.println(a1);    //2
		//      	       ←
		System.out.println(b1++);  //1     1)출력   2)증가     
		System.out.println(b1);    //2
		//     				   ←
		System.out.println(--c1);  //0     1) 1감소  2)출력
		System.out.println(c1);    //0
		//      			←
		System.out.println(d1--);  //1     1)출력    2) 1감소
		System.out.println(d1);    //0
		
		
	} // end main
}   // end  class
