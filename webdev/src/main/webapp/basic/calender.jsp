<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	//서비스 메소드 밖에 위치하는 자바코드
	public String dateFormat(int year, int month, int date){
		return year+"년 "+month+"월 "+date+"일";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	//서비스 메소드 안에 위치하는 자바코드
	Calendar cal = Calendar.getInstance();	//인스턴스를 얻어온 그 시점의 연,월,일로 셋팅
	//out.println("<h1>"+cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"일 "+cal.get(Calendar.DATE)+"일"+"</h1>");
%>
<!-- expression(표현식) -->
<h1><%=dateFormat(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE)) %></h1>
</body>
</html>