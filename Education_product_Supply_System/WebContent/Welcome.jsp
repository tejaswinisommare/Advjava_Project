

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Products</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<style>
* {
margin: 0;
padding: 0;
}
.box {
width: 100%;
height: 100vh;
background: linear-gradient(to left, #8942a8, #ba382f);
}
#id1 {
position: absolute;
top: 50%;
left: 50%;
transform: translate(-50%,-50%);
color: #fff;
font-family:cursive;
font-weight: 1100;
text-transform: uppercase;
font-size: 40px;
}
#id2 {
position: absolute;
top: 60%;
left: 50%;
transform: translate(-50%,-50%);
font-size: 40px;
}
.box div {
height: 60px;
width: 60px;
position: absolute;
top: 10%;
left: 10%;
animation: animate 4s linear infinite;
background: rgba(255,255,255,.5);
border-radius: 15px;
}
.box div:nth-child(1) {
top: 20%;
left: 20%;
animation: animate 8s linear infinite;
}
.box div:nth-child(2) {
top: 26%;
left: 89%;
animation: animate 10s linear infinite;
}
.box div:nth-child(3) {
top: 80%;
left: 90%;
animation: animate 5s linear infinite;
}
.box div:nth-child(4) {
top: 65%;
left: 75%;
animation: animate 7s linear infinite;
}
.box div:nth-child(5) {
top: 90%;
left: 10%;
animation: animate 9s linear infinite;
}
.box div:nth-child(6) {
top: 30%;
left: 60%;
animation: animate 5s linear infinite;
}
.box div:nth-child(7) {
top: 70%;
left: 33%;
animation: animate 8s linear infinite;
}
.box div:nth-child(8) {
top: 75%;
left: 60%;
animation: animate 10s linear infinite;
}
.box div:nth-child(9) {
top: 23%;
left: 50%;
animation: animate 6s linear infinite;
}
.box div:nth-child(10) {
top: 35%;
left: 7%;
animation: animate 10s linear infinite;
}
@keyframes animate {
0% {
transform: scale(0) translateY(0) rotate(50deg);
}
100% {
transform: scale(1.6) translateY(-250px) rotate(360deg);
}
}

</style>
<body>

<div class="box">
    <div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
</div>
<div id = "id1"><h2>
Welcome to Educational Products</h2></div>
<div id="id2">
<a class="btn btn-primary" href="login_form.jsp" role="button">AdminLogin</a>

<a class="btn btn-primary" href="login_form2.jsp" role="button">CustomerLogin</a>
</div>
</body>
</html>



<!-- 

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div>

<a class="btn btn-primary" href="login_form.jsp" role="button">AdminLogin</a>

<a class="btn btn-primary" href="login_form2.jsp" role="button">CustomerLogin</a>


</div>
</body>
</html>

 -->