<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	boolean result=false;
	Connection conn =null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		//
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oraclejava","oraclejava");
		result = true;
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		conn.close();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if(result){ %>
		DB connect Success
	<%}else{ %>
		DB connect fail
	<%} %>
</body>
</html>