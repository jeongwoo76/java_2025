package com.company.java19_ex;

import javax.swing.JOptionPane;
//방법1) Thread 1) Thread 2) run 실행해야하는 내용 3) start 실행
class QuestionCount2 implements Runnable { //#1) Thread
	@Override public void run() { //#2) run
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) { break; }
		}
	} // end run
}     // end class 
public class ThreadEx001_2 {
	public static void main(String[] args) {
		Thread count = new Thread( new QuestionCount2() ); count.start(); //#3) start 실행
		String answer = JOptionPane.showInputDialog("사과알파벳을 입력하세요.");
		//System.out.println(answer);
		if(answer.equals("apple")) { System.out.println("정답입니다."); count.interrupt(); }// 정답이라면
		 else { System.out.println("정답이 아닙니다."); count.interrupt();}
		System.out.println("main-end");
		
		
	} // end main
}    // end class
// 문제점 : 1) 정답말했는데 count 계속실행  2) main이 끝났는데 다른 프로세스 실행중



/*

연습문제1)  Thread
패키지명 : com.company.java019_ex
클래스명 : ThreadEx001
1.  QuestionCount  - 10부터 1까지 
      카운트 1초에 10 ,
                2초에 9, 
                3초에  8.....

2. 사과알파벳을 입력하세요.
   사과를 입력을받으면 정답입니다 / 정답이 아닙니다.
*/