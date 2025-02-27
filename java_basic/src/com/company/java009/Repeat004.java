package com.company.java009;

public class Repeat004 {
	public static void main(String[] args) {
		
	char [] arr = new char[3];    // char 저장시 숫자로 출력시 문자로
	//arr[0]=data++; arr[1]=data++; arr[2]=data++;
	
	char data='a';

	for (int i=0; i<arr.length; i++) { arr[i] = data++; }
	for (int i=0; i<arr.length; i++) System.out.print( arr[i]+"\t");
	
	} // end main
}     // end class
/*4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : a  b   c
3. for + length 를 이용하여  배열안의 a,b,c을 출력하시오.
*/
