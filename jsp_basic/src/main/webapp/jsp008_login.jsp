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
	<h3 class ="card-header">LOGIN</h3>
	<pre>
	
	처리할경로:jsp008_result.jsp
	주소표시창줄에 노출
	보관용기이름 :email / pass/ remember
	</pre>
	<p style="text-align:center"><img src="images/login.png" alt="login"/> </p> <!-- Q 이미지를 중앙으로 -->
	
	<form action ="jsp008_result.jsp" method="get">
		<div class ="my-3">
			<label for="email" class="form-label">EMAIL</label>
			<input type="email" class="form-control" id="email" name="email" />
		
		</div>
		<div class ="my-3">
			<label for="pass" class="form-label">PASSWORD</label>
			<input type="password" class="form-control" id="pass" name="pass" />
			
		</div>
		<div class ="my-3">
			<label for="check" class="form-label">REMEMBER</label>
			<input type="checkbox" id="check" name="remember" />
		</div>
		<div class ="my-3">
			<input type="submit"   title="login 하러가기"
			class="btn btn-danger" id="check" name="remember" />
		</div>
	</form>
	</div>
</body>
</html>