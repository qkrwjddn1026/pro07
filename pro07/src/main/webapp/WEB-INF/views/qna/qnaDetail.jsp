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
	    <div class="row column">
	      
	      <div class="container">
	      <div class="wrap"><br>
	      <h2 class="title">Q&A 상세글</h2>
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
					작성자 : ${dto.author } <br> 글번호 : <span class="par">${dto.no }</span>
					</span>
		      </div><br>
		      <div class="table1" id="at">
		      </div>
		       <script>
			    $(document).ready(function(){
			        var parno = $(".par").text();
			        $.ajax({
			          url:"${path1 }/qna/atail.do?parno=" + parno,
			          //data:eno,
			          dataType:"json",
			          method:"GET"
			        })
			        .done(function(res){
			          $.each(res, function(k, v){
			          console.log(k);
			          let str = "<span>" + v.author + " : " + v.content + "</span><br>";
			          $("#at").append(str);
			          });
			        })
			        .fail(function(){
			          console.log("fail");
			        });
			    });
			  </script>
		      <br>
				<div class="button-group">
				  <a class="button hollow" href="${path1 }/qna/list.do">
				   <span>목록
			        <i class="fi-list"></i>
			        </span>
				  </a>
				  <c:if test="${sid eq dto.author }">
				  <a class="button hollow" href="${path1 }/qna/edit.do?no=${dto.no}">
				  <span>수정
			         <i class="fi-pencil"></i>
			         </span>
				  </a>
				  <a class="button hollow alert" href="${path1 }/qna/delete.do?no=${dto.no}">
				  <span>삭제
			        <i class="fi-trash"></i>
			        </span>
			        </a>
			        </c:if>	
			        <c:if test="${not empty sid }">			  
				  <a class="button hollow" href="${path1 }/qna/wright.do?no=${dto.no}">
				  <span>답변 작성
			        <i class="fi-plus"></i>
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