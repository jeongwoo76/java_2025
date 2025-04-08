package com.thejoa.boot003.board;

import java.util.List;

public interface BoardService {
	public List<Board>     findAll(); //##전체리스트뽑고
	public Board       find(Long id); //##조회수올리고 / 상세보기기능
	
	public void    insert(Board board); //## 글쓰기기능
	
	public Board  update_view(Long id); //## 수정하기 폼
	public void    update(Board board); //## 글수정기능
	
	public void    delete(Board board); //## 글삭제기능
	
	
	
}
