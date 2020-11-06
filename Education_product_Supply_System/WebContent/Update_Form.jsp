<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
    

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
body{
background-color: pink;
}
</style>
</head>
<body>

<h1><b>Educational Products</b></h1>
	<spr:form action="updateproduct.htm" method="post" commandName="product" >
	<table align="center" class= "table table-bordered text-light">
	
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="productId"/>
			</td>
		</tr>
		<tr>
			<td>
				ProductName :
			</td>
			<td>
				<spr:input path="productName"/>
			</td>
		</tr>
		<tr>
			<td>
				Price:
			</td>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="Adminhome.jsp" >Back</a>
			</td>
			<td>
				<input type="submit" value="Update" >
			</td>
		</tr>
	</table>
	</spr:form>
	
 </body>
</html>
