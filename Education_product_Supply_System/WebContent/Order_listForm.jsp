<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cdac.dto.Order"%>
<%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
th{
color: Pink;
}
h1{
align-items: cenetr;
font-family:cursive;

}

table{background-color: grey;
}
</style>
</head>
<body>
<div>
<h1>Educational Products</h1>
</div>


<h3 class="mb-3"><a href="home.jsp" >Back</a></h3>
	<table class="table table-bordered text-light" align="center">
    <thead>
    <tr>
          <th scope="col">CustomerName</th>
      <th scope="col">ProductName</th>
      <th scope="col">MobileNo</th>
            <th scope="col">Quantity</th>
            <th scope="col">Payment</th>
      
            </tr>
  </thead>
	<tbody>
		<tr>
	     <% 
		List<Order> plist = (List<Order>)request.getAttribute("orderlist");
		for(Order pro : plist){
		%>
		<td><%=pro.getOrderName()%></td>
		     <td><%=pro.getProName() %>
		<td><%=pro.getMobNo()%></td>
		<td><%=pro.getQuantity()%></td>
		<td><%=pro.getPayment()%></td>
		<td class="bg-danger"><a  class="text-light d-flex justify-content-center align-items-center" href="Order_delete?orderId=<%=pro.getOrderId()%>">CancelOrder</a></td>
		
		
	</tr>
	</tbody>
	<%
	} %>
	
	</table>
</body>
</html>
     	