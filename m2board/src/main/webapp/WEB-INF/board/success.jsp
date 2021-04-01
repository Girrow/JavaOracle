<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
</head>
<body>
<table border="1">
	<caption>Account Success</caption>
	<tr>
		<th>ID</th>
		<td>${memberDto.id}</td>
	</tr>
	<tr>
		<th>Name</th>
		<td>${memberDto.name}</td>
	</tr>
	<tr>
		<th>Birth</th>
		<td>${memberDto.birth}</td>
	</tr>
	<tr>
		<th>phone</th>
		<td>${memberDto.phone}</td>
	</tr>
	<tr>
		<th>address 1</th>
		<td>${memberDto.address1}</td>
	</tr>
	<tr>
		<th>address 2</th>
		<td>${memberDto.address2}</td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
			<input type="button" value="로그인 이동" onclick="location.href='Login.do';">
		</td>
	</tr>
	
</table>

</body>
</html>