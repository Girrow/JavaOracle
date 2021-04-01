<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript">
var user_id_count = 0;
var user_id = '';
//-1 error 0 available 1 cannot use

	function openZipcode(){
		let xPos = (document.body.offsetWidth/2) - (500/2); // 가운데 정렬
		xPos += window.screenLeft; // 듀얼 모니터일 때
		let yPos = (document.body.offsetHeight/2) + (100/2);
// 		window.open('Login.do','zipcode','width=400,height=400');
		window.open('Zipcode.do', 'zipcode', "width=400, height=400, left="+xPos+", top="+yPos+", menubar=yes, status=yes, titlebar=yes, resizable=yes");
	};

	
	function validate(){
		let f = document.regist;

		if(f.user_id.value.length < 3 || f.user_id.value.length>12){
			alert('아이디는 3~12글자로 입력하세요')
			f.user_id.focus();
			return;
		}
		if(f.user_name.value.length < 2 || f.user_name.value.length>6){
			alert('이름은 2~6글자로 입력하세요')
			f.user_name.focus();
			return;
		}
		if(f.user_pw.value.length < 4 || f.user_pw.value.length>20){
			alert('비밀번호는은 4~20글자로 입력하세요')
			f.user_pw.focus();
			return;
		}
		if(f.user_pw.value != f.user_pw2.value){
			alert('비밀번호 일치 요망')
			f.user_pw.focus();
			return;
		}
		if(f.user_birth.value == ''){
			alert('생년월일을 입력하세요.');
			f.user_birth.focus();
			return;
		}
		if(f.user_phone.value == ''){
			alert('연락처를 입력하세요.');
			f.user_phone.focus();
			return;
		}
		if(f.zipcode.value == ''){
			alert('우편번호를 입력하세요.');
			f.zipcode.focus();
			return;
		}
		if(f.zipcode.value == ''){
			alert('우편번호를 입력하세요.');
			f.zipcode.focus();
			return;
		}
		if(f.address1.value == ''){
			alert('주소를 입력하세요.');
			f.address1.focus();
			return;
		}
		if(f.address2.value == ''){
			alert('상세주소를 입력하세요.');
			f.address2.focus();
			return;
		}
		if(user_id_count!=0){
			alert('Access Deny ID');
			f.user_id.focus();
			return;
		}
		
		console.log(f.address1.value)
		console.log(f.address2.value)
		console.log("==============")
		console.log(f);
		f.method = 'POST';
		f.action = 'MemberRegisterAction.do';
		f.submit();
	}
	
	function change_user_id(){
		let f = document.regist;
		user_id = f.user_id.value;
		
		if(user_id.length < 3 || user_id.length>12){
			document.getElementById('check_id_result').innerHTML="영문자+숫자 3~12문자로 작성하세요";
			f.user_id.focus();
			return;
		}
		
		new Request('CheckID.do','user_id='+user_id,callback,'POST');
	}
	
	function callback(xhr){
		if(xhr.readyState == 4){
			if(xhr.status == 200){
				user_id_count = parseInt(xhr.responseText);
// 				alert(user_id_count);
				if(user_id_count==1){
					document.getElementById('check_id_result').innerHTML="<font color='red'>불가능</font>";
					return;
				}else if(user_id_count==0){
					document.getElementById('check_id_result').innerHTML="<font color='blue'>가능</font>";
					return;
				}else{
					alert('System Error');
				}
				
				
			}else{
			}
		}
	}
</script>
</head>
<body>
	<form name="regist" method="post">
		<table border="1">
			<caption>회원 가입</caption>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="user_id" id="user_id"
					onkeyup="change_user_id()" />
					<div id="check_id_result">영문자+숫자 3~12문자로 작성하세요</div></td>
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
				<td><input type="text" name="zipcode" readonly="readonly"
					onclick="alert('검색버튼을 이용하여 입력하세요');" style="width: 55px;" /> <input
					type="button" value="검색" name="btnZipcode" onclick="openZipcode()" />
				</td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address1" style="width: 250px;" /><br />
				</td>
			</tr>
			<tr>
				<th>상세 주소</th>
				<td><input type="text" name="address2" /><br /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="완료" 
					onclick="validate()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>