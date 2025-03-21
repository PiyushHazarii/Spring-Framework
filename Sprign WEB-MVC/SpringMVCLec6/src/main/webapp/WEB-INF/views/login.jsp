<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Here</h2>

<!-- This is the wat to get the model object here and checked whether it is empty or not -->
	<c:if test="${not empty login_error}">
		<h2 style="color: red">${login_error}</h2>
	</c:if>

	<form action="loginForm" method="post">
		Email ID : <input type="text" name="email1" /><br />
		<br /> Password : <input type="password" name="pass1" /><br />
		<br /> <input type="submit" value="LOGIN" />
	</form>
</body>
</html>