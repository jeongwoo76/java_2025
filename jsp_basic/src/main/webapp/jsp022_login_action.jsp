<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");
	//1. 데이터값 넘겨받기
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	//out.println(name + "/" + pass);  test1
	
	Connection conn =null; PreparedStatement pstmt = null; ResultSet rset =null;
	String sql = "select count(*) 'cnt' from member  where name=?  and pass=? ";
	int result = -1;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");    //2. 드라이버연동 
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");    //3. db연동
		//if(conn!=null) out.println("db 성공!"); test2
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pass);
		rset = pstmt.executeQuery(); // 표
		if(rset.next() ){ result = rset.getInt(" cnt");  }  // 줄, 칸
		
		if(result == 1){ // 아이디와 비밀번호가 같은사람 1명
			request.getRequestDispatcher("jsp022_my.jsp").forward(request, response); 
			session.setAttribute("username", name);  //세션정보 유지하기 #
		}else{
			out.println("<script>alert('정보를 확인해주세요'); history.go(-1); </script>");
		}
	}catch(Exception e){e.printStackTrace();	   
	}finally{
		if(rset !=null){rset.close(); }
		if(pstmt !=null){pstmt.close(); }
		if(conn !=null){conn.close(); }
	}
%>
	
	
<!-- 	
  - 데이터값 넘겨받기
          - 드라이버연동 / db연동 / sql처리 / 결과값 확인
          - 아이디와 비밀번호가 같은지 member에서 검색
          - 찾았으면 [경로안바뀌게] , 보이는 화면은 jsp022_my.jsp 페이지로 넘어가기 / 
            못찾았으면 정보를 확인해주세요~ 알림창띄우고 로그인페이지로  jsp022_login.jsp 페이지로 -->
          
	

