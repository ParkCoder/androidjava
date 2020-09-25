<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
    boolean result = dao.delete1(id);
    String check = "탈퇴처리 되지않음";
    if(result){
    	check="탈퇴처리완료!";
    }
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>탈퇴결과</h3>
<hr color="blue">
<span style="color:red">
<%=check %>
</span><br>
<a href="index.html">
<button style=background:sand>처음페이지로</button>
</a>
</body>
</html>