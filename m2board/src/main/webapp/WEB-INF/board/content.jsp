<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
<link rel="stylesheet" href="css/board.css" type="text/css">
</head>
<body>
	<table width="600">
	<caption>Content Detail</caption>
		<tr>
			<th>No</th>
			<td>${boardDto.no}</td>
		</tr>
		<tr>
			<th>Title</th>
			<td>${boardDto.title}</td>
		</tr>
		<tr>
			<th>Name</th>
			<td>${boardDto.name }</td>
		</tr>
		<tr>
			<th>Reader</th>
			<td>${boardDto.reader}</td>
		</tr>
		<tr>
			<th>Writer</th>
			<td>${boardDto.writer}</td>
		</tr>
		<tr>
			<th>Content</th>
			<td>${boardDto.content}</td>
		</tr>
	</table>
	<br>
	<a href="BoardList.do">[List]</a>
	<a href="BoardUpdate.do?no=${boardDto.no}">[Update]</a>
	<a href="BoardDelete.do?no=${boardDto.no}">[Delete]</a>
</body>
</html>