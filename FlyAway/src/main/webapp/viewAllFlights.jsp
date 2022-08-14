<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Flights"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>Srno</th>
	<th>flight Name</th>
	<th>Source</th>
	<th>Destination</th>
	<th>Date</th>
	<th>Time</th>
	<th>Price</th>
	<th>Seats</th>
</tr>
<%
Object obj = session.getAttribute("flights");
List<Flights> listOfflight = (List<Flights>)obj;
Iterator<Flights> li = listOfflight.iterator();
while(li.hasNext()){
	
	Flights f = li.next();
	%>
	<tr>
	<td><%=f.getSrno() %> </td>
	<td><%=f.getFname()%> </td>
	<td><%=f.getSource() %></td>
	<td><%=f.getDestination() %></td>
	<td><%=f.getDate() %></td>
	<td><%=f.getTime() %></td>
	<td><%=f.getPrice() %></td>
	<td><%=f.getSeats() %></td>
	</tr>
	<% 
}
%>
<a href="adminPage.jsp">Admin Page</a>
</table>
</body>
</html>