<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring 유용한기능</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="container card">
		<h3 class="card-header bg-success text-white">USERS</h3>
		<!--  for( UserDto u : list){} -->
		<c:forEach  var="u"  items="${list}" varStatus="status" >
		<div class="alert alert-warning my-3">
			<a href="detail.user?no=${u.no}"> 
				NO : ${u.no} - NAME: ${u.name} - AGE: ${u.age}  
			</a>
				
			<a href="delete.user?no=${u.no}" class="btn btn-danger">삭제</a>
		</div>
	    </c:forEach>
	</div>
	<!-- insert -->
	<!-- insert -->
	<div class="container card my-3">
	 	<form method="post" 
              action="insert.user"   id="userInsert" onsubmit="return form1()">
           <fieldset> 
           <legend>유저입력폼</legend>
            <div class="form-group"> 
               <label for="name4">이름</label>
               <input type="text" name="name"   id="name4"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age4">나이</label>
               <input type="number" name="age"   id="age4"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>
         </fieldset>      
      	</form> 
      
      <script>      
      function form1() {
      let name4	= document.querySelector("#name4");
      let age4	= document.querySelector("#age4");
      
      if( name4.value =="") { alert("빈칸입니다.");  name4.focus();  return false; }
  	  if(  age4.value =="") { alert("빈칸입니다.");   age4.focus();  return false; }
      }      
      </script>	
	</div>
	
	<!-- update -->
	<!-- update -->
	<div class="container card my-3">
	 	<form method="post" action="update.user"   id="userUpdate" onsubmit="return form2()" >
           <fieldset> 
           <legend>유저수정폼</legend>
            <div class="form-group"> 
               <label for="name4">번호</label>
               <input type="text" name="no"   id="no_u"   class="form-control"/>
            </div>   
            <div class="form-group"> 
               <label for="name4">이름</label>
               <input type="text" name="name"   id="name_u"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age4">나이</label>
               <input type="number" name="age"   id="age_u"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>
         </fieldset>      
      	</form>
      	
      <script>     
      function form2() {
      let no_u	    = document.querySelector("#no_u");
      let name_u	= document.querySelector("#name_u");
      let age_u	    = document.querySelector("#age_u");
      
      if(   no_u.value =="") { alert("빈칸입니다.");    no_u.focus();  return false; }
      if( name_u.value =="") { alert("빈칸입니다.");  name_u.focus();  return false; }
  	  if(  age_u.value =="") { alert("빈칸입니다.");   age_u.focus();  return false; }
      }    
      </script>     	
     </div>
     
    
	

</body>
</html>