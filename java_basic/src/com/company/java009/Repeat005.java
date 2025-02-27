package com.company.java009;

public class Repeat005 {
	public static void main(String[] args) {
		
	char[][] arr2 = new char[2][3];
	//arr2[0][0]='a'; arr2[0][1]='b'; arr2[0][2]='c';
	//arr2[1][0]='d'; arr2[1][1]='e'; arr2[1][2]='f';
	
	char data='a';
	for (int ch=0; ch<arr2.length; ch++){
	for (int kan=0; kan<arr2[ch].length; kan++){
		arr2[ch][kan]=data++;
		System.out.print(arr2[ch][kan]+"\t");
		}
	System.out.println();
	}	
	
	
	}  // end main
}     //  end class
/*5) 클래스명 : Repeat005
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {a,b,c}, {d,e,f}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.
*/


/*6) 다음에 알맞은 코드를 작성하시오. 
-1) ONE   버튼을 클릭하면 본인이름 알림창 띄우기   (onclick 이용!)
 <button  class="btn btn-warning my-3" onclick="alert('홍길동')"  > ONE </button>
 
-2) TWO   버튼을 클릭하면 본인이름 알림창 띄우기   (document.getElementById 이용!)
 <button  class="btn btn-warning my-3" id="two" > TWO </button>
 <script>
document.getElementById("two").onclick = function(){ alert('홍길동');  };
</script>

 7) 다음의 메서드를 정의 하시오.
 
public static void main(String[] args){
	// public static 리턴값 메서드명 (재료) { 해야할일 }
	// public static void       hi() { System.out.println("hi");   }   // 1단계 ) 구조
    hi();   // hi 출력
    
    // public static 리턴값 메서드명 (재료) { 해야할일 }
    // public static void       hi (1) { hi 1 님! 출력; }  
    // public static void       hi (int a) { System.out.println("hi"+a+"님!"); }  // 2단계) 파라미터-재료
    hi(1);   // hi 1 님! 출력
    
    // public static 리턴값 메서드명 (재료) { 해야할일 }    
    // public static    " hi sally"  hi ("sally")   { return " hi sally"  }
    // public static String     hi (String str) {return "hi " + str; }         // 3단계 )return
 
    System.out.println( hi("sally") );   // hi sally 출력
    
}
public static 리턴값 메서드명 (재료) { 해야할일 }

public static void       hi() { System.out.println("hi");   }             
public static void       hi (int a) { System.out.println("hi"+a+"님!"); }  
public static String     hi (String str) {return "hi " + str; }           
*/