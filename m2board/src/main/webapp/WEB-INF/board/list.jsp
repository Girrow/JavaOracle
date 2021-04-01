<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" href="css/board.css" type="text/css">
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
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.no}</td>
			<td><a href="BoardView.do?no=${dto.no}">${dto.title}</a></td>
			<td>${dto.name}</td>
			<td>${dto.writer}</td>
			<td>${dto.reader}</td>
		</tr>
</c:forEach>
	</table>
	<a href="BoardInsert.do">글 쓰기</a>
</body>
</html>