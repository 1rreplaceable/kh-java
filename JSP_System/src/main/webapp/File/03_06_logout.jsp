<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α׾ƿ�</title>
</head>
<body>
	<%
	// Ư�� ������ �����ؼ� �����ϱ�
	session.removeAttribute("log");
	
	// ��� ���� �����
	session.invalidate();
	%>
	<script>
		alert("�α׾ƿ� �Ǽ̽��ϴ�.")
		location.href="03_01_userMain.jsp";
	</script>
	
</body>
</html>