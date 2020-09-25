<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- DAO를 이용해서 결과를 ArrayList로 받아 온 후 html을 만든다 -->
<%	
	String content = request.getParameter("content");
	BbsDAO dao = new BbsDAO();
	List<BbsVO> list = dao.conall(content);
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
border-collapse: collapse;

}
td{
	width: 100px;
	text-align: center;
}
.t{
background: pink;
}

</style>
</head>
<body>
	<h3 style="color: blue">
		내용 검색결과 <%=list.size()%>개
	</h3>
	<table border=1>
		<tr>
			<td class="t">번호</td>
			<td class="t">작성자</td>
			<td class="t">제목</td>
			<td class="t">내용</td>
		</tr>
	<%
		for (int i = 0; i < list.size(); i++) {
		BbsVO vo = list.get(i);
	%>

		<tr>
			<td><%=vo.getNo() %></td>
			<td><%=vo.getWriter() %></td>
			<td><%=vo.getTitle() %></td>
			<td><%=vo.getContent() %></td>
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