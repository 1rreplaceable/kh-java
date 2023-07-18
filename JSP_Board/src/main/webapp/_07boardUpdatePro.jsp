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
	String content = request.getParameter("content");
	String subject = request.getParameter("subject");
	int num = Integer.parseInt(request.getParameter("pagenum"));
	for (int i = 0; i < BoardDAO.getInstance().getBoardlistSize(); i++) {
		if (BoardDAO.getInstance().getBoardList().get(i).getNum() == num) {
			BoardDAO.getInstance().getBoardList().get(i).setContent(content);
			BoardDAO.getInstance().getBoardList().get(i).setSubject(subject);
		}
	}
	BoardDAO b = new BoardDAO();
	
	b.saveData();
	%>
	<script type="text/javascript">
		alert("글 수정이 완료되었습니다.");
		window.location.href = "_04_01boardList.jsp";
	</script>
</body>
</html>