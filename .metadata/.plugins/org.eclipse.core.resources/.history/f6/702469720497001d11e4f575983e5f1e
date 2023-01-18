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

<div class="content1" id="content1">
    <div class="row column text-center"><br>
      
      <div class="container">
      <div class="wrap">
      <h2 class="title">자유게시판 글쓰기</h2>
      <hr>
      	<form action="${path1 }/free/insert.do" method="post">
		      <table id="table1">
		      	<tbody>
		      		<tr>
		      			<th style="background-color:#dcdcdc">닉네임</th>
		      			<td>
		      			<input type="text" name="nickname" id="nickname" value="${sid }" readonly="readonly">
		      			</td>
		      		</tr>
		      		<tr>
		      			<th style="background-color:#dcdcdc">글 제목</th>
		      			<td>
		      				<input type="text" name="title" id="title" placeholder="제목 입력" maxlength="98" required>
		      			</td>
		      		</tr>
		      		<tr>
		      			<th style="background-color:#dcdcdc">글 내용</th>
		      			<td>
		      				<textarea name="content" id="content" placeholder="내용 입력" rows="8" cols="100" maxlength="800" required></textarea>
		      				<script>
					      	CKEDITOR.replace("content", {filebrowserUploadUrl:'/free/imageUpload.do'})
					      	</script>
		      			</td>
		      		</tr>
		      		<tr>
		      			<td colspan="2" style="float:left;">
		      				<input type="submit" class="button hollow" value="글 등록" >
		      				<a class="button hollow" href="${path1 }/free/list.do">
							<span>목록
		        	  	<i class="fi-list"></i>
		        	    </span>
							</a>
		      			</td>
		      		</tr>
		      	</tbody>
		      </table>
		   </form>  
		   </div> 
      </div>
    </div>
</div>
<jsp:include page="../include/footer.jsp" />
</body>
</html>