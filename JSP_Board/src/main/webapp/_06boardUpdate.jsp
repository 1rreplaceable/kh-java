<%@page import="com.green.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정하기</title>
<style type="text/css">
.td_title {
	width: 50px;
}

.text {
	border: none;
}


</style>
</head>
<body>
	<h3>게시글 수정하기</h3>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<%
	int n = Integer.parseInt(request.getParameter("num"));
	int num = 0;
	int before = 0;
	int readCount = 0;
	String writer = "";
	String subject = "";
	String date = "";
	String email = "";
	String message = "";
	for (int i = 0; i < BoardDAO.getInstance().getBoardlistSize(); i++) {
		if (BoardDAO.getInstance().getBoardList().get(i).getNum() == n) {
			before = BoardDAO.getInstance().getBoardList().get(i).getReadCount();
			BoardDAO.getInstance().getBoardList().get(i).setReadCount(before + 1);
			readCount = BoardDAO.getInstance().getBoardList().get(i).getReadCount();
			num = BoardDAO.getInstance().getBoardList().get(i).getNum();
			writer = BoardDAO.getInstance().getBoardList().get(i).getWriter();
			subject = BoardDAO.getInstance().getBoardList().get(i).getSubject();
			date = BoardDAO.getInstance().getBoardList().get(i).getRegDate();
			email = BoardDAO.getInstance().getBoardList().get(i).getEmail();
			message = BoardDAO.getInstance().getBoardList().get(i).getContent();
		}
	}
	%>
	<form action="_07boardUpdatePro.jsp" method="post">
		<table border="1">
			<tr>
				<td class="td_title">번호</td>
				<td><%=n%><input type="hidden" name="pagenum" value="<%=n%>">
				</td>
				<td class="td_title">조회수</td>
				<td><%=readCount%></td>
			</tr>
			<tr>
				<td class="td_title">작성자</td>
				<td><%=writer%></td>
				<td class="td_title">이메일</td>
				<td><%=email%></td>
			</tr>
			<tr>
				<td class="td_title">제목</td>
				<td><input class="text" type="text" name="subject"
					value="<%=subject%>"></td>
				<td class="td_title">작성일</td>
				<td><%=date%></td>
			</tr>
			<tr>
				<td class="td_title">내용</td>
				<td colspan="3"><textarea rows="10" cols="40" name="content"><%=message%></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="수정하기"></td>
				<td><input type="button" value="다시 작성"></td>
				<td><input type="button" value="목록으로"
					onclick="window.location.href='_04boardList.jsp'"></td>
			</tr>


		</table>
	</form>
</body>
</html>