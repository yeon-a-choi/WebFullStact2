<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Test JSP Page</h1>
	
	<%
		Random random = new Random();
		int num = random.nextInt(100);
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	
	%>
	
	<h1><%= num %></h1>
	<h1><%= name %></h1>
	<h1><%= age %></h1>

</body>
</html>