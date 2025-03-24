<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <h2>Register Here</h2>
    <form:form action="regForm" method="POST" modelAttribute="model_std">
        Name : <form:input path="name"/> <form:errors path="name"/><br/><br/>
        Email : <form:input path="email"/><br/><br/>
        Password : <form:password path="password"/><br/><br/>
        Gender : <form:radiobutton path="gender" label="Male" value="Male"/><form:radiobutton path="gender" label="Female" value="Female"/><br/><br/>
        City : <form:select path="city">
            <form:option value="Select City" label="Select City" />
            <form:option value="Chandigarh" label="Chandigarh" />
            <form:option value="Mumbai" label="Mumbai" />
            <form:option value="Pune" label="Pune" />
        </form:select><br/><br/>
        <input type="submit" value="Register" />
    </form:form>
</body>
</html>