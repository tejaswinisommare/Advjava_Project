<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cdac.dto.Product"%>
<%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>
<body class="bg-dark">

<h3 class="mb-3"><a href="Adminhome.jsp" >Back</a></h3>
	<table class="table table-bordered text-light">
    <thead>
    <tr>
      <th scope="col">ProductName</th>
      <th scope="col">Price</th>
      </tr>
  </thead>
	<tbody>
		<tr>
	     <% 
		List<Product> plist = (List<Product>)request.getAttribute("productlist");
		for(Product pro : plist){
		%>
	
		<td><%=pro.getProductName()%></td>
	
		<td><%=pro.getPrice()%></td>
		
		<td class="bg-danger"><a  class="text-light d-flex justify-content-center align-items-center" href="Product_delete?productId=<%=pro.getProductId()%>">Delete</a></td>
		<td class="bg-primary"><a class="text-light d-flex justify-content-center align-items-center "href="Update_Form?productId=<%=pro.getProductId()%>">Update</a></td>
	</tr>
	</tbody>
	<%
	} %>
	
	</table>
</body>
</html>
     	