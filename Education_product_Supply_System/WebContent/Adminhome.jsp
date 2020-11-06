<%@page import="java.security.cert.CertPathValidatorException.Reason"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cdac.dto.Admin"%>
               <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
img{
height: 100vh;
width: 1350px;
}
</style>
</head>
<body>
<%=(session.getAttribute("adminlogin")!=null) ? ((Admin)session.getAttribute("adminlogin")).getAdminName():"!!!!!!!"%>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <a class="navbar-brand" href="#">@EducationSupplier</a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="AddProduct_Form">AddProducts</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="showProduct">ShowList</a>
      </li>

     </ul>
         <form action="index1" class="form-inline my-2 my-lg-0">
      <button class="btn  btn-outline-danger my-2 my-sm-0" type="submit">Logout</button>
    </form>
  </div>
</nav>

<div>
    <img alt="my pic"  src='<c:url  value="/resources/image/ah.jpg"></c:url>'>

</div>

</body>
</html>
