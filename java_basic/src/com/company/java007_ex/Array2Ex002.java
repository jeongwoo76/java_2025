package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		
		int[][] arr2={ {101,102,103} ,   // 00 01 02
				       {201,202,203}     // 10 11 12
		};
		
		for  (int ch=0; ch<arr2.length; ch++)   { // 1. 층
			for (int kan=0; kan<arr2[ch].length; kan++) { System.out.print(arr2[ch][kan]+"\t"); } // 2. 칸
			System.out.println();  // 한층이 끝나고 해야할일
		}  // end ch
		
	}  // end main
}     // end class
