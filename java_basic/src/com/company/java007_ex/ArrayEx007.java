package com.company.java007_ex;

public class ArrayEx007 {
	public static void main(String[] args) {
	// 변수	
	char [] arr =new char[5];
	// A   B   C   D   E 
	// ver-1  arr[0] = 'A'; arr[1] = 'B'; arr[2] = 'C'; arr[3] = 'D'; arr[4] = 'E';
	// ver-2  char data= 'A';
	//	arr[0] = data++;
	//	arr[1] = data++;
	//	arr[2] = data++;
	//	arr[3] = data++;
	//	arr[4] = data++;
	
	char data= 'A';
	for (int i=0; i<arr.length; i++) { arr[i] = data++; }
	
	
	// 출력 for + length 
	for (int i=0; i<arr.length; i++)  { System.out.print(arr[i]+"\t"); }
 	
		
	} // end main
}     // end class
/*
 연습문제7)  array
패키지명 : com.company.java007_ex
클래스명 :  ArrayEx007
    new 연산자 이용해서 배열만들기
    1. 배열명 : arr     
    2. 값 넣기 : A   B   C   D   E    for+length 이용해보기
    3. for + length 로 출력
 */
 