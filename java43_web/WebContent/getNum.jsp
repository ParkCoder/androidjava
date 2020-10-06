<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
    String tel = request.getParameter("tel");
	String check1 = ""; //랜덤값생성
	String check2 = "11"; //010 > 11 | 011 > 22
	
   	for(int i =0; i < 4;i++){
	   	check1 = check1 + (int)(Math.random()*10000)%10;
   	}
   	if(tel.substring(0,3).equals("010")){
   		check2 = check2 + check1;
   	}else{
   		check2 = "22" + check1;
   	} %><%=check2%>