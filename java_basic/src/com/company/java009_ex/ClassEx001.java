package com.company.java009_ex;

// 1. 클래스는 부품객체
// 2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class Student001{
	// 멤버변수 : 
	String name;  int no, kor, eng, math;
    //  멤버함수 :
	void info() {
		System.out.println("이름 : "+ this.name);
		System.out.println("총점 : "+ (this.kor+this.eng+this.math));
		System.out.printf("평균 : %.2f ", (this.kor+this.eng+this.math)/3f);
    }
}

public class ClassEx001 {
	public static void main(String[] args) {
		 Student001   s1 = new Student001();           //  1. new (공간, 객체생성) 2. Student001() 초기화 3. s1 지번
		 s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99; 
	     s1.info();	
	     Student001   s2 = new Student001(); s2.name="second";
	     Student001   s3 = new Student001(); 
		
	}  // end main
}      // end class
/*       클래스는 설계도 - 인스턴스화 (heap - new - 객체생성 )를 통해 - 객체(객체들 s1,s2,s3 뭉쳐서 표현)  /  인스턴스(각각의 s1, name, s2,name)
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  Student001.class    /   ClassEx001.class    
--------------------------------------------------------------------------------
[heap:동적]                                                   |[stack:잠깐빌리기]
19번째줄 :1번지 {name =first, no=11, kor=100, eng=100, math=99}   ← s1 : 1번지
18번째줄 :1번지 {name =null, no=0, kor=0, eng=0, math=0}          ← s1 : 1번지
                                                             | main
--------------------------------------------------------------------------------
*/

/*
연습문제1)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx001
class Student001{
  멤버변수 : String name;  int no, kor, eng, math;
  멤버함수 : void info()
}

public class ClassEx001{
   public static void main(String[] args) {
      Student001   s1 = new Student003();
     s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
     s1.info();
   }
}
출력내용 : 
  이름: first
  총점 : 299
  평균 : 99.67
*/