package com.company.java014_ex;

/*
 * 1. interface 설계   2. 상수 + abstract method 3. can do this - 서비스는 구현객체(자손) 약속
       Board  public void exec()
    ↑               ↑              ↑            ↑
BoardInsert   BoardDelete    BoardSelect     BoardUpdate           

*/


interface Board { public void exec(); } // pulic abstract

class BoardInsert implements Board{ @Override public void exec()  { System.out.println("게시판 삽입기능입니다."); }}
class BoardDelete implements Board{ @Override public void exec()  { System.out.println("게시판 삭제기능입니다."); }}
class BoardSelect implements Board{ @Override public void exec()  { System.out.println("게시판 선택기능입니다."); }}
class BoardUpdate implements Board{ @Override public void exec()  { System.out.println("게시판 수정기능입니다."); }}

public class InterfaceEx002 {
	public static void main(String[] args) {
		Board board = null;
		board = new BoardInsert();board.exec();
		board = new BoardDelete();board.exec();
		board = new BoardSelect();board.exec();
		board = new BoardUpdate();board.exec();
		// 인터페이스? 개발코드 변경없이 객체를 바꿔낄수 있도록 하는 역할
	}
}
