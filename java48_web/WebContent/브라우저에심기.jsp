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
	Cookie c1 = new Cookie("sub","스프링");
	response.addCookie(c1);
	Cookie c2 = new Cookie("place","709호");
	response.addCookie(c2);
	Cookie c3 = new Cookie("pp","100명");
	response.addCookie(c3);
%>

<h1>브라우저 쿠키 심기 완료</h1>
<a href="브라우저에서쿠키가져오기.jsp">확인</a>
</body>
</html>