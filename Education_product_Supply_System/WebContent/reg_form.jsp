<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}
/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 50px;
  margin-top:80px;
  max-width: 400px;
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

img{
width:880px;
height: 700px;
}
h1{

}
</style>
</head>
<body>
  <h1><b>Educational Products</b></h1>
<div class="container-fluid">
  <div class="row">
      <div class="col-sm-9 col-md-6 col-lg-8">
  
    <img alt="my pic"  src='<c:url  value="/resources/image/s.jpg"></c:url>'>
    </div>
     <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:Pink;">
<form action="process1" method="Post" class="container" >
    <h1>Customer Registration</h1>

    <label for="userName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName"  required>

    <label for="userPass"><b>Password</b></label>
    <input type="password"title="Must contain at least one number and one uppercase and lowercase letter, and at least 5 or more characters" 
     placeholder="Enter Password" name="userPass" required>

    <label for="emailId"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="emailId" required>

    <label for="mobNo"><b>MobileNo</b></label>
    <input type="text" placeholder="Enter MobileNo" name="mobNo" required>
    

     <input type="submit" value="SingUP" /> 
     
      </form>
         
    </div>
  </div>
</div>

</body>
</html>

    
	