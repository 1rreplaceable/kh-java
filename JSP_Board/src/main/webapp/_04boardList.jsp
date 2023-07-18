<%@page import="com.green.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<style type="text/css">
table {
	margin-bottom: 20px;
}
</style>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<div align="center">
	<h3>
		게시글 목록(<%=BoardDAO.getInstance().getBoardlistSize()%>개)
	</h3>

	<table border="1">
		<form action = "_04_01boardList.jsp" method=post>
		<tr>
			<td colspan="5">한 페이지에 보여줄 게시글 수 <select name="selectnum">
			<option value="five">5개씩</option>
			<option value="ten">10개씩</option>
			<option value="fifteen">15개씩</option>
			</select> 
			<input type="submit" value="수정하기">
			</td>
		</tr>
		</form>
		<tr>
			<td colspan="5"><a href="_01index.jsp">메인으로</a></td>
		</tr>
		<tr>
			<td colspan="5"><a href="_10addDummy.jsp">dummy10개 추가하기</a></td>
		</tr>
		<tr>
			<td colspan="5"><a href="_11removeAll.jsp">전체 게시글 삭제</a></td>
		</tr>
		<tr>
			<td colspan="5"><a href="_02boardWrite.jsp">글쓰기</a></td>
		</tr>
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%
		for (int i = 0; i < BoardDAO.getInstance().getBoardlistSize(); i++) {
			int num = BoardDAO.getInstance().getBoardList().get(i).getNum();
			String writer = BoardDAO.getInstance().getBoardList().get(i).getWriter();
			String subject = BoardDAO.getInstance().getBoardList().get(i).getSubject();
			String date = BoardDAO.getInstance().getBoardList().get(i).getRegDate();
			int readCount = BoardDAO.getInstance().getBoardList().get(i).getReadCount();
			out.println("<tr>");
			out.println("<td>");
			out.println(num);
			out.println("</td>");
			out.println("<td>");
			out.println(writer);
			out.println("</td>");
			out.println("<form action='_05boardInfo.jsp?num=" + num + "' method='post'><td><a href='_05boardInfo.jsp?num=" + num
			+ "'>");
			out.println(subject);
			out.println("</a></td></form>");
			out.println("<td>");
			out.println(date);
			out.println("</td>");
			out.println("<td>");
			out.println(readCount);
			out.println("</td>");
			out.println("</tr>");
		}
		%>

	</table>
	</div>
</body>
</html>