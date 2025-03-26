<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body>
	<div style="width: 100%; text-align: center;">
			<h1 style="color: green;">Update User</h1>
		  <form action="updateUserForm" method="post">
		    Name : 	<input type="text" name="name1" /><br /><br />
		    Email : <input type="text" name="email1" /><br /><br />
		    Gender :  <input type="text" name="gender1" /><br /><br />
		    City : <input type="text" name="city1" /><br /><br />
		    		<input type="submit" value="Update User" />
		  </form>
	</div>
</body>
</html>