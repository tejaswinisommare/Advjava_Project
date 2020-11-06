<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  
  background-color:Pink;

  min-height: 650px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 50px;
  margin-top:40px;
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

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
.header {
  text-align: center;
  padding: 32px;
}

.row {
  display: -ms-flexbox; 
  display: flex;
  -ms-flex-wrap: wrap; 
  flex-wrap: wrap;
  padding: 0 4px;
}

.column {
  -ms-flex: 25%; 
  flex: 25%;
  max-width: 25%;
  padding: 0 4px;
}

.column img {
  margin-top: 8px;
  vertical-align: middle;
  width: 100%;
}

@media screen and (max-width: 800px) {
  .column {
    -ms-flex: 50%;
    flex: 50%;
    max-width: 50%;
  }
}

/* Responsive layout - makes the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column {
    -ms-flex: 100%;
    flex: 100%;
    max-width: 100%;
  }
}
img{
width: 100%;
}
</style>
</head>
<body>
     <div class="header">
 <h1><b>Educational Products</b></h1>
</div>

<div class="row"> 
  <div class="column">
            <img alt="my pic"  src='<c:url  value="/resources/image/e.jpg"></c:url>'>
      
    </div>
  <div class="column">
            <img alt="my pic"  src='<c:url  value="/resources/image/e1.jpg"></c:url>'>
  </div>  
       <div class="column">
            <img alt="my pic"  src='<c:url  value="/resources/image/e3.jpg"></c:url>'>
  </div>  
       <div class="column">
            <img alt="my pic"  src='<c:url  value="/resources/image/e4.jpg"></c:url>'>
  </div>  
     
</div>




<div class="bg-img">
  
	<form action="process4" method="Post" class="container" >
    <h1>Order Payment</h1>
      

    <label for="orderName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="orderName"  required>
    <label for="proName"><b>Productname</b></label>
    <input type="text" placeholder="Enter Productname" name="proName"  required>
    
    
    <label for="mobNo"><b>MobileNo</b></label>
    <input type="text" placeholder="Enter MobileNo" name="mobNo" required>
    
    <label for="quantity"><b>Quantity</b></label>
    <input type="text" placeholder="Enter Quantity" name="quantity" required>

    <label for="payment"><b>Payment</b></label>
    <input type="text" placeholder="Enter Password" name="payment" required>

    
     <input type="submit" value="ConformOrder" /> 
     
      </form>
</div>
<div class="row"> 
  <div class="column">
      <img alt="my pic"  src='<c:url  value="/resources/image/School.jpg"></c:url>'>
      
    </div>
  <div class="column">
        <img alt="my pic"  src='<c:url  value="/resources/image/s.jpg"></c:url>'>
  </div>  
       <div class="column">
            <img alt="my pic"  src='<c:url  value="/resources/image/e2.jpg"></c:url>'>
  </div>  
       <div class="column">
        <img alt="my pic"  src='<c:url  value="/resources/image/e5.jpg"></c:url>'>
  </div>  
     
</div>

</body>
</html>
