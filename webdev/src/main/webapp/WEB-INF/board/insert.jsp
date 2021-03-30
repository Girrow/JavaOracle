<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
<link rel="stylesheet" href="css/board.css" type="text/css">
</head>
<body>
	<form action="BoardInsertAction.do" method="post">
		<table>
			<caption>Write</caption>
			<tr>
				<th>Title</th>
				<td><input type="text" name="title" autofocus="autofocus" required="required"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" required="required"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>
				<th>Content</th>
				<td><textarea rows="5" cols="50" name="content" required="required"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="send"></td>
			</tr>
		</table>
	</form>
</body>
</html>