<%@page import="_05_User.UserDTO"%>
<%@page import="_05_User.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ó�� ������</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>

	<%=request.getParameter("id")%>

	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
	String name = request.getParameter("name");

	// id pw �Է¹޾Ƽ� ȸ������ ��� ������ ������ ������ ����

	boolean check = UserDAO.getInstance().checkUserIdPw(id, pw);
	if (check) {
		UserDTO user = UserDAO.getInstance().getUserId(id);
		user.setId(id);
		user.setPw(pw);
		user.setName(name);

		// ������ �����͸� DAO���� �Ѱ��༭ ���� ������ ����
		// ����Ʈ, �޸��� ���Ͽ� ����
		UserDAO.getInstance().updateUser(user);
	%>
	<script>
		alert("������ �����Ǿ����ϴ�.");
		location.href = "03_01_userMain.jsp";
	</script>
	<%
	} else {
	%>
	<script>
		alert("���̵�� ��й�ȣ�� Ȯ�����ּ���");
		location.href = "03_01_userMain.jsp";
	</script>
	<%
	}
	%>
</body>
</html>