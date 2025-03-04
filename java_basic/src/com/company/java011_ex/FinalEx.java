package com.company.java011_ex;

// 1. 클래스부품객체 -상태와 행위
// 2. final -수정하지마

/* 초기화 순서 :  기본값 → 명시적초기화   → 초기화블록  →  생성자
final  nation   null     korea        korea (X)   korea     (X)
final  jumin    null     null (X)     null  (X)   "00000"   (O)
  name   	    null     null (X)     null  (X)   .연산자이용, (O) 수정가능
 */

class User002 {
	   final String nation = "Korea";   // 수정하지마
	   final String jumin;              // 수정하지마
	   String name;

	   public User002() { this.jumin = "00000";  }   
	   // The blank final field jumin may not have been initialized
	   public User002(String jumin, String name) {
	      this.jumin = jumin;
	      this.name = name;
	   }
	@Override public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	   
}
	 public class FinalEx {
	   public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
      //user1.nation = "USA";               // cannot be assigned 수정하지마
      //user1.jumin  = "123123-1234321";    // cannot be assigned 수정하지마
	      user1.name = "IU"; 
	      System.out.println(user1);   
	 }
}
/*
----------------------------------
[method]   User002.class , FinalEx.class , final{nation, jumin}  // ##1
----------------------------------
[heap]         													| [stack]
1번지 : {nation=Korea, jumin="123456-1234567", name="IU" }   ←  user1 (1번지)
               													|  main     // ##2
---------------------------------- 
*/	 
	 
	 
	 
	 
	 
/*연습문제1)  final
패키지명 : com.company.java011_ex
클래스명 : FinalEx
다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
class User002 {
   final String nation = "Korea";   
   final String jumin;   
   String name;

   public User002() { jumin="00000"; }
   public User002(String jumin, String name) {
      this.jumin = jumin;
      this.name = name;
   }
}
 public class FinalEx {
   public static void main(String[] args) {
      User002 user1 = new User002("123456-1234567", "아이유");
      System.out.println(user1);   
      
      user1.nation = "USA";      
      user1.jumin  = "123123-1234321"; 
      user1.name = "IU"; 
      System.out.println(user1);   
   }
}
*/
