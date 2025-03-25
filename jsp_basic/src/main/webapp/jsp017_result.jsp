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
	<div class ="container card my-5">
	<h3 class ="card-header">좋아하는 과일 정보</h3>
	<%
	String username = request.getParameter("username");
	String fruit = request.getParameter("fruit");
	String btn = fruit.equals("apple") ? "btn-danger"
				 :fruit.equals("banana") ? "btn-warning"
				 :"btn-success"; 		 
	%>
	<table class="table table-striped">
		<caption>SELECT 데이터 확인</caption>
		<tbody>
		<tr><th scope="row">USER</th><td><%=username%></td></tr>
		<tr><th scope="row">CHECK</th><td>
		<img src="images/<%=fruit%>.jpg" alt="">
		</td></tr>
		</tbody>
	</table>
	<a href="jsp017_repeat_select.jsp" class ="btn <%=btn%>" >BACK</a>
	</div>
</body>
</html>