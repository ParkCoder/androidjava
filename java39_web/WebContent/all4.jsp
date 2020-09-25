<%@page import="bean.BbsVO"%>
<%@page import="java.util.List"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    BbsDAO dao = new BbsDAO();
    List<BbsVO> list = dao.all();
    
    
    %>
    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<style type="text/css">
table{
border-collapse: collapse;

}
td{
width:150px;
text-align: center;
}
.t{
background: lightgray;
font-weight: bold;
}


</style>

</head>
<body>
<h2 style=color:blue>게시판 목록 개수는 <%=list.size() %> 개</h2>
<hr>
<table border="1">

	<tr>
		<td class="t">번호</td>
		<td class="t">게시자</td>
		<td class="t">제목</td>
		<td class="t">내용</td>
	</tr>
	<%
	for(int i = 0; i < list.size(); i++){
		BbsVO vo = list.get(i);
	%>
	<tr>
		<td><%=vo.getNo() %></td>
		<td><%=vo.getWriter() %></td>
		<td><%=vo.getTitle() %></td>
		<td><%=vo.getContent() %></td>
	</tr>


<%} %>
</table>



</body>
</html>