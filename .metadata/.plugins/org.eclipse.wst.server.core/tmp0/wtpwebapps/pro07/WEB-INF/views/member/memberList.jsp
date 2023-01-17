<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<jsp:include page="../include/head.jsp" />
    <style>
    	
    </style>
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content">
    <div class="row column text-center">
      <h2>회원 목록</h2>
      <hr>
      <table>
      	<thead>
      		<tr>
      			<th width="200">No</th>
      			<th width="200">ID</th>
      			<th width="200">NAME</th>
      		</tr>
      	</thead>
      	<tbody>
      	<c:forEach items="${memberList }" var="mem" varStatus="status">
      		<tr>
      			<td>${status.count }</td>
      			<td><a href="./getMember.do?id=${mem.id }">${mem.id }</a></td>
      			<td>${mem.name }</td>
      		</tr>
      	</c:forEach>
      	</tbody>
      </table>
    </div>
</div>
 

	<jsp:include page="../include/footer.jsp" />
</body>
</html>