package com.company.java008;

public class Repeat003 {
	public static void main(String[] args) {
		
	int[] arr =new int[3];
	//	arr[0]=10; arr[1]=20; arr[2]=30; 
	//	int data=10;
	//	arr[0]=data; data+=10; arr[1]=data; data+=10; arr[2]=data; data+=10;  
	    
	
	int data=10;
	for (int i=0; i<arr.length; i++) { arr[i]=data; data+=10;           }	
	for (int i=0; i<arr.length; i++) { System.out.print(arr[i]+"\t" );  }	
	
	
	}  // end main
}      // end class
/*3) 클래스명 : Repeat003
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : 10,20,30
3. for + length 를 이용하여  배열안의 10,20,30을 출력하시오.
*/