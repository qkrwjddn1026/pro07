<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />

<html>
<head>
<jsp:include page="include/head.jsp"></jsp:include>
	<meta charset="UTF-8">
	<title>Home</title>

</head>
<body>
<header id="header">
<jsp:include page="./include/header.jsp"></jsp:include>
</header>

<P>  The time on the server is ${serverTime}. </P>
<a href="${path1 }/member/list">리스트</a><br>
<a href="${path1 }/member/agree">약관동의</a><br>
<a href="${path1 }/member/join">회원가입</a>
</body>
</html>
