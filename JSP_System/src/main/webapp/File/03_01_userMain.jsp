<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����������</title>
</head>
<body>
	<%
	String log = (String)session.getAttribute("log");
	if(log!=null){
		%>
	<p><%=log%>�� ȯ���մϴ�.
	</p>
	<p>
		<a href="03_06_logout.jsp">�α׾ƿ�</a>
	</p>
	<p>
		<a href="03_07_update.jsp">ȸ�� ���� ����</a>
	</p>
	<p>
		<a href="03_09_delete.jsp">ȸ�� Ż��</a>
	</p>
	<%
	}else if(log == null){
	%>
	<p><a href="03_02_join.jsp">ȸ������</a></p>
	<p><a href="03_04_login.jsp">�α���</a></p>
	<%} %>
</body>
</html>