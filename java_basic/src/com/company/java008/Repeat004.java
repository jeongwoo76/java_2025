package com.company.java008;

public class Repeat004 {
	public static void main(String[] args) {
		
	int [][] arr2 = new int[2][3];
	//	arr2[0][0]=10; arr2[0][1]=20; arr2[0][2]=30;
	//	arr2[1][0]=50; arr2[1][1]=60; arr2[1][2]=70;
	
	//	int data=10;
	//	arr2[0][0]=data; data+=10; arr2[0][1]=data; data+=10; arr2[0][2]=data; data+=10;
	//	data=50;
	//	arr2[1][0]=data; data+=10; arr2[1][1]=data; data+=10; arr2[1][2]=data; data+=10;
	
	int data=10;
	for (int ch=0; ch<arr2.length; ch++) {
		for (int kan=0; kan<arr2[ch].length; kan++){ 
			arr2[ch][kan]=data; data+=10; 
		}
	    data=50;
	}
	    
    for (int ch=0; ch<arr2.length; ch++) {
	    for (int kan=0; kan<arr2[ch].length; kan++) {
	    	System.out.print(arr2[ch][kan]+"\t"); 
	    }
      System.out.println();
    }
    
	   
		
	}  // end main
}     // end class
/*4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {10,20,30}, {50,60,70}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.
*/