<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/game.mvc" method="post">
		<select name="you">
			<option value="1">가위</option>
			<option value="0">바위</option>
			<option value="2">보</option>
		</select>
		<input type="submit" value="submit">
	</form>
</body>
</html>