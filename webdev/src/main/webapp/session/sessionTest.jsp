<%@page import="javabean.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temp Page</title>
</head>
<body>
<%
	Member member = new Member();
	member.setName("서태웅");
	member.setAge(21);
	member.setHeight(188.6);
	
	session.setAttribute("name", "정대만");
	session.setAttribute("age", 19);
	session.setAttribute("height", 177.5);
	session.setAttribute("member", member);

	response.sendRedirect("sessionTest2.jsp");
%>
</body>
</html>