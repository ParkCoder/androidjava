<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
String id = request.getParameter("id");
int idlength = id.length();
String result = "<font color=blue>아이디 길이는 </font>"+ idlength +"<font color=blue>글자입니다</font>";
%><%=result %>