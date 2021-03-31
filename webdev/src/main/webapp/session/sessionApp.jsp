<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Session Test.</h1>
<hr>
Session active time : <%=session.getMaxInactiveInterval()%>
<hr>
<a href="sessionMake.jsp">[Session Make]</a>
<a href="removeItem.jsp?item=id">[remove ID]</a>
<a href="removeItem.jsp?item=name">[remove NAME]</a>
<a href="removeItem.jsp?item=lev">[remove LEVEL]</a>
<a href="sessionInvalidate.jsp?item=lev">[session invalidate]</a>
<hr>
id :
<%
	if(session.getAttribute("id")==null) out.println("No value");
	else out.println(session.getAttribute("id"));
%>
<br>
name :
<%
	if(session.getAttribute("name")==null) out.println("No value");
	else out.println(session.getAttribute("name"));
%>
<br>
level :
<%
	if(session.getAttribute("lev")==null) out.println("No value");
	else out.println(session.getAttribute("lev"));
%>
</body>
</html>