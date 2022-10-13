<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Details:</h1>
	<h3>( Printing from the ArrayList "details" )</h3>
	<table>
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Quantity</th> 
		</tr>
		<c:forEach var="prod" items="${Product_Details}" >
		<tr>
			<td>${prod.productID}</td>
			<td>${prod.productName}</td>
			<td>${prod.quantity}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>