<%@page import="java.util.List"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- DAO를 이용해서 결과를 ArrayList로 받아 온 후 html을 만든다 -->
<%	
	String tel = request.getParameter("tel");
	MemberDAO dao = new MemberDAO();
	List<MemberVO> list = dao.all2(tel);
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td{
	width: 100px;
	text-align: center;
}
td{
background: yellow;
}

</style>
</head>
<body>
	<h3 style="color: blue">
		검색결과의 개수는<%=list.size()%>개
	</h3>
	<table border=1>
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>전화번호</td>
		</tr>
	<%
		for (int i = 0; i < list.size(); i++) {
		MemberVO vo = list.get(i);
	%>

		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getPw() %></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getTel() %></td>
		</tr>

	<%-- 검색된 ID <%=vo.getId() %><br>
검색된 PW <%=vo.getPw() %><br>
검색된 name <%=vo.getName() %><br>
검색된 TEL <%=vo.getTel() %><br>
<hr>
<%} %> --%>
	<%-- <% for(int i = 0; i<list.size();i++){ %>
검색된 ID <%=list.get(i).getId() %><br>
검색된 PW <%=list.get(i).getPw() %><br>
검색된 name <%=list.get(i).getName() %><br>
검색된 TEL <%=list.get(i).getTel() %><br>
<hr>--%>
	<%}%>
	</table>
</body>
</html>