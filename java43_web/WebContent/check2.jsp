<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    String check = "<font color=blue>id 사용가능</font>";
    int result = dao.read(id);
    
    if(result==1){
    	check = "<font color=red>id 중복, 사용불가능</font>";
    }
    %><%=check%>