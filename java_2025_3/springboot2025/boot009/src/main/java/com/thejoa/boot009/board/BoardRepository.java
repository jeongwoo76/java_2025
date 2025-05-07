package com.thejoa.boot009.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long>{

	@Query("select b from Board b order by id desc")
	List<Board> findAllByOrderByDesc();
	
	@Modifying
	@Transactional
	@Query("delete from Board b where b.id=:id and b.bpass=:bpass")
	int deleteByIdAndBpass (@Param("id") Long id, @Param("bpass") String bpass);
	
	@Modifying
	@Transactional
	@Query("update Board b set b.btitle=:btilte, b.bcontent=:bcontent where b.id=:id and b.bpass=:bpass")
	int updateByIdAndBpass(Long id, String bpass, String btilte, String bcontent);
	
	
}
