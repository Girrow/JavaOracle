<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript">
	function openZipcode(){
		let xPos = (document.body.offsetWidth/2) - (500/2); // 가운데 정렬
		xPos += window.screenLeft; // 듀얼 모니터일 때
		let yPos = (document.body.offsetHeight/2) + (100/2);
// 		window.open('Login.do','zipcode','width=400,height=400');
		window.open('Zipcode.do', 'zipcode', "width=400, height=400, left="+xPos+", top="+yPos+", menubar=yes, status=yes, titlebar=yes, resizable=yes");
	};

	
	function validate(){
		
	}
</script>
</head>
<body>
<form name="regist" method="post">
<table border="1">
	<caption>회원 가입</caption>
<tr>
	<th>아이디</th>
	<td><input type="text" name="user_id" id="user_id" onkeyup="change_user_id()"/>
		<div id="check_id_result"><br/></div>
	</td>
</tr>
<tr>
	<th>이름</th>
	<td><input type="text" name="user_name" id="user_name" /></td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="user_pw" id="user_pw" /></td> 
</tr>
<tr>
	<th>비밀번호 확인</th>
	<td><input type="password" name="user_pw2" id="user_pw2" /></td>
</tr>
<tr>
	<th>생일</th>
	<td><input type="date" name="user_birth" id="user_birth" /></td>
</tr>
<tr>
	<th>전화</th>
	<td><input type="text" name="user_phone" id="user_phone" /></td>
</tr>
<tr>
	<th>우편번호</th>
	<td>
		<input type="text" name="zipcode" readonly="readonly"
		onclick="alert('검색버튼을 이용하여 입력하세요');" 
		style="width:55px;"/>
		<input type="button" value="검색" name="btnZipcode"
		onclick="openZipcode()"
		/>
	</td>
</tr>
<tr>
	<th>주소</th>
	<td>
		<input type="text" name="address1" style="width:250px;"/><br/>
	</td>
</tr>
<tr>
	<th>상세 주소</th>
	<td>
		<input type="text" name="address2" /><br/>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="완료" onclick="validate()" />
	</td>
</tr>
</table>
</form>
</body>
</html>