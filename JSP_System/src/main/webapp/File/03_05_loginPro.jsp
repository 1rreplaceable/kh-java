<%@page import="_05_User.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ó��</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	// ���̵�� �н����带 Ȯ���ϴ� �޼���
	boolean check = UserDAO.getInstance().checkUserIdPw(id, pw);

	if (check) {
		// ȸ�������� ������ ���� ��쿡�� ������ ������ش�.
		session.setAttribute("log", id);
		// ������ ��ȿ�ð� �������� 1�� �� �ڵ� ������ �����ǵ��� ����
		session.setMaxInactiveInterval(1 * 60); // 1��
	%>
	<script>
		alert("�α��� �Ǿ����ϴ�.")
		location.href = "03_01_userMain.jsp"
	</script>
	<%
	} else {
	%>
	<script>
		alert("���̵� �н����� Ȯ��.")
		location.href = "03_04_login.jsp"
	</script>
	<%
	}
	%>


</body>
</html>