<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String msg = (String) request.getParameter("name");
	if (msg.equals("송태섭"))
		msg = msg + ", 도내 No.1 가드 <br>";
	else if (msg.equals("서태웅"))
		msg = msg + ", 도내 No.1 에이스 <br>";
	else if (msg.equals("강백호"))
		msg = msg + ", 도내 No.1 멍청이 <br>";
	else
		msg = msg + ", 가끔 포기함 <br>";
%>
<%=msg%>