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

	<!-- 
		1. �ѱ۱���
		2. id, pass ��������
		3. üũ�� �̿��ؼ� userlist�� 2������ ������ �������� �̿��ؼ� �����ִ��� Ȯ��
		4. ������ �ִ�, deleteUserId(id);
		   ���ǵ� ������ �� log
		   alert() Ż��Ǿ���. userMain ������ �̵�
		   
		5. ���̵� �Ǵ� ��й�ȣ Ȯ�� �޽����� ����ϰ�
		// �ٷ� ���� �������� �̵��ϴ� �޼���
		history.go(-1);
		
		deleteUserId(id); ����� ����Ʈ���� ����, �޸��忡���� ����
		�ٽ� �����ϴ� � �޼��带 ȣ�� (saveData())
	 -->

	<%
	request.setCharacterEncoding("utf-8");
	%>

	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
	String name = request.getParameter("name");

	boolean check = UserDAO.getInstance().checkUserIdPw(id, pw);
	if (check) {
		UserDAO.getInstance().deleteUserId(id);

		// Ư�� ������ �����ؼ� �����ϱ�
		session.removeAttribute("log");

		// ��� ���� �����
		session.invalidate();
	%>
	<script>
		alert("ȸ�� Ż��");
		location.href = "03_01_userMain.jsp";
	</script>
	<%
	} else {
	%>
	<script>
		alert("���̵�� ��й�ȣ�� Ȯ�����ּ���");
		history.go(-1);
	</script>
	<%
	}
	%>


</body>
</html>