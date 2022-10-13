<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Enter Product Details</h1>
	<form action="addProductServlet" method="post">
		<table>
			<tr>
				<td>Product ID: </td>
				<td><input name="productID" /></td>
			</tr>
			<tr>
				<td>Product Name: </td>
				<td><input name="productName" /></td>
			</tr>			
			<tr>
				<td>Quantity: </td>
				<td><input name="quantity" /></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Add"/></td>
			</tr>
		</table>
	</form>
	
</body>
</html>