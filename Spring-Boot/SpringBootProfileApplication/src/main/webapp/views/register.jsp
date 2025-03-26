<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
    <div class="body_div">
        <br/><span class="body_text_title" style="color: green">Registration Form</span><br/><br/>
        <form action="regForm" method="post">
            Name : <input type="text" name="name" /><br/><br/>
            Email Id : <input type="text" name="email" /><br/><br/>
            Password : <input type="password" name="pass" /><br/><br/>
            Gender : <input type="radio" name="gender" value="Male" /> Male <input type="radio" name="gender" value="Female" /> Female<br/><br/>
            City : <select name="city">
	                <option>Select City</option>
	                <option value="Delhi">Delhi</option>
	                <option value="Mumbai">Mumbai</option>
	                <option value="Pune">Pune</option>
	                <option value="Chandigarh">Chandigarh</option>
            </select> <br/><br/>
            <input type="submit" value="Register here" />
        </form>
    </div>
</body>
</html>