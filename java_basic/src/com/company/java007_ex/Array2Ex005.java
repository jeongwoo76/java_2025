package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex005 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, }, // 00 01 02
				        { 2, 2, 2, }, // 10 11 12
				        { 3, 3, 3, }, // 20 21 22
				        { 4, 4, 4, }, // 30 31 32
				        };
		int total = 0;  double avg = 0.0;
		// ver-1                   ver-2                   ver-3 0층만계산
		// 총점에 00의 데이터 누적    total+=arr[0][0]; 
		// 총점에 01의 데이터 누적    total+=arr[0][1];
		// 총점에 02의 데이터 누적    total+=arr[0][2];  for (int kan=0; kan<arr[0].length; kan++) { total+=arr[0][kan];}   // 3
		
		// ver-4 각층계산
//		for (int kan=0; kan<arr[0].length; kan++) { total+=arr[0][kan];} // 0층
//		for (int kan=0; kan<arr[1].length; kan++) { total+=arr[1][kan];} // 1층
//		for (int kan=0; kan<arr[2].length; kan++) { total+=arr[2][kan];} // 2층
//		for (int kan=0; kan<arr[3].length; kan++) { total+=arr[3][kan];} // 3층
		
		for (int ch=0; ch<arr.length; ch++) { // #1 층의정보
		for (int kan=0; kan<arr[ch].length; kan++) { // #2 칸의정보
			total+=arr[ch][kan];
			}
		    // #3. 한층이 끝날때 처리해야할일
		}                       //  층 * 칸
		avg= (double)total/(arr.length*arr[0].length);  // 평균 = total /갯수(층갯수*칸갯수)   
		//   정수/정수 =정수이므로 답이 2.0나오고 → double로 형변환 해야 정확한 답2.5 나옴
		
		// 총점 : 30
		// 평균 : 2.5
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		
		
	}  // end main
}      // end class
/*
연습문제13)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex005
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.

 int[][] arr = {
   { 1, 1, 1,},
   { 2, 2, 2,},
   { 3, 3, 3,},
   { 4, 4, 4,},
 };
 int total=0;  double avg=0.0;

출력내용:
총점 : 30
평균 : 2.5
*/