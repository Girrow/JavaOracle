<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/board.css" type="text/css">
</head>
<body>
	<table width="600">
	<caption>Table list</caption>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>이름</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<%
	String sql = "SELECT no"+
                       ",title"+
	                   ",name"+
                       ",writer"+
	                   ",reader"+
                   " FROM m1board"+
           		   " ORDER BY no DESC";
	boolean result = false;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe"
			   ,"oraclejava"
			   ,"oraclejava");
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("no")%></td>
				<td><%=rs.getString("title")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("writer")%></td>
				<td><%=rs.getString("reader")%></td>
			</tr>
			<%
		}
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
	</table>
</body>
</html>