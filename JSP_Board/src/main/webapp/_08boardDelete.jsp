<%@page import="com.green.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	%>
	<%
	int n = Integer.parseInt(request.getParameter("num"));
	%>
<h3>게시글 삭제하기</h3>
<form action="_09boardDeletePro.jsp" method="post">
	<table border="1">
	
	<tr>
	<td>
		비밀번호 입력
	</td>
	<td>
		<input type="password" name="password">
	</td>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="확인">
		<input type="hidden" name="pagenum" value="<%=n%>">
	</td>
	</tr>
	</table>
</form>
</body>
</html>