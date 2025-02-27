package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	      
	      public static int process_total(int kor ,int eng,int math)      { return kor+eng+math; }
	      public static float process_avg(int total)      { return total/3f; }
	      public static String process_pass(float avg, int kor, int eng, int math)      { 
	      
	      return avg<60? "불합격" : kor<40 || eng<40 || math<40? "재시험" : "합격";
	      }
	      public static String process_scholar(float avg) {
	      return avg>=95? "장학생" :"";
	      }
	      public static String process_star(float avg) {
	    	  String result="";
	    	  //  70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	    	  for(int i=0; (int)i<avg/10; i++) { result+="*";}
	    	  return result;
	      }
	      
	      public static void process_show(String name,int  kor,int eng,int math,int total,float avg,String pass,String jang,String star)
	      {
	      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::+\r" 
          +"이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\r\n"
          +"--------------------------------------------------------------------------------------------");
	      System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t",name, kor, eng, math, total, avg, pass, jang, star);	  
	      }
	      
	      public static void main(String[] args)  {
	      /////////////////////(1)  변수
	      String name  = ""; 
	      int kor, eng, math, total ;
	      float avg = 0.0f; 
	      String pass = "";
	      String jang = "";
	      String star= ""; 
	      Scanner scanner = new Scanner(System.in);
	      
	      
	      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	      System.out.print("이름을 입력하세요>");      name =scanner.next();
	      System.out.print("국어점수를 입력하세요>");   kor  =scanner.nextInt();
	      System.out.print("영어점수를 입력하세요>");   eng  =scanner.nextInt();
	      System.out.print("수학점수를 입력하세요>");   math =scanner.nextInt();
	      
	      
	    
	   
	      /////////////////////(3) 처리 : 
	      total = process_total(kor , eng, math);    // 1. 총점처리
	      //total = kor+eng+math;
	      
	      avg = process_avg(total);    //2.  평균처리
	      // avg =  total/(float)3;
	      
	      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	      pass = process_pass(avg , kor, eng, math);  
	      // if(avg >=60 && kor>=40 && eng>=40 && math >=40) {pass="합격";} else  {pass="불합격";}
	      
	      //////// 4. 평균이 95점이상이면 장학생
	      jang = process_scholar(  avg  ); 
	      // if (avg>=95) {jang ="장학생";} 
	      
	      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	      star = process_star(avg);  
	      
	      
	      /////////////////////(4) 출력
	      process_show(name, kor, eng, math, total, avg, pass, jang, star);
	    
	   }// end main
	 
	   
	}// end class
	
	
	
/*연습문제4)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx004

public class MethodEx004{ 
   public static void main(String[] args) {
      /////////////////////(1)  변수
      String name  = ""; 
      int kor, eng, math, total ;
      float avg = 0.0f; 
      String pass = "";
      String jang = "";
      String star= ""; 
      String level_kor="" , level_eng="" , level_math="";
      String re = "";
      Scanner scanner = new Scanner(System.in);
      
      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
   
      /////////////////////(3) 처리 : 
      total = process_total(kor , eng, math);    // 1. 총점처리
      
      avg = process_avg(total);    //2.  평균처리
      
      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
      pass = process_pass(avg , kor, eng, math);  
      
      //////// 4. 평균이 95점이상이면 장학생
      jang = process_scholar(  avg  ); 
      
      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
      star = process_star(avg);  
      
      
      /////////////////////(4) 출력
      process_show(name, kor, eng, math, total, avg, pass, jang, star);
    
      
   }// end main
 
   
}// end class

 
      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
      이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
      --------------------------------------------------------------------------------------------
      아이언맨   100   100   100   300    100.0    합격      장학생   **********
      --------------------------------------------------------------------------------------------
*/