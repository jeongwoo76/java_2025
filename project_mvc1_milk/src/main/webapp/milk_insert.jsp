<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<% 
	//1. utf-8 설정
	request.setCharacterEncoding("UTF-8");
	
	//2. request.getParameter() 이용해서 데이터받기 #
	String oname = request.getParameter("oname");
	int    onum  = Integer.parseInt(request.getParameter("onum") );
	
	//out.println(oname +"/" + onum);
	
	
	Connection conn = null; PreparedStatement pstmt =null;  ResultSet rset =null;
	String sql = "insert into milk_order (oname, onum, oip) values (?, ?, ?);"; //##1
	try{
	//3. Driver 연동
	Class.forName("com.mysql.cj.jdbc.Driver");
	//4. DB 연동
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
	//out.println( "db연동성공" + conn );
	//5. PreparedStatement 이용해서 sql처리
	pstmt = conn.prepareStatement(sql); //##2
	pstmt.setString(1, oname); // 1, oname -> 첫번째 물음표, 값
	pstmt.setInt(2, onum);     //          -> 두번째 물음표, 값
	pstmt.setString(3, InetAddress.getLocalHost().getHostAddress());  // ip
	//6. 결과값 받아서 처리
	//	pstmt.executeQuery();  sql -select 구문에서 사용
	int result = pstmt.executeUpdate();  //  sql - INSERT, UPDATE or DELETE;   실행줄수
	//													  location.href='' 주소표시창줄경로바꾸기
	if(result>0){  out.println("<script>alert('주문성공!'); location.href='milk.jsp'; </script>");   }
	else{  out.println("<script>alert('관리자에게문의바랍니다!'); location.href='milk.jsp'; </script>");   }

	}catch(Exception e){e.printStackTrace();
	}finally{
		if(rset  !=null){rset.close(); }
		if(pstmt !=null){pstmt.close(); }
		if(conn  !=null){conn.close(); }
	}
	
%>