package com.company.java018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


class Std {
	private int no; private String name; private int age;

	public Std() { super(); }
	public Std(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "Std [no=" + no + ", name=" + name + ", age=" + age + "]"; }


	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; } 
	
	
}

public class Repeat002 {
	public static void main(String[] args) {
		
//		Q7.  ArrayList
//		 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기  
		List<Std> list = new ArrayList<>();
		list.add(new Std(1, "iron", 45));
		list.add(new Std(2, "hulk", 38));
		list.add(new Std(3, "captain", 120));

		System.out.println("=====================" +"\r\n"
				+ "NO"+"\t"+"NAME"+"\t"+"AGE"+"\r\n"
				+"=====================");
		
		Iterator <Std> iter1 = list.iterator(); //1. 모으기
		int total =0;
		while(iter1.hasNext()) { //2. 처리대상확인
			Std temp =	iter1.next(); //3. 꺼내오기 
			total += temp.getAge(); //총나이 누적
			System.out.println(temp.getNo()+ "\t"+ temp.getName()+"\t"+ temp.getAge());
		}
		System.out.println("총나이 : " +total);
		System.out.println("평균나이 : "+ total/list.size());
		System.out.println();
		
//		Q8.   HashSet
//		 *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기  
		Set<Std> set = new HashSet<>();
		set.add(new Std(1, "iron", 45));
		set.add(new Std(2, "hulk", 38));
		set.add(new Std(3, "captain", 120));
		
		System.out.println("=====================" +"\r\n"
				+ "NO"+"\t"+"NAME"+"\t"+"AGE"+"\r\n"
				+"=====================");
		
		Iterator <Std> iter2 = set.iterator(); //1. 모으기
		total =0;
		while(iter2.hasNext()) { //2. 처리대상확인
			Std temp =	iter2.next(); //3. 꺼내오기 
			total += temp.getAge(); //총나이 누적
			System.out.println(temp.getNo()+ "\t"+ temp.getName()+"\t"+ temp.getAge());
		}
		System.out.println("총나이 : " +total);
		System.out.println("평균나이 : "+ total/set.size());
		System.out.println();
		
//		Q9.   HashMap
//		 *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기  
		HashMap<Integer, Std> map = new HashMap<>();
		map.put(1, new Std(1, "iron", 45));  
		map.put(2, new Std(2, "hulk", 38));  
		map.put(3, new Std(3, "captain", 120));  
		
		System.out.println("=====================" +"\r\n"
				+ "NO"+"\t"+"NAME"+"\t"+"AGE"+"\r\n"
				+"=====================");
		
		Iterator <Entry <Integer, Std>> iter3 =map.entrySet().iterator(); //1. 모으기
		total =0;
		 while(iter3.hasNext()) { //2. 처리대상확인
		    	Entry <Integer, Std> key_value = iter3.next(); //3. 꺼내오기 
		    	Std temp =key_value.getValue();
		    	total += temp.getAge(); //총나이 누적
		    	System.out.println(temp.getNo()+ "\t"+ temp.getName()+"\t"+ temp.getAge());
		 }
			System.out.println("총나이 : " +total);
			System.out.println("평균나이 : "+ total/map.size());

		
	}  // end main
}      // end class


/*
 		출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain	120
		 
		 나이총합 : 203
		 나이평균 : 67.67
*/
