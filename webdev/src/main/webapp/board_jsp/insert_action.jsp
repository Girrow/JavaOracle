<%@page import="board.model.BoardDao"%>
<%@page import="board.model.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="boardDto" class="board.model.BoardDto" /> --%>
<%-- <jsp:setProperty property="*" name="boardDto"/> --%>
<%
	String title = request.getParameter("title");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	
	BoardDto boardDto = new BoardDto();
	boardDto.setTitle(title);
	boardDto.setName(name);
	boardDto.setPassword(password);
	boardDto.setContent(content);
	
	BoardDao boardDao = BoardDao.getInstance();
	System.out.println("boardDao hashcode :"+boardDao.hashCode());
	boolean result = boardDao.insertBoard(boardDto);
	
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