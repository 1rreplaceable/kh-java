<%@page import="com.green.board.BoardDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.green.board.BoardDTO"%>
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
		BoardDTO b = new BoardDTO();
		int lastnum = BoardDAO.getInstance().getBoardlistSize();
		b.setNum(lastnum+1);
		b.setWriter(request.getParameter("name"));
		b.setSubject(request.getParameter("title"));
		b.setEmail(request.getParameter("email"));
		b.setPassword(request.getParameter("password"));
		b.setContent(request.getParameter("message"));
		b.setRef(1);
		b.setReStep(1);
		b.setReLevel(1);
		b.setReadCount(0);
		Date d = new Date();
		
		//System.out.println("현재 날짜:" + d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		b.setRegDate(sdf.format(d));
		
		BoardDAO.getInstance().insertBoard(b);
		BoardDAO c = new BoardDAO();
		
		c.saveData();
		%>
		<script>
		alert("글 작성이 완료되었습니다.");
		window.location.href ="_04boardList.jsp";
	
	</script>
</body>
</html>