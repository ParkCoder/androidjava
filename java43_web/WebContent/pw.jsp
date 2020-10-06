<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
String pw = request.getParameter("pw");
String pw1 = request.getParameter("pw1");
String result = "<font color=red>비밀번호 불일치 다시 입력해주세요!!</font>";
if(pw.equals(pw1)){
	result = "<font color=green>비밀번호가 일치합니다!!</font>";
}
%><%=result %>