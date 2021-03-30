<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Long no = Long.parseLong(request.getParameter("no"));
	String password = request.getParameter("password");
	
	BoardDto boardDto = new BoardDto();
	boardDto.setNo(no);
	boardDto.setPassword(password);
	
	BoardDao boardDao = BoardDao.getInstance();
	boolean result = boardDao.deleteBoard(boardDto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
<script type="text/javascript">
<% if(result){%>
	alert('Delete Complete!');
	location.href='list.jsp';
<%}else{%>
	alert('Wrong Password');
	location.href='javascript:history.back();';
<%}%>
</script>
</body>
</html>