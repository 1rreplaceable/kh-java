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
	int size = BoardDAO.getInstance().getBoardlistSize();
	for (int i = 0; i < size; i++) {
		BoardDAO.getInstance().getBoardList().remove(0);
	}
	BoardDAO b = new BoardDAO();

	b.saveData();
	%>
	<script type="text/javascript">
		window.location.href = "_04boardList.jsp";
	</script>
</body>
</html>