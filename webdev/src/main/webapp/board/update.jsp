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
<title>Update</title>
<link rel="stylesheet" href="/css/board.css" type="text/css">
</head>
<body>
	<form action="update_action.jsp" method="post">
<%-- 	<input type="hidden" value="<%=no%>" name="no"/> --%>
		<table>
			<caption>Update</caption>
			<tr>
				<th>No</th>
				<td><%=boardDto.getNo()%><input type="hidden" value="<%=boardDto.getNo()%>" name="no" autofocus="autofocus" required="required" readonly="readonly"></td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" value="<%=boardDto.getTitle()%>" name="title" autofocus="autofocus" required="required"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" value="<%=boardDto.getName()%>" name="name" required="required"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password" required="required"><br/>
				* Write your first password again
				
				</td>
			</tr>
			<tr>
				<th>Content</th>
				<td><textarea rows="5" cols="50" name="content" required="required"><%=boardDto.getTitle()%></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>