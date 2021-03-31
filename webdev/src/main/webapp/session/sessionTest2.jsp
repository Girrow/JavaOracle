<%@page import="javabean.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("name");
	int age = (Integer)session.getAttribute("age");
	double height= (Double)session.getAttribute("height");
	
	Member member = (Member)session.getAttribute("member");
%>
이름 : <%=name %> <br/>
나이 : <%=age%> <br/>
키   : <%=height %> <br/>
<hr>
멤버 : <%=member %> <br/>
${member.name}
이름 : <%=member.getName() %> <br/>
나이 : <%=member.getAge()%> <br/>
키   : <%=member.getHeight() %> <br/>

</body>
</html>