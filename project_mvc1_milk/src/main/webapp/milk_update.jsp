<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//1. utf-8 설정
	request.setCharacterEncoding("UTF-8");
	
	//2. request.getParameter() 이용해서 데이터받기 (ono, oname, onum )
	int    ono  = Integer.parseInt(request.getParameter("ono") );
	String oname = request.getParameter("oname");
	int    onum  = Integer.parseInt(request.getParameter("onum") );
	//out.println(ono + "/" +oname + "/" +onum );
	
	Connection conn = null; PreparedStatement pstmt =null;  
	String sql = "update milk_order set oname= ?, onum= ? where ono= ?"; 
	try{
	//3. Driver 연동
	Class.forName("com.mysql.cj.jdbc.Driver");
	//4. DB 연동
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
	//5. PreparedStatement 이용해서 sql처리
	pstmt = conn.prepareStatement(sql); 
	pstmt.setString(1, oname); 
	pstmt.setInt(2, onum);     
	pstmt.setInt(3, ono);     
	//6. 결과값 받아서 처리
	if(pstmt.executeUpdate()>0){  out.println("<script>alert('수정성공!'); location.href='milk.jsp'; </script>");   }
	else{  out.println("<script>alert('수정실패!'); location.href='milk.jsp'; </script>");   }

	}catch(Exception e){e.printStackTrace();
	}finally{
		if(pstmt !=null){pstmt.close(); }
		if(conn  !=null){conn.close(); }
	}
	
%>