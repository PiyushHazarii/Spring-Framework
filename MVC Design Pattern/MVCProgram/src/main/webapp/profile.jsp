<%@page import="me.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lime;">
	<%
		Student student = (Student)session.getAttribute("session_student");
		String name = student.getName();
		String email = student.getEmail();
		//String city = student.getCity();
	%>
	<h3>Welcome  <%=name %></h3>
	<h3>Email:-  <%=email %></h3>
	
	
	<a href="logout">Logout</a>

</body>
</html>
