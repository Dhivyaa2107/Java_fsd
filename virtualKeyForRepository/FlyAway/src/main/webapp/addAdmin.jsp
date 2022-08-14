<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddAdmin" method="post">
<label>Email</label>
<input type="text" name="email"/><br>
<label>password</label>
<input type="password" name="pwd"/><br>
<label> ReEnter New password</label>
<input type="text" name="rpwd"/>
<input type="submit" value="signUp"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>