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
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
<title>회원가입</title>
</head>
<body>
<div class="container">
	<div data-role="content" class="ui-content">
       <form name="frm1" id="frm1" action="${path1 }/member/insert.do" method="post" >
            <div class="field">
                <label class="label">아이디</label>
                <div class="control">
                    <input class="input" type="text" placeholder="아이디를 입력하세요" name="id" id="id">
                   
                </div>
            </div>
            <div class="field">
                <label class="label">비밀번호</label>
                <div class="control">
                    <input class="input" type="password" placeholder="비밀번호를 입력하세요" name="pw" id="pw">
                </div>
            </div>
           
               <div class="field">
                <label class="label">이름</label>
                <div class="control">
                    <input class="input" type="text" placeholder="이름" name="name" id="name">
                </div>
            </div>
            <div class="field">
                <label class="label">전화번호</label>
                <div class="control">
                    <input class="input" type="text" placeholder="전화번호를 입력하세요" name="tel" id="tel">
                </div>
            </div>
            <div class="field">
                <label class="label">주소</label>
                <div class="control">
                    <input class="input" type="text" name="addr" id="addr" placeholder="기본주소 입력" maxlength="150" required><br><br>
                </div>
            </div>
            <div class="buttons">
                <button type="submit" class="button is-primary is-light">가입</button>
                <button type="reset" class="button is-link is-light">취소</button>
            </div>
            
            <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
        </form>
    </div>
    </div>
</body>
</html>