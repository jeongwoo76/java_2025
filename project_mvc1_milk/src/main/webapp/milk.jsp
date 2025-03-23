<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang ="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<!--  -->
<!--  -->
<div class="p-5 bg-dark text-white ">
  <h1>MILK ORDER Project</h1>
  <p>PreparedStatement Ex</p>
</div><!-- bg-primary(파랑) danger(빨강) warning(노랑) dark(블랙) info(하늘색) secondary(회색) -->

<!-- 메뉴판 -->
<!-- 메뉴판 -->
	<div class ="container card my-5">
	<h3 class ="card-header bg-info text-white my-3">MILK MENU</h3>


	 <table class="table table-bordered table-striped table-hover my-5">
	 <caption>우유</caption>
    <thead>
      <tr>
        <th scope="col">NO</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
      </tr>
    </thead>
    <tbody>
    
	<%@page import="java.sql.*"%>
	<%
	Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
		
		pstmt = conn.prepareStatement("select * from milk");
		
		rset = pstmt.executeQuery();
		while(rset.next()){
		//	out.println(rset.getInt("mno") + "/" + rset.getString("mname") + "/" + rset.getInt("mprice") +"<br/>");
		int mno = rset.getInt("mno");
		String mname =  rset.getString("mname");
		int mprice = rset.getInt("mprice");
	%>	
	  <tr>
        <td><%=mno%></td>
        <td><%=mname%></td>
        <td><%=mprice%></td>
      </tr>
	
	<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rset  !=null){ rset.close(); }
		if(pstmt !=null){ pstmt.close(); }
		if(conn  !=null){ conn.close(); }
	}
	%>
	
    </tbody>
  </table>
	</div>
	
	<!-- bg-primary(파랑) danger(빨강) warning(노랑) dark(블랙) info(하늘색) secondary(회색) -->
	
