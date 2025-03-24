<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Welcome : ${model_std.getName()} </h2>
    <h3>Email : ${model_std.getEmail()} </h3>
    <h3>Password : ${model_std.getPassword()} </h3>
    <h3>Gender : ${model_std.getGender()} </h3>
    <h3>City : ${model_std.getCity()} </h3>
</body>
</html>