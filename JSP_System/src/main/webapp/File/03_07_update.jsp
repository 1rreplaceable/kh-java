<%@page import="_05_User.UserDTO"%>
<%@page import="_05_User.UserDAO"%>
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
		String log = (String)session.getAttribute("log");
		UserDTO user = UserDAO.getInstance().getUserId(log);
	%>
	<h3>ȸ�� ����</h3>
	<%=user.getId() %><br>
	<%=user.getName() %><br>
	<br>


	<form method="post" action="03_08_updatePro.jsp">

		�н�����: <input type="password" name="passwd" maxlength="16"><br>
		<br> ������ �̸�: <input type="text" name="name" maxlength="10"><br>
		<br> <input type="hidden" value=<%=user.getId()%> name="id">
		<input type="submit" value="�Է¿Ϸ�">
	</form>
</body>
</html>