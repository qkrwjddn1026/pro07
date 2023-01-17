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
	<title>질문 및 답변 리스트</title>
	<c:set var="path1" value="${pageContext.request.contextPath }" />
	<jsp:include page="../include/head.jsp" />
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content">
<div class="wrap"><br>
	<h2 class="title">묻고 답하기</h2>
	<hr>
	<table id="example" class="display" style="width:100%">
		<thead>
			<tr>
				<th style="max-width:5px">
				</th>
				<th>연번</th>
				<th>제목</th>
				<th>작성자</th
				><th>작성일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${qnaList }" var="vo" varStatus="status">
			<tr>
				<td><span style="color:transparent">${vo.parno }</span></td>
				<td>
					<span>${status.count}</span>
				</td>
				<td><a href="./detail.do?no=${vo.no }">${vo.title }</a></td>
				<td>${vo.author }</td>
				<td>
					<fmt:parseDate value="${vo.regdate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
		      		<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
		      	</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
	<c:if test='${not empty sid}'>
	<div class="btn-group">
		<a href="./insert.do" class="button hollow">글 등록</a>
	</div>
	</c:if>
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