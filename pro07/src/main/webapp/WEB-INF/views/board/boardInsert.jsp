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
	<title>Insert title here</title>
	<c:set var="path1" value="${pageContext.request.contextPath }" />
	<jsp:include page="../include/head.jsp" />
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content" id="content">
	    <div class="row column"><br>
	     
	      <div class="container">
	      <div class="wrap">
	       <h2 class="title">공지사항 글 등록</h2>
	      <hr>
	      	   <form action="${path1}/board/insert.do" method="post">
					<table class="table">
					   <tbody>
					    <tr>
					      <th><label for="title">제목</label></th>
					      <td><input type="text" class="input" maxlength="120" name="title" id="title" placeholder="제목 입력" required /></td>
					    </tr>
					    <tr>
					      <th><label for="content">내용</label></th>
					      <td><textarea rows="8" cols="100" name="content" id="content" class="textarea" required></textarea></td>
					    </tr>
					  </tbody>
					</table>
					<div class="buttons" style="float:left;">
						<a href="./list.do" class="button hollow">
						<span>목록
		        	  	<i class="fi-list"></i>
		        	    </span>
						</a>
					  <button type="submit" class="button hollow">
					  <span>등록
		        	  	<i class="fi-plus"></i>
		        	    </span>
					  </button>
					  <button type="reset" class="button hollow alert">
					  <span>취소
			        <i class="fi-trash"></i>
			        </span>
			        </button>
					</div>
				</form>
				</div>
	      </div>
	    </div>
	</div>

<jsp:include page="../include/footer.jsp" />
</body>
</html>