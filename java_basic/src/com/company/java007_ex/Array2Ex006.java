package com.company.java007_ex;

public class Array2Ex006 {
	public static void main(String[] args) {
		int[][] datas = {  {  10, 10, 10 ,10},  //  00 01 02 03
                           {  20, 20, 20 ,20},  //  10 11 12 13
                           {  30, 30, 30 ,30},  //  20 21 22 23
              };                                // 3층 4칸 
				int[][] result = new int[datas.length + 1][datas[0].length + 1];   //4층 5칸
				
				//				// #1. result에 datas 데이터 복사하기  result[0][0] = datas[0][0];
				//				for(int ch=0; ch<datas.length; ch++) {  // 1 층의 정보
				//					for(int kan=0; kan<datas[ch].length; kan++) { // 2 칸의정보
				//						result[ch][kan] =datas[ch][kan];
				//					} 
				//				} 
		
				
				// #2. 가로방향데이터누적
				//	result[0][4] +=result[0][0];
				//	result[0][4] +=result[0][1];
				//	result[0][4] +=result[0][2];
				//	result[0][4] +=result[0][3];   for (int kan=0; kan<4; kan++) {result[0][4] +=result[0][kan]; }
				
				//	result[1][4] +=result[1][0];
				//	result[1][4] +=result[1][1];
				//	result[1][4] +=result[1][2];
				//	result[1][4] +=result[1][3];  for (int kan=0; kan<4; kan++) {result[1][4] +=result[1][kan]; }

				//	for (int kan=0; kan<4; kan++) {result[0][4] +=result[0][kan]; }
				//	for (int kan=0; kan<4; kan++) {result[1][4] +=result[1][kan]; }
				//	for (int kan=0; kan<4; kan++) {result[2][4] +=result[2][kan]; }
				
				//				for(int ch=0; ch<datas.length; ch++) {
				//				for (int kan=0; kan<datas[ch].length; kan++) {
				//					result[ch][datas[ch].length] +=result[ch][kan]; 
				//					}
				//				}
				
				
				// #3. 세로방향데이터누적
				//   result[3][0] +=result[0][0]; 
				//   result[3][0] +=result[1][0]; 
			    //   result[3][0] +=result[2][0]; // #for1 ctrl +shift +f 
				// result[3][1] +=result[0][1] result[3][1] +=result[1][1] result[3][1] +=result[2][1] #for2
				// result[3][2] +=result[0][2] result[3][2] +=result[1][2] result[3][2] +=result[2][2] #for3
				// result[3][3] +=result[0][3] result[3][3] +=result[1][3] result[3][3] +=result[2][3] #for4
				
				// #4. 전체데이터누적
				
				
				for(int ch=0; ch<datas.length; ch++) {
					for (int kan=0; kan<datas[ch].length; kan++) {
						result[ch][kan] =datas[ch][kan];  // 데이터 복사해서 넣기
						result[ch][datas[ch].length] +=result[ch][kan];   // 가로방향데이터누적
						result[datas.length][kan] +=result[ch][kan];   // 세로방향데이터누적
						result[datas.length][datas[ch].length] +=result[ch][kan]; // 전체데이터누적
						}
					}
				
				for(int ch=0; ch<result.length; ch++) {  // 1 층의 정보
					for(int kan=0; kan<result[ch].length; kan++) { // 2 칸의정보
						System.out.print(result[ch][kan] + "\t");
					} // end kan
					// 3 한층이 끝나고 나면 해야할일
					System.out.println();
				} // end ch
		
		
		
	} // end main
}     // end class
/*
연습문제14)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex006
배열을 이용하여 다음의 프로그램을 작성하시오.   

int[][] datas = {     {  10, 10, 10 ,10}, 
                      {  20, 20, 20 ,20}, 
                      {  30, 30, 30 ,30},  
};  // 3층 4칸 
int[][] result = new int[datas.length+1][datas[0].length+1];


출력내용:
10   10   10   10   40   
20   20   20   20   80   
30   30   30   30   120   
60   60   60   60   240   
*/