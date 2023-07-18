<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.green.board.BoardDTO"%>
<%@page import="java.util.Date"%>
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
	int lastnum = BoardDAO.getInstance().getBoardlistSize() + 1;
	for (int i = lastnum; i < lastnum + 10; i++) {
		BoardDTO b = new BoardDTO();
		b.setNum(i);
		b.setWriter("작성자" + i);
		b.setSubject("제목" + i);
		b.setEmail("email" + i + "@naver.com");
		b.setPassword("1111");
		b.setContent("내용" + i);
		b.setRef(1);
		b.setReStep(1);
		b.setReLevel(1);
		b.setReadCount(0);
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		b.setRegDate(sdf.format(d));

		BoardDAO.getInstance().insertBoard(b);
	}
	BoardDAO b = new BoardDAO();

	b.saveData();
	%>
	<script type="text/javascript">
		window.location.href = "_04_01boardList.jsp";
	</script>
</body>
</html>