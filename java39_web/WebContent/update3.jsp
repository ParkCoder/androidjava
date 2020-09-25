<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String no = request.getParameter("no");
	BbsDAO dao = new BbsDAO();
	
	BbsVO vo = dao.one(Integer.parseInt(no));
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getNo() %>번 게시물 수정페이지</h3>
<hr color="blue">
<form action="update4.jsp">
<table>
	<tr align="center">
		<td width="100" bgcolor="yellow">번호</td>
		<td width="200" bgcolor="pink"><%=vo.getNo() %>
		<input type="hidden" name="id" value="<%=vo.getNo() %>">
		</td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">작성자</td>
		<td width="200" bgcolor="pink">
		<input type="text" name="pw" value="<%=vo.getWriter() %>">
		</td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">제목</td>
		<td width="200" bgcolor="pink">
		<input type="text" name="name" value="<%=vo.getTitle() %>">
		</td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">내용</td>
		<td width="200" bgcolor="pink">
		<input type="text" name="tel" value="<%=vo.getContent() %>">
		</td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<button type="submit" style=background:red>수정 처리 요청</button>
		</td>
	</tr>
</table>
</form>
<hr color="green">
<a href="index.html">
<button style=background:green>처음페이지로</button></a>
<a href="titleSerch.jsp?title=<%=vo.getTitle() %>">
<button style=background:steelblue>검색</button></a>
<a href="delete2.jsp?no=<%=vo.getNo() %>">
<button style=background:lime>삭제</button></a>
</body>
</html>