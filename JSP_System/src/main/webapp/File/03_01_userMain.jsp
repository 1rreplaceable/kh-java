<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메인페이지</title>
</head>
<body>
	<%
	String log = (String)session.getAttribute("log");
	if(log!=null){
		%>
	<p><%=log%>님 환영합니다.
	</p>
	<p>
		<a href="03_06_logout.jsp">로그아웃</a>
	</p>
	<p>
		<a href="03_07_update.jsp">회원 정보 수정</a>
	</p>
	<p>
		<a href="03_09_delete.jsp">회원 탈퇴</a>
	</p>
	<%
	}else if(log == null){
	%>
	<p><a href="03_02_join.jsp">회원가입</a></p>
	<p><a href="03_04_login.jsp">로그인</a></p>
	<%} %>
</body>
</html>