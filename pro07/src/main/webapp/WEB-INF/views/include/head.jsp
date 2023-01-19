<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path0" value="${pageContext.request.contextPath }" />
<script src="https://code.jquery.com/jquery-latest.js"></script>
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous"> -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.1/css/jquery.dataTables.min.css"/>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.js"></script>

<link rel="stylesheet" href="https://cdn.ayroui.com/1.0/css/tiny-slider.css" />

<style>
a {
  text-decoration: none;
}
.slider-three {
  background-color: var(--light-2);
  
}
.slider-three .section-title .title {
  font-size: 44px;
  line-height: 55px;
  font-weight: 600;
  color: var(--black);
}
@media (max-width: 767px) {
  .slider-three .section-title .title {
    font-size: 28px;
    line-height: 32px;
  }
}
.slider-three .section-title .text {
  color: var(--dark-3);
  margin-top: 24px;
}
.slider-three .slider-items-wrapper {
  position: relative;
}
.slider-three .slider-items-wrapper .tns-nav {
  width: 100%;
  z-index: 2;
  display: flex;
  justify-content: center;
  margin-top: 40px;
}
.slider-three .slider-items-wrapper .tns-nav button {
  width: 10px;
  height: 10px;
  border-radius: 50px;
  background-color: var(--primary);
  opacity: 0.5;
  border: 0;
  margin: 0 5px;
  -webkit-transition: all 0.4s ease-out 0s;
  -moz-transition: all 0.4s ease-out 0s;
  -ms-transition: all 0.4s ease-out 0s;
  -o-transition: all 0.4s ease-out 0s;
  transition: all 0.4s ease-out 0s;
}
.slider-three .slider-items-wrapper .tns-nav button.tns-nav-active {
  width: 20px;
  opacity: 1;
  border-radius: 5px;
}
.slider-three .single-items-one {
  margin-top: 40px;
}
.slider-three .single-items-one img {
  width: 100%;
  box-shadow: var(--shadow-2);
  border-radius: 10px;
}

.link-secondary img {width:113px;}

.content{width:1296px; margin-left:auto; margin-right:auto;}
</style>
