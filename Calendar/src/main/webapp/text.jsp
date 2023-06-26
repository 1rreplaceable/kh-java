<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>텍스트</title>
</head>
<body>
	<%
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	%>
	<form action="calendar.jsp">
		<div>새로운 이벤트</div>
		<hr>
		<label>내용</label>
		<div class="textarea">
			<textarea rows="15" cols="100"></textarea>	</div>
		<hr>
		<div>
			기간 
			<select class="select" name=start_date>
				<%
				for (int i = 1; i <= 31; i++) {
					if (i == calendar.get(Calendar.DATE)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select>
			
			<select class="select" name="start_month">
				<%
				for (int i = 1; i <= 12; i++) {
					if (i == calendar.get(Calendar.MONTH)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select> <select class="select" name="start_year">
				<%
				for (int i = 1900; i <= 2100; i++) {
					if (i == calendar.get(Calendar.YEAR)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select>
			<span>-</span>
			<select class="select" name=end_date>
				<%
				for (int i = 1; i <= 31; i++) {
					if (i == calendar.get(Calendar.DATE)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select>
			
			<select class="select" name="end_month">
				<%
				for (int i = 1; i <= 12; i++) {
					if (i == calendar.get(Calendar.MONTH)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select> <select class="select" name="end_year">
				<%
				for (int i = 1900; i <= 2100; i++) {
					if (i == calendar.get(Calendar.YEAR)) {
						out.println("<option selected= 'selected'>" + i + "</option>");
					} else {
						out.println("<option>" + i + "</option>");
					}
				}
				%>
			</select>
		</div>
		<hr>
		
		<div>
		<input type="submit" value="저장">
		<input type="button" value="취소">
		<input type="button" value="삭제">
		
		</div>
	</form>



</body>
</html>