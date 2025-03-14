package com.company.java019;

//1. 프로세스 - 실핼 중 프로그램
//2. 자원 + Thread( 작업수행 )
// 작업수행클래스 1) Thread 상속, Runnable # 2) run 해야할일 3) start 실행
class Animal{}
//class DogSound extends Animal , Thread {}  (X)

class DogSound extends Animal implements Runnable { //#1) Thread 상속, Runnable #
	@Override public void run() {// #2) run 해야할일
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		
		for(int i=0; i<5; i++) {
			System.out.println("멍!");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		} // 1000이 1초
	}
}  

public class Thread003_Runnable {
	public static void main(String[] args) {
		Thread sound = new Thread( new DogSound() ); sound.start();
		
		Thread count = new Thread( new Runnable() { //#1 runnable
			@Override public void run() {  //#2. run todo
				for(int i=0; i<5; i++) {
					System.out.print( (i+1)  +"마리  ");
					try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
			}); count.start();  //#3. start
		
		for(int i=0; i<5; i++) {
			System.out.print("  ◖⚆ᴥ⚆◗  ");
			try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
}
/*
 （ΦωΦ）
 ʕTᴥTʔ
 ◖⚆ᴥ⚆◗
*/