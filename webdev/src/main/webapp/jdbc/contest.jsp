<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection cn=null;	//connection역할을 하는 객체를 할당
	
	boolean result = false;	//db에 연결 성공하면 true
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");	//오라클 드라이버 존재유무 확인
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		result=true;
	}
	catch(Exception e){
		e.printStackTrace();
	} finally{	//사용한 자원은 반드시 역순으로 해제
		if(cn!=null) try{cn.close();} catch(Exception e){}
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
데이터베이스 연결 성공
<%}else{ %>
데이터베이스 연결 실패
<%} %>
</body>
</html>