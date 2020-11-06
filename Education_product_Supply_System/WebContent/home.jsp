<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.cdac.dto.Users"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<style>
img{
height: 100vh;
width: 1350px;
}
</style>
<body>
			<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <h2 style="color:white">@EducationSupplier</h2>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="showProductuser"><h5 style="color:white">Products_List</h5></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="showOrder"><h5 style="color:white">Your Order</h5></a>
      </li>
     </ul>
         <form action="index" class="form-inline my-2 my-lg-0">
      <button class="btn  btn-outline-danger my-2 my-sm-0" type="submit">Logout</button>
    </form>
     
   </div>
   
</nav>
<marquee scrollamount="15">      <h3 style="color: Red" >Welcome
<%=(session.getAttribute("userlogin")!=null) ? ((Users)session.getAttribute("userlogin")).getUserName() :"!!!!!!!"%>
</h3>
           </marquee>
     
<div>
    <img alt="my pic"  src='<c:url  value="/resources/image/22.jpg"></c:url>'>

</div>
</body>
</html>