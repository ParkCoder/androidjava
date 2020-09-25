<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    1. 클라이언트가 입력해서 제출한 데이터를 받아와야한다.
    2. DB연동해서 처리한 후 결과를 받아와야한다.
    3. 받아온 결과에 따라 화면을 html로 만들어서 클라이언트에 전송한다.
    -->
    
    <!-- <& &>:자바 코드를 집어 넣겠다!! -->
    <% //스트립트릿(scriptlete)
    //HttpServletRequest request = new HttpServletRequest();
    //내장된 객체
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    //String name = request.getParameter("name");
    //String tel = request.getParameter("tel");
    //자동import: 해당 클래스 클릭, ctrl + shift + m
    MemberDAO dao = new MemberDAO();
    boolean result = dao.read(id, pw);
    String check = "로그인 실패";
    if(result){
    	check="로그인 성공";
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>입력 정보 결과! <%= check %>입니다.</h3>
<hr color = "steelblue">
아이디: <%= id %> <br> <!-- expression: 표현식 -->
패스워드: <%= pw %> <br>

<hr color="navy">
<a href="login.html">로그인 페이지로 이동</a>

</body>
</html>