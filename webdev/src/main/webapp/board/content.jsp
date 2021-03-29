<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Long no = Long.parseLong(request.getParameter("no"));
    	BoardDao boardDao = BoardDao.getInstance();
    	BoardDto boardDto = boardDao.getBoardView(no);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
<link rel="stylesheet" href="/css/board.css" type="text/css">
</head>
<body>
	<table width="600">
	<caption>Content Detail</caption>
		<tr>
			<th>No</th>
			<td><%=boardDto.getNo() %></td>
		</tr>
		<tr>
			<th>Title</th>
			<td><%=boardDto.getTitle() %></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><%=boardDto.getName() %></td>
		</tr>
		<tr>
			<th>Reader</th>
			<td><%=boardDto.getReader() %></td>
		</tr>
		<tr>
			<th>Writer</th>
			<td><%=boardDto.getWriter() %></td>
		</tr>
		<tr>
			<th>Content</th>
			<td><%=boardDto.getContent().replace("\n", "<br/>") %></td>
		</tr>
	</table>
	<br>
	<a href="list.jsp">돌아가기</a>
</body>
</html>