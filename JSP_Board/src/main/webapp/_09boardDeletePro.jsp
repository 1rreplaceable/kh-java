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
	int n = Integer.parseInt(request.getParameter("pagenum"));
	String password = request.getParameter("password");

	for (int i = 0; i < BoardDAO.getInstance().getBoardlistSize(); i++) {
		if (BoardDAO.getInstance().getBoardList().get(i).getNum() == n) {
			String orgPW = BoardDAO.getInstance().getBoardList().get(i).getPassword();
			if (orgPW.equals(password)) {
		BoardDAO.getInstance().getBoardList().remove(i);
			} else {
	%>
	<script type="text/javascript">
		alert("비밀번호를 다시 확인하세요.");
		window.location.href = history.go(-1);
	</script>
	<%
	}
	}
	}
	BoardDAO b = new BoardDAO();

	b.saveData();
	%>

	<script type="text/javascript">
		alert("글 삭제가 완료되었습니다.");
		window.location.href = "_04_01boardList.jsp";
	</script>
</body>
</html>