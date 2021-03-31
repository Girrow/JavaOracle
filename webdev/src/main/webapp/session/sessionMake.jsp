<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
              table {border-top:solid 1px #FFCD12;border-collapse:collapse} 
              table caption {font-size:16px;padding-bottom:20px;font-weight:bold;}
              table th {color:#636363;font-size:13px;background:#FFFFE9;border-top:solid 1px #FFCD12;padding:10px 20px;text-align:left;}
              table td {border-top:solid 1px #FFCD12;padding:5px }
              table td input[type=text] {border:solid 1px #ddd} 
              table td textarea {border:solid 1px #ddd}
              table td input[type=submit] {margin-top:20px;}
              table tr:first-child {border-top:solid 2px #FFCD12;}
</style>
</head>
<body>
	<form action="sessionMakeAction.jsp" method="post">
		<table>
			<caption>session create</caption>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Level</th>
				<td><select name="lev">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="session create"></td>

			</tr>
		</table>
	</form>
</body>
</html>