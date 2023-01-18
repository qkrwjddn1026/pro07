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
	<title>자유게시판 상세글</title>
	<c:set var="path1" value="${pageContext.request.contextPath }" />
	<jsp:include page="../include/head.jsp" />
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content" id="content">
	    <div class="row column text-center"><br>
	      
	      <div class="container">
	      <div class="wrap">
	      <h2 class="title">자유게시판 상세 보기</h2>
	      <hr>
		      <div class="table1">
		      	
					<div class="q_title">
						<strong>
							${dto.title }
						</strong><hr>
					</div>
					<div class="q_content">
						${dto.content }
					</div>
					<span class="q_date">
						<fmt:parseDate value="${dto.regdate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
						<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
					</span> 
					<span class="q_date">
					작성자 : ${dto.nickname }
					</span>
					<span class="q_date">
					읽은횟수 : ${dto.visited }
					</span>
		      </div><br>
				<div class="button-group">
				  <a class="button hollow" href="${path1 }/free/list.do">
				  <span>목록
			        <i class="fi-list"></i>
			        </span>
				  </a>
				  <c:if test="${sid eq dto.nickname }">
				  <a class="button hollow" href="${path1 }/free/edit.do?bno=${dto.bno}">
				 <span>수정
			         <i class="fi-pencil"></i>
			         </span>
				  </a>
				  <a class="button hollow alert" href="${path1 }/free/delete.do?bno=${dto.bno}">
				  <span>삭제
			        <i class="fi-trash"></i>
			        </span>
				  </a>
				  </c:if>
				  <c:if test="${sid eq 'admin' }">
				  <a class="button hollow alert" href="${path1 }/free/delete.do?bno=${dto.bno}">
				  <span>삭제
			        <i class="fi-trash"></i>
			        </span>
				  </a>
				  </c:if>
				</div>
	      </div>
	      </div>
	    </div>
	</div>
		<jsp:include page="../include/footer.jsp" />
</body>
</html>