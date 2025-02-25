package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex004 {
	public static void main(String[] args) {
		
	char[][] arr = new char[2][3];	  // 00 01 02
									  // 10 11 12
	
	// ver-1
//	arr[0][0]='A'; arr[0][1]='B'; arr[0][2]='C';    
//	arr[1][0]='B'; arr[1][1]='C'; arr[1][2]='D';    
	
	// ver-2
//	char data1='A';
//	arr[0][0]=data++;	arr[0][1]=data++;	arr[0][2]=data++;
//  char data2='B';	
//	arr[1][0]=data++;	arr[1][1]=data++;	arr[1][2]=data++;		
	
	// ver-3 
//	char data1 ='A';
//	for (int kan=0; kan<arr[0].length; kan++)  { arr[0][kan]=data1++;	 }
//	char data2 ='B';
//	for (int kan=0; kan<arr[0].length; kan++)  { arr[1][kan]=data2++;	 }
	
//	char data1 ='A';
//	for (int kan=0; kan<arr[0].length; kan++)  { arr[0][kan]=data1++;	 }
//	 data1 ='B';
//	
//	for (int kan=0; kan<arr[1].length; kan++)  { arr[1][kan]=data1++;	 }
//	 data1 ='B';
	
	char data1 ='A';
	
	for (int ch = 0; ch < arr.length; ch++) { // #1. 층
		for (int kan = 0; kan < arr[ch].length; kan++) { //#2, 칸
			arr[ch][kan] = data1++;
		} // #3. 한층이 끝나고 나면 해야할일
		data1 = 'B';
	}
	/*   이렇게 하면 안돼!!!!!
	char data1='A'; 
	for (int ch=0; ch<arr.length; ch++){
	for (int kan=0; kan<arr[ch].length; kan++)  { arr[ch][kan]=data1++;	 } 
	}
	char data2='B'; 
	for (int ch=0; ch<arr.length; ch++){
	for (int kan=0; kan<arr[ch].length; kan++)  { arr[ch][kan]=data2++;	 } 
	}		
	*/
		
	for (int ch = 0; ch < arr.length; ch++) { // #1. 층
		for (int kan = 0; kan < arr[ch].length; kan++) { //#2, 칸
			System.out.print(arr[ch][kan]+"\t");
		} // #3. 한층이 끝나고 나면 해야할일
		System.out.println();
	}
		
	}  // end main
}     // end class
/*
연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D
*/