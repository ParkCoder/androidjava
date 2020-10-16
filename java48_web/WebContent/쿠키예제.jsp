<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie e1 = new Cookie("과목","스프링");
response.addCookie(e1);
Cookie e2 = new Cookie("장소","709호");
response.addCookie(e2);
Cookie e3 = new Cookie("인원","100명");
response.addCookie(e3);


%>
<h1>브라우저 쿠키 심기 완료</h1>
</body>
</html>