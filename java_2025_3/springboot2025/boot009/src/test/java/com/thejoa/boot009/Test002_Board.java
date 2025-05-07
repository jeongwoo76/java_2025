package com.thejoa.boot009;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot009.board.Board;
import com.thejoa.boot009.board.BoardRepository;

@SpringBootTest
public class Test002_Board {
	@Autowired BoardRepository boardRepository;
	
	@Disabled @Test
	public void insertBoard() {
		Board board = new Board();
		board.setBtitle("title");
		board.setBcontent("content");
		board.setBpass("11");
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		}catch(UnknownHostException e){e.printStackTrace();}
		boardRepository.save(board);
	}
	
	@Test
	public void delete() {
		Optional<Board> findBoard = boardRepository.findById(5L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}

	@Disabled @Test
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(3L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("new");
			board.setBcontent("new");
			boardRepository.save(board);
		}
	}
}
