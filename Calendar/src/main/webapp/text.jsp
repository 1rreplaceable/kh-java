<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ؽ�Ʈ</title>
</head>
<body>
	<%
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	%>
	<form action="calendar.jsp">
		<div>���ο� �̺�Ʈ</div>
		<hr>
		<label>����</label>
		<div class="textarea">
			<textarea rows="15" cols="100"></textarea>	</div>
		<hr>
		<div>
			�Ⱓ 
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
		<input type="submit" value="����">
		<input type="button" value="���">
		<input type="button" value="����">
		
		</div>
	</form>



</body>
</html>