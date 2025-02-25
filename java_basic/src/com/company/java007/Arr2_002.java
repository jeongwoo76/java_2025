package com.company.java007;

import java.util.Arrays;

public class Arr2_002 {
	public static void main(String[] args) {
		int [][] arr = new int[2][3];  // 2층 3칸 공간만 빌리기
									   // 00 01 02	
									   // 10 11 12
// ver-1 arr[0][0]=1; 	    arr[0][1]=2; 	    arr[0][2]=3;
//		 arr[1][0]=4; 		arr[1][1]=5; 		arr[1][2]=6;
		
		
		
//ver-2	 int data=1;
//		 arr[0][0] = data++; arr[0][1] = data++;  arr[0][2] = data++;  
//		 arr[1][0] = data++; arr[1][1] = data++;  arr[1][2] = data++;  
		
// ver-3 int data=1;
//		 for (int kan=0; kan<arr[0].length; kan++){  arr[0][kan] = data++;  }
//		 for (int kan=0; kan<arr[0].length; kan++){  arr[1][kan] = data++;  }
		
		int data=1;
		for (int ch=0; ch<arr.length; ch++) {  // 층
			for (int kan=0; kan<arr[ch].length; kan++){ // 칸
				arr[ch][kan] = data++;  
				}
			// 한층이 끝나면 해야할일
			}
		
		System.out.println(Arrays.deepToString(arr)); // [[0, 0, 0], [0, 0, 0]]
		
		
		
		
	}  // end main
}     // end class
