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
<div class="container px-4 px-lg-5 nimg">
 <section class="slider-three">
    <div class="container">
    <div class="slider-items-wrapper">
        <div class="row slider-items-active">
          <div class="col-lg-4">
            <div class="single-items-one">
              <img src="https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000510&width=460&height=350" alt="Image" />
            </div>
            <!-- single-items-one -->
          </div>
          <div class="col-lg-4">
            <div class="single-items-one">
              <img src="https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000921&width=460&height=350" alt="Image" />
            </div>
            <!-- single-items-one -->
          </div>
          <div class="col-lg-4">
            <div class="single-items-one">
              <img src="https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000960&width=460&height=350" alt="Image" />
            </div>
            <!-- single-items-one -->
          </div>
          <div class="col-lg-4">
            <div class="single-items-one">
              <img src="https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000951&width=460&height=350" alt="Image" />
            </div>
            <!-- single-items-one -->
          </div>
        </div>
        <!-- row -->
      </div>
    </div>
    <!-- container -->
  </section>
<script src="https://cdn.ayroui.com/1.0/js/tiny-slider.js"></script>
<script>
      
      tns({
         autoplay: true,
         autoplayButtonOutput: false,
         mouseDrag: true,
         gutter: 0,
         container: ".slider-items-active",
         center: false,
         nav: true,
         navPosition: "bottom",
         controls: false,
         speed: 400,
         controlsText: [
            '<i class="lni lni-arrow-left-circle"></i>',
            '<i class="lni lni-arrow-right-circle"></i>',
         ],
         responsive: {
            0: {
               items: 1,
            },
            768: {
               items: 2,
            },
            992: {
               items: 3,
            },
         },
      });
   </script>
</div>
<jsp:include page="include/footer.jsp"></jsp:include>
</body>
</html>
