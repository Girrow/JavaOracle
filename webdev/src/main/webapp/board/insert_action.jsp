<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String title = request.getParameter("title");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	
	String sql = 
			"INSERT INTO m1board (no, title,name,password,content)"+
			"VALUES(m1board_seq.nextval,?,?,?,?)";
	
	boolean result = false;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oraclejava","oraclejava");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, name);
		pstmt.setString(3, password);
		pstmt.setString(4, content);
		pstmt.executeUpdate();
		
		result=true;
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(result){
		//rs.close();
		pstmt.close();
		conn.close();
			
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Body Tag</title>
</head>
<body>
<script type="text/javascript">
<%if(result){%>
	alert('Write Success');
	location.href='list.jsp';
<%}else{%>
	alert("ERROR!");
	location.href='javascript:history.back();';
<%}%>
</script>
</body>
</html>