
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ChangePassword" method="post">
<label>Email</label>
<input type="text" name="email"/><br>
<label>New password</label>
<input type="text" name="pwd"/><br>
<label> ReEnter New password</label>
<input type="text" name="rpwd"/><br>
<input type="submit" value="Change"/>
<input type="reset" value="reset"/>
</body>
</html>