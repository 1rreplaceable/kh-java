<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	int onePageArticlesCount = Integer.parseInt(request.getParameter("onePageArticlesCount"));

	session.setAttribute("onePageArticlesCount", onePageArticlesCount);

	response.sendRedirect("_04_01boardList.jsp");
%>
</body>
</html>