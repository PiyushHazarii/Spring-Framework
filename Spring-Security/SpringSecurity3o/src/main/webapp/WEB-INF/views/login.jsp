<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: yellow;">
	<h3>Login Page</h3>

	<form action="j_spring_security_check" method="post">
		Username : <input type="text" name="username" /><br /><br /> 
		Password : <input type="password" name="password" /><br /><br /> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="Login" />
	</form>
</body>
</html>