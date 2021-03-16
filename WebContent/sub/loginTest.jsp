<%@page import="com.ee.y1.member.MemberDTO"%>
<%@page import="com.ee.y1.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Test JSP Page</h1>
	
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		memberDTO = memberDAO.login(memberDTO);
		
		String str="";
		
		if(memberDTO != null) {
			str="로그인 성공";
		} else {
			str="로그인 실패";
		}
		
	%>
	
	<h3><%= id %></h3>
	<h3><%= pw %></h3>
	
	<h3><%= str %></h3>
	
</body>
</html>