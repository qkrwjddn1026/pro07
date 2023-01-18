<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>자유게시판 목록</title>
	<c:set var="path1" value="${pageContext.request.contextPath }" />
	<jsp:include page="../include/head.jsp" />
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content" id="content">
    <div class="row column">
      <div class="container">
      <div class="wrap"><br>
      <h2 class="title">자유게시판 글 목록</h2>
      <hr>
      	   <table id="example" class="display" style="width:100%">
		  <thead>
		    <tr>
		      <th><abbr title="bno">연번</abbr></th>
		      <th><abbr title="title">제목</abbr></th>
		      <th><abbr title="nickname">작성자</abbr></th>
		      <th><abbr title="regdate">작성일</abbr></th>
		    </tr>
		  </thead>
		   <tbody>
		   <c:forEach items="${freeList }" var="dto">
		    <tr>
		      <td>${dto.bno }</td>
		      <td><a href="./detail.do?bno=${dto.bno }">${dto.title }</a></td>
		      <td>${dto.nickname }</td>
		      <td>
		      	<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
		      	<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
		<c:if test="${not empty sid }">
		<div class="button-group">
		  <a class="button hollow" href="./insert.do"><span>글 등록
        	  <i class="fi-plus"></i>
        	 </span></a>
		</div>
		</c:if>
      </div>
      </div>
    </div>
</div>
<script>
$(document).ready(function () {
    $("#example").DataTable();
});
</script>
<jsp:include page="../include/footer.jsp" />
</body>
</html>