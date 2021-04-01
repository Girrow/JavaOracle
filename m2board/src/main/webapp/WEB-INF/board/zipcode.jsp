<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css">
<script type="text/javascript">
function setZipcode(zip1,zip2,addr1){
	let f = opener.document.regist;
	f.zipcode.value=zip1+"-"+zip2;
	f.address1.value=addr1;
	self.close();
}
</script>
</head>
<body>
	<form action="">
		<table>
			<caption>Search Address</caption>
			<tr>
				<th colspan="2">Dong : <input type="text" name="area"
					autofocus="autofocus" required="required" style="width: 100px;"
					value="${area}" /> <input type="submit" value="search">
				</th>

			</tr>
			<c:if test="${area != null && list.size() ==0 }">
				<tr>
					<td colspan="2">검색한 [${area}]동을 포함한 주소는 존재하지 않습니다.</td>
				</tr>
			</c:if>
			<c:if test="${list !=null}">
				<c:forEach items="${list}" var="zip">
					<tr>
						<td width="65"><a href="javascript:;" onclick="setZipcode('${zip.zipcode1}','${zip.zipcode2}','${zip.address1}')"> ${zip.zipcode1}-${zip.zipcode2}</a></td>
						<td>${zip.address1}</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</form>

</body>
</html>