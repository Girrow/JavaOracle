<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Long no = Long.parseLong(request.getParameter("no"));
    	BoardDao boardDao = BoardDao.getInstance();
    	boolean result = boardDao.updateReader(no);
    	if(!result){
    		%>
   		<script type="text/javascript">
			alert('해당하는 글이 존재하지 않습니다.');
			location.href='list.jsp';
		</script>
    		<%
    		return;
    	}
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
	<a href="list.jsp">[List]</a>
	<a href="update.jsp?no=<%=no%>">[Update]</a>
	<a href="delete.jsp?no=<%=no%>">[Delete]</a>
</body>
</html>