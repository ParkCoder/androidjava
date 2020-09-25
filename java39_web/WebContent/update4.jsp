<%@page import="bean.BbsDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 1. 넘어 오는 4개의 값을 받아 vo에 넣는다 
    액션태그
    useBean액션태그: new를 가지고 객체생성, import역할 -->
    <jsp:useBean id="vo" class = "bean.BbsVO"></jsp:useBean>
    
    <!-- setProperty액션태그: 클라이언트가 전송한 파라메터를 받아오고,
    		vo의 set() 메서드를 호출해줌 -->
    <jsp:setProperty property="*" name="vo"/>
    
    
    
    <!-- 2. dao를 이용해 update 시킨다 -->   
 <%   BbsDAO dao = new BbsDAO();
    boolean result = dao.update1(vo);
    
    String check ="수정실패";
    if(result==true){
    	check="수정완료";
    }
    %>
    
    <!-- 3. 결과를 html로 만들어서 전송 -->
 
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=check %></h3>

<a href = "index.html">
<button type="submit">처음 페이지로
</button>
</a>
</body>
</html>