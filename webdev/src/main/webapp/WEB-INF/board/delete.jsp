<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
<link rel="stylesheet" href="/css/board.css" type="text/css">
</head>
<body>
	<form action="BoardDeleteAction.do" method="post">
<%-- 	<input type="hidden" value="<%=no%>" name="no"/> --%>
		<table>
			<caption>Delete</caption>
			<tr>
				<th>No</th>
				<td>${no}<input type="hidden" value="${no}" name="no" autofocus="autofocus" required="required" readonly="readonly"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password" required="required"><br/>
				* Write your first password again
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="delete"></td>
			</tr>
		</table>
	</form>
</body>
</html>