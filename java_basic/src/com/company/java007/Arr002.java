package com.company.java007;

import java.util.Arrays;

public class Arr002 {
	public static void main(String[] args) {
		// 1. new 연산자 이용해서 처리
		int[] arr = {1,2,3};    // 배열 생성 및 초기화
		// 1번지 {1,2,3} ← arr : 1번지   갯수 3  /  index 0~2  
		
		int[] arr2 = new int[3];   // 배열 생성  new(공간빌리기)   int[3]  연달아서 3개
		// 2번지 { , , } ← arr2 : 2번지
		
		System.out.println(arr2);  //  [I@372f7a8d
		System.out.println(Arrays.toString(arr2)  );  // [0, 0, 0]
		
		// arr2[0] = 10;
		// arr2[1] = 20;
		// arr2[2] = 30;   //  for 줄이기도전!
		
		//	int data =10;
		//	arr2[0] = data;  data+=10;
		//	arr2[1] = data;  data+=10;
		//	arr2[2] = data;  data+=10;
		
		int data =10;
		for (int i=0; i<arr2.length; i++) { arr2[i] = data;  data+=10; }
		
		System.out.println(Arrays.toString(arr2)  );
		
	}  // end main
}     //  end class
