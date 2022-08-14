<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddFlight" method="post">
<label>SrNo</label>
<input type="number" name="srno"/><br>
<label>Flight Name</label>
<input type="text" name="fname"/><br>
<label>source</label>
<input type="text" name="src"/><br>
<label>destination</label>
<input type="text" name="des"/><br>
<label>date</label>
<input type="date" name="date"/><br>
<label>time</label>
<input type="text" name="time"/><br>
<label>price</label>
<input type="number" name="price"/><br>
<label>seats</label>
<input type="number" name="seat"/><br>
<input type="submit" value="save"/>
<input type="reset" value="reset"/>
</form>
<a href="adminPage.jsp">Admin Page</a>
</body>
</html>