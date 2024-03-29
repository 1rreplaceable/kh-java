<%@page import="enrolment.SubjectDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="enrolment.SubjectDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String hakbun = (String) session.getAttribute("hakbun");

if (hakbun == null) {
	response.sendRedirect("00_login.jsp");
} else {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String major = request.getParameter("major");
	String grade = request.getParameter("grade");

	SubjectDAO sdo = SubjectDAO.getInstance();
	ArrayList<SubjectDTO> s = sdo.getGradeMajorSubject(major, grade);
	%>

	<div align="right" style="border: 1px solid">
		<form action="01_Main.jsp?center=09_enrolmentSelect.jsp" method="post">
			전공 : <select name="major">
				<option value="1" <%if (major.equals("1")) {%> selected <%}%>>컴퓨터공학</option>
				<option value="2" <%if (major.equals("2")) {%> selected <%}%>>전자공학</option>
				<option value="3" <%if (major.equals("3")) {%> selected <%}%>>응용수학</option>
				<option value="4" <%if (major.equals("4")) {%> selected <%}%>>교양</option>
			</select>&nbsp; 학년 : <select name="grade">
				<option value="1" <%if (grade.equals("1")) {%> selected <%}%>>1학년</option>
				<option value="2" <%if (grade.equals("2")) {%> selected <%}%>>2학년</option>
				<option value="3" <%if (grade.equals("3")) {%> selected <%}%>>3학년</option>
				<option value="4" <%if (grade.equals("4")) {%> selected <%}%>>4학년</option>
				<option value="0" <%if (grade.equals("0")) {%> selected <%}%>>0학년</option>
			</select>&nbsp; <input type="submit" value="조회">
		</form>
	</div>

	<table border="1">
		<tr>
			<td align="center" width="200">강의명</td>
			<td align="center" width="100">교수명</td>
			<td align="center" width="50">학점</td>
			<td align="center" width="150">전공</td>
			<td align="center" width="100">학년</td>
			<td align="center" width="100">수강가능 인원</td>
			<td align="center" width="150">수강신청</td>
		</tr>
		<%
		for (int i = 0; i < s.size(); i++) {
			SubjectDTO sto = s.get(i);
		%>
		<tr>
			<td align="center"><%=sto.getSubjectName()%></td>
			<td align="center"><%=sto.getProfessorName()%></td>
			<td align="center"><%=sto.getHakjom()%></td>
			<td align="center">
				<%
				if (sto.getMajor().equals("1")) {
				%> 컴퓨터공학 <%
				} else if (sto.getMajor().equals("2")) {
				%> 전자공학 <%
				} else if (sto.getMajor().equals("3")) {
				%> 응용수학 <%
				} else if (sto.getMajor().equals("4")) {
				%> 교양 <%
				}
				%>
			</td>
			<td align="center"><%=sto.getGrade()%>학년</td>
			<td align="center"><%=sto.getStudentCount()%>명</td>
			<td align="center">
				<%
				if (sto.getStudentCount() == 0) {
				%><font size=3 color="red">수강신청 불가</font> <%
 } else {
 %> <input type="button" value="수강신청"
				onclick="location.href='09_enrolmentAddPro.jsp?subjectNum=<%=sto.getSubjectNum()%>'">
				<%
				}
				%>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
<%
}
%>