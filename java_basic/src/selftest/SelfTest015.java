package selftest;

import java.util.Arrays;

public class SelfTest015 {
	public static void main(String[] args) {
		int[] arr =new int [5];
		
		int data=1;
		for(int i=0; i<arr.length; i++ ) { arr[i]=data; data++;}
		
		for(int i=0; i<arr.length; i++ ) { System.out.print(   String.format("%d", arr[i])+"\t"); }
		
	}
}
/*
[SelfTest015] 배열(1)
1. 숫자형공간이 5개인  배열 arr 만들기
2. for구문을 이용하여  1~5까지 입력
3. for구문을 이용하여  1~5까지 출력
*/