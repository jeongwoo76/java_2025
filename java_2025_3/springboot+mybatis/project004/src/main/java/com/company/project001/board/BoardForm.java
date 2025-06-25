package com.company.project001.board;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardForm {
	@NotEmpty(message="제목은 필수항목입니다.")
	@Size(max=100, message="제목은 100자 이내여야 합니다.")
	private String btitle;
	
	@NotEmpty(message="내용은 필수항목입니다.")
	private String bcontent;
	
	private String bfile;
	private String bip;
	
	@NotEmpty(message="비밀번호는 필수항목입니다.")
	@Size(min=3, max=20, message="비밀번호는 4자이상 20자이하여야 합니다.")
	private String bpass;
	private Long   bhit;
	
	@NotNull(message="작성자는 필수입니다.")
	private Long   memberId;




}

/*
mysql> desc board;
+-------------+--------------+------+-----+-------------------+-------------------+
| Field       | Type         | Null | Key | Default           | Extra             |
+-------------+--------------+------+-----+-------------------+-------------------+
| id          | bigint       | NO   | PRI | NULL              | auto_increment    |
| bcontent    | text         | YES  |     | NULL              |                   |
| bfile       | varchar(255) | YES  |     | NULL              |                   |
| bhit        | bigint       | YES  |     | NULL              |                   |
| bip         | varchar(255) | YES  |     | NULL              |                   |
| bpass       | varchar(255) | YES  |     | NULL              |                   |
| btitle      | varchar(200) | YES  |     | NULL              |                   |
| create_date | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| member_id   | bigint       | YES  | MUL | NULL              |                   |
+-------------+--------------+------+-----+-------------------+-------------------+
9 rows in set (0.00 sec)
*/