<!-- 주문현황 -표 -->
<!-- 주문현황 -표 -->
	<div class="container card my-5">
		<h3 class="card-header bg-warning text-white my-3">MILK ORDER</h3>
		<table class="table table-bordered table-striped table-hover">
		<caption>milk 주문현황</caption>
	    <thead>
	      <tr>
	        <th scope="col">NO</th>
	        <th scope="col">NAME</th>
	        <th scope="col">NUM</th>
	        <th scope="col">주문날짜</th>
	      </tr>
	    </thead>
	    <tbody>
	    <%
	   	// Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null; 앞에 선언있음
	    String sql ="select * from milk_order order by ono desc";
	    try{
		//1. Driver 연동
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. DB 연동
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
		//3. PreparedStatement 이용해서 sql처리 ## 최신주문이 맨위로 올라가게 [milk.jsp]
		pstmt = conn.prepareStatement(sql);
		//4. 결과값 받아서 처리  
		rset = pstmt.executeQuery(); // 표
		while(rset.next()){ // 줄
		out.println("<tr><td>"+rset.getInt("ono")+" </td><td>"+rset.getString("oname")+ "</td><td>" +rset.getInt("onum") +" </td><td> " + rset.getString("odate") +"</td></tr>");
		}
		
	    }catch(Exception e){e.printStackTrace();
	    }finally{
	    	if(rset  !=null){rset.close(); }
	    	if(pstmt !=null){pstmt.close(); }
	    	if(conn  !=null){conn.close(); }
	    }
	    %>
	    	    	  	    
	    </tbody>
	  </table>
	</div>	
	<div class="container card my-5">
	<h3 class="card-header bg-danger text-white my-3">MILK 주문하러가기</h3>
		<div id="accordion">
		<!-- 주문하기 -->
		<!-- 주문하기 -->		
	  <div class="card my-3">
	    <div class="card-header bg-warning text-white"> <!-- q1 배경 -->
	      <a class="btn text-white" data-bs-toggle="collapse" href="#collapseOne" style="font-weight:bold;"> <!-- q2 a text-white -->
	       주문하기
	      </a>
	    </div>
	    <div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
	      <div class="card-body">
	       <!--  -->
	       <!-- action ="처리" milk_insert.jsp 
	      		method ="방식" 데이터 노출안됨 (post)
	       		name          oname, onum                    text, number
	       -->	       
			<form action="milk_insert.jsp" method="post"  onsubmit="return form()">
			  <div class="mb-3 mt-3">
			    <label for="oname_insert" class="form-label">주문할 우유이름:</label>
			    <input type="text" class="form-control" id="oname_insert" placeholder="주문할 우유이름을 적어주세요!" name="oname">
			  </div>
			  <div class="mb-3">
			    <label for="onum_insert" class="form-label">주문할 우유갯수:</label>
			    <input type="number" class="form-control" id="onum_insert" placeholder="우유갯수를 적어주세요!" name="onum">
			  </div>		
			  <button type="submit"  class="btn btn-warning" >주문하기</button>
			</form>	   
			<script>
	    	function form() {
	    	let one = document.querySelector("#oname_insert");
	    	let two = document.querySelector("#onum_insert");
	    	
	    	if( oname_insert.value =="") { alert("빈칸입니다.");  oname_insert.focus();  return false; }
	    	if( onum_insert.value =="") { alert("빈칸입니다.");  onum_insert.focus();  return false; }
	    	}
    		</script>    	  
	       <!--  -->
	       <!--  -->
	      </div>
	    </div>
	  </div>
	  <!-- 주문수정 -->
	  <!-- 주문수정 -->	
	  <div class="card my-3">
	    <div class="card-header bg-primary">
	      <a class="collapsed btn text-white" data-bs-toggle="collapse" href="#collapseTwo" style="font-weight:bold;">
	        주문수정
	      </a>
	    </div>
	    <div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
	      <div class="card-body">
	       <!--  -->
	    <!-- action ="처리" milk_update.jsp 
	      		method ="방식" 데이터 노출안됨 (post)
	       		name          ono, oname, onum                 number,  text, number
	       -->	    	       
			<form action="milk_update.jsp" method ="post" onsubmit="return form()">
			  <div class="mb-3 mt-3">
			    <label for="ono_update" class="form-label">수정 주문번호</label>
			    <input type="number" class="form-control" id="ono_update" placeholder="수정할 주문번호를 입력해주세요" name="ono">
			  </div>
			  <div class="mb-3 mt-3">
			    <label for="oname_update" class="form-label">수정 우유이름</label>
			    <input type="text" class="form-control" id="oname_update" placeholder="수정할 우유이름을 적어주세요!" name="oname">
			  </div>		
			  <div class="mb-3 mt-3">
			    <label for="onum_update" class="form-label">수정 우유갯수</label>
			    <input type="number" class="form-control" id="onum_update" placeholder="우유갯수를 적어주세요!" name="onum">
			  </div>		
			  <button type="submit" class="btn btn-warning" >주문수정하기</button>
			</form>	       	 
			<script>
	    	function form() {
	    	let ono_update = document.querySelector("#ono_update");
	    	let oname_update = document.querySelector("#oname_update");
	    	let onum_update = document.querySelector("#onum_update");
	    	
	    	if( ono_update.value =="") { alert("빈칸입니다.");  ono_update.focus();  return false; }
	    	if( oname_update.value =="") { alert("빈칸입니다.");  oname_update.focus();  return false; }
	    	if( onum_update.value =="") { alert("빈칸입니다.");  onum_update.focus();  return false; }
	    	}
    		</script>    	   
	       <!--  -->
	       <!--  -->
	      </div>
	    </div>
	  </div>
		<!-- 주문삭제 -->
		<!-- 주문삭제 -->	
	  <div class="card my-3">
	    <div class="card-header bg-info text-white">
	      <a class="collapsed btn text-white" data-bs-toggle="collapse" href="#collapseThree" style="font-weight:bold;">
	        주문삭제
	      </a>
	    </div>
	    <div id="collapseThree" class="collapse" data-bs-parent="#accordion">
	      <div class="card-body">
	       <!--  -->
	           <!-- action ="처리" milk_delete.jsp 
	      		method ="방식" 데이터 노출됨 (get)
	       		name          ono              number   -->
			<form action="milk_delete.jsp" method ="get"  onsubmit="return form()" >
			  <div class="mb-3">
			    <label for="ono_delete" class="form-label">취소 주문번호</label>
			    <input type="number" class="form-control" id="ono_delete" placeholder="취소할 주문번호를 적어주세요!" name="ono">
			  </div>		
			  <button type="submit" class="btn btn-warning" >주문삭제하기</button>
			</form>	   
			<script>
	    	function form() {
	    	let ono_update = document.querySelector("#ono_delete");
	   
	    	if( ono_delete.value =="") { alert("빈칸입니다.");  ono_delete.focus();  return false; }
	    	}
    		</script>    	  
	       <!--  -->
	       <!--  -->
	      </div>
	    </div>
	  </div>

	  </div>
	</div>

	      
	
	

	
</body>
</html>