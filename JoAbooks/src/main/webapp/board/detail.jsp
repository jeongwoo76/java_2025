<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5  p-3">
	<%-- <%=request.getAttribute("dto")%> --%>
	<!-- http://localhost:8080/JOAbooks/detail.do?bno=7 있는번호 -->
	<h3>MULTIBOARD 상세보기</h3>
	<div class="my-3 ">
		<div class="">
			<span><i class="bi bi-book-half"></i> 조회수</span>
			<p>${ dto.bhit }</p> <!-- dto.getBhit() -->
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 이름</span>
			<p>${ dto.bname }</p>  <%-- <%=dto.getBname() %> --%>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 제목</span>
			<p>${ dto.btitle }</p>
		</div>
	</div> <!-- http://localhost:8080/JOAbooks/detail.do?bno=9 -->
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 내용</span>
			<textarea  class ="form-control" readonly>${ dto.bcontent}</textarea>
		</div>
	</div>
	<div class="text-end">
		<a href="edit_view.do?bno=${dto.bno}" class="btn btn-primary">수정</a> 
		<a href="delete.do?bno=${dto.bno}" class="btn btn-primary">삭제</a> 
		<a href="list.do" class="btn btn-primary">목록보기</a>
	</div>
</div>

<%@ include file="../inc/footer.jsp"%>