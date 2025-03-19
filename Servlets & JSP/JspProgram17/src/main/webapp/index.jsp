<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to Smart Programming</h3>
	 <!-- this is declarative tag this has instance method and variable -->
	<%!
		String name1 = "Sanju";
	%>
		Welcome: <%=name%>
		
		<!-- this is scriptlet tag -->
	<%
		String name = "Piyush";
		int age = 21;
		// ye console (terminal) mein pritn karega output 
		System.out.println(name+"  "+age);
		
		// ye web page mein output print karega 
		out.println(name+"  "+age);
		out.println();
	%>
	
	<%!
	    int rollno = 101;
	    String name = "deepak";
	
	    public int add(int a, int b) {
	        return a + b;
	    }
	%>
	<!-- This is Expression tag where we can access the data   -->
	<%= rollno %>
	<%= name %>
	<%= add(100, 200) %>
</body>
</html>
<!-- This is the way in which we can implement java in html code that is called JSP  -->