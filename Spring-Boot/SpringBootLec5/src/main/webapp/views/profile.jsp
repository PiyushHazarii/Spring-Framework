<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome : ${model_student.getName()}</h3>
	<h3>Email : ${model_student.getEmail()}</h3>
	<h3>Gender : ${model_student.getGender()}</h3>
	<h3>City : ${model_student.getCity()}</h3>
</body>
</html>