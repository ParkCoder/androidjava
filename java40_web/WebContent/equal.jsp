<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
  
   boolean result = dao.read12(id);
    
    String check ="사용가능";
    if(result==true){
    	 check ="사용불가";
    	 }
    
  	
    
  
   
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>아이디 중복 확인 결과! <%= check %></h1>
</body>
</html>