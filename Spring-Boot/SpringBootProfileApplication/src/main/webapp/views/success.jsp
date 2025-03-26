<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="body_div">
    <br/><span class="body_text_title" style="color: blue;">${model_message} </span>
    <jsp:include page="${model_pagename}.jsp" />
</div>
</body>
</html>