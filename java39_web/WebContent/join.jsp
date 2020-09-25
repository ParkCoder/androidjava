<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    <% 
 	//1.VO를 만들기
 	MemberVO vo = new MemberVO();
    //2. 전달되는 값 받은 다음, VO에 넣기
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    vo.setId(id);
    vo.setPw(pw);
    vo.setName(name);
    vo.setTel(tel);
    
    //3.DAO를 이용해서 insert 처리함
    MemberDAO dao = new MemberDAO();
    boolean result = dao.create(vo);
    //4. 처리결과를 client에 알려주어야함
    String check = "가입실패!";
    if(result){
    	check = "가입성공!!";
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 입력 정보(<%= check %>)</h3>
<hr color = "steelblue">
아이디: <%= id %> <br> <!-- expression: 표현식 -->
패스워드: <%= pw %> <br>
이름: <%= name %> <br>
전화번호: <%= tel %> <br>
<hr color="navy">
<a href="login.html">로그인 페이지로 이동</a>

</body>
</html>