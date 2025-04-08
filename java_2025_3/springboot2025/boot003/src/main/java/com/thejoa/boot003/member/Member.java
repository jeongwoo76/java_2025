package com.thejoa.boot003.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.thejoa.boot003.board.Board;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	private int age;
	
	@Column(updatable = false)
	private LocalDateTime creaDateTime = LocalDateTime.now();
	
	//유저(Member:One)는 많은 글(Many:board)을 쓸수 있다.
	@OneToMany(mappedBy = "member")
	List<Board> board = new ArrayList<>();
	
}
/*
>>3-1 유저는 많은 글을 쓸수 있다.
>>3-2 member -|--------∈ board

mysql> desc member;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | bigint       | NO   | PRI | NULL    | auto_increment |
| age            | int          | NO   |     | NULL    |                |
| crea_date_time | datetime(6)  | YES  |     | NULL    |                |
| name           | varchar(255) | NO   |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

*/