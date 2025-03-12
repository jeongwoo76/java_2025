package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {
	public static void main(String[] args) {
		// 데이터종류 상관없이 같은방식으로 처리
		Integer[] arr = {1,2,5,4,3,1,2,1,2};
		List<Integer> list = Arrays.asList(arr);
		
		//#1. stream
		Stream <Integer> stream_arr = Arrays.stream(arr);
		Stream <Integer> stream_list = list.stream();
		
		//#2. 중간연산 
		// Predicate  : boolean java.util.function.Predicate.test (	T t )
		// Consumer   :	  void java.util.function.Consumer.accept ( T t )
		stream_arr.filter(t-> t%2!=0 ) // 홀수 : 필터링     15311
				  .distinct()		   // 중복제거 		  153
				  .sorted()			   // 정렬 			  135
				  .skip(1)             // skip            35
				  .forEach( t-> {System.out.print(t);  });  //#3. 최종연산
		
		System.out.println();
		System.out.println();
		
		stream_list.filter(t-> t%2!=0 ) // 홀수 : 필터링     15311
		  .distinct()		   // 중복제거 		  153
		  .sorted()			   // 정렬 			  135
		  .skip(1)             // skip            35
		  .forEach( System.out::print  );  //#3. 최종연산
		
		System.out.println();
		System.out.println();
		
		//#3. collect
		//System.out.println( stream_arr.collect(Collectors.toList()));    일회성
		System.out.println( Arrays.stream(arr).collect(Collectors.toList()));
		System.out.println( list.stream().collect(Collectors.toList()));
		
	}
}
