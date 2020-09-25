<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    <jsp:useBean id="vo" class="bean.BbsVO"></jsp:useBean>
    <jsp:setProperty property="*" name="vo"/>
     -->
    
    
    
    <%
    BbsVO vo = new BbsVO();
    
    String no = request.getParameter("no");
    String writer = request.getParameter("writer");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    
    vo.setNo(Integer.parseInt(no));
    vo.setWriter(writer);
    vo.setTitle(title);
    vo.setContent(content);
    
    BbsDAO dao = new BbsDAO();
    
    dao.create(vo);
    

     
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>작성글보기</title>
</head>
<body>
<h2>글작성 </h2>
<hr color="blue">
글번호: <%=no %><br>
작성자: <%=writer %><br>
제목: <%=title %><br>
내용: <%= content %><br>

</body>
</html>