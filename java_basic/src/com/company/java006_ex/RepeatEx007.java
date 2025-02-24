package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String[] args) {
	
	 // 1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
	 System.out.println("q1"); 
	    for(int i=1; i<=5; i++) {System.out.print(i+"\t");}       System.out.println();
	    int i=1;  while(  i<=5) {System.out.print(i+"\t"); i++;}  System.out.println();
		i=1;  do{System.out.print(i+"\t"); i++;}while(  i<=5);    System.out.println();

     // 2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
     System.out.println("q2");
	     for(int a=5; a>=1; a--) {System.out.print(a+"\t");}     System.out.println();
	     int a=5;  while( a>=1) {System.out.print(a+"\t");a--;}  System.out.println();
	     a=5; do {System.out.print(a+"\t");a--;}while( a>=1);    System.out.println();
     
     // 3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
     System.out.println("q3");
	     for (int b=1; b<=3; b++) {System.out.print("JAVA"+b+"\t");}     System.out.println();
	     int b=1; while ( b<=3) {System.out.print("JAVA"+b+"\t"); b++;}  System.out.println();
	     b=1; do {System.out.print("JAVA"+b+"\t"); b++;}while ( b<=3);   System.out.println();
     
    
	}  // end main
}    // end class

/*
연습문제7)  for/while/do while
패키지명 : com.company.java006_ex
클래스명 :  RepeatEx007
1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
*/
