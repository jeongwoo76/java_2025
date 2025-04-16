package com.thejoa.boot003;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot003.board.Board;
import com.thejoa.boot003.board.BoardRepository;
import com.thejoa.boot003.board.BoardService;
import com.thejoa.boot003.member.Member;
import com.thejoa.boot003.member.MemberRepository;


@SpringBootTest
class Test002_Board {
	@Autowired BoardRepository boardRepository;
	@Autowired MemberRepository memberRepository;
	@Autowired BoardService boardService;
	
	// 유저(OneToMany :mappedby="member")는 많은 글(ManyToOne)을 쓸수있다.
	//@Disabled 
	/*@Test
	public void insertBoard() {
	  for(int i=0; i<120; i++) {
		Member member = new Member(); 
		member.setUsername("first"); //있는 username
		Board board = new Board();
		board.setBtitle("title-paging");
		board.setBcontent("content-paging");
		board.setBpass("1111");
		board.setBfile("2.jpg");
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch(UnknownHostException e) {e.printStackTrace(); }
		board.setMember(member);
		boardService.insert(board);
	  }
	} */
	
	// select * from board
	@Disabled @Test
	public void findAllBoard() {
			List<Board> list = boardRepository.findAll();
			System.out.println(list.get(0).getBtitle());
		}
	
	// editView / detail
	// select * from board where id=?
	@Disabled @Test
	public void findByIdBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board.getBtitle());
		}
	} // find -select / save-insert, update / delete -delete
	
	// update board set btitle=?, bcontent=?, bfile=? where id=?
	@Disabled @Test
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	
	// delete from board where id=?
	@Disabled @Test
	public void delete() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}
	

}
