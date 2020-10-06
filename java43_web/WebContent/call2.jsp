<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String result = "보통";
    String point = request.getParameter("point");
   if(Integer.parseInt(point) >= 90){
	   result="최우수";
   }else if(Integer.parseInt(point) >= 80){
	   result="우수";
   }
%><%=result %>