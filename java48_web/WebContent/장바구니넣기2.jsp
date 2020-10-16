<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>장바구니에 넣기</h3>
	
<form action="add2.jsp">
	<hr color="red">
	<select name="product">
		<option value="watch">시계</option>
		<option value="ballpen">볼펜</option>
		<option value="notebook">노트북</option>
	</select>
	
	<select name="price">
		<option value="10000">10000원</option>
		<option value="20000">20000원</option>
		<option value="30000">30000원</option>
	</select>
	<button type="submit">장바구에 넣기</button>
</form>	
	
</body>
</html>