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
		.content { background-color: transparent;}
.sign-in-form {
  padding: 1rem 1.5em;
  border-radius: .5rem;
  background-color: #3d454f;
}

.sign-in-form h4 {
  color: white;
  margin-bottom: 1rem;
  font-weight: 600;
  text-transform: uppercase;
}

.sign-in-form label {
  text-transform: uppercase;
  color: #adadad;
  letter-spacing: 1px;
  font-weight: 600;
  margin-bottom: 1rem;
}

.sign-in-form input {
  color: #0a0a0a;
}

.sign-in-form input:focus {
  opacity: .8;
}

.sign-in-form-username,
.sign-in-form-password {
  border-radius: 30px;
  border: none;
  opacity: .1;
  transition: all ease .4s;
}

.sign-in-form-button {
  border-radius: 30px;
  border: 1px solid #fff;
  color: #fff;
  background-color: transparent;
  text-transform: uppercase;
  letter-spacing: 1px;
  width: 100%;
  padding: 1rem;
  transition: all ease .4s;
}

.sign-in-form-button:hover {
  background-color: #44c8ed;
  border-color: #44c8ed;
}

		
	</style>
</head>
<body>
<jsp:include page="../include/header.jsp" />
<div class="content"><br>
<form action="${path1 }/member/signin.do" method="post" name="loginForm">
  <div class="sign-in-form">
    <h4 class="text-center">로그인</h4>
    <label for="sign-in-form-username">Username</label>
    <input type="text" class="sign-in-form-username" name="id" id="id">
    <label for="sign-in-form-password">Password</label>
    <input type="password" class="sign-in-form-password" name="pw" id="pw">
    <button type="submit" class="sign-in-form-button">로그인</button>
  </div>
</form>

	
</div>
<jsp:include page="../include/footer.jsp" />
</body>
</html>