<%@page import="enrolment.SubjectDTO"%>
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
<title>강의계획서</title>
</head>
<body>
	<%
	int subjectNum = Integer.parseInt(request.getParameter("subjectNum"));

	SubjectDAO sdo = SubjectDAO.getInstance();
	SubjectDTO sto = sdo.getOneSubject(subjectNum);

	String temp = "";
	String major = sto.getMajor();

	switch (major) {
	case "1":
		temp = "컴퓨터공학";
		break;
	case "2":
		temp = "전자공학과";
		break;
	case "3":
		temp = "응용수학과";
		break;
	}
	%>
	<h2>강 의 계 획 서</h2>
	<br>
	<table border="1">
		<tr height="30">
			<td colspan="2" width="30"><b>강의명</b></td>
			<td colspan="2" width="200"><%=sto.getSubjectName()%></td>
		</tr>
		<tr height="30">
			<td colspan="2" width="50"><b>교수명</b></td>
			<td colspan="2" width="200"><%=sto.getProfessorName()%></td>
		</tr>
		<tr height="30">
			<td width="20"><b>학점</b></td>
			<td width="30"><%=sto.getHakjom()%></td>
			<td width="50"><b>강의실</b></td>
			<td width="150"><%=sto.getRoom()%></td>
		</tr>
		<tr height="30">
			<td colspan="1" width="50"><b>전공</b></td>
			<td colspan="3" width="200">
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
		</tr>
		<tr height="30">
			<td width="50"><b>목적</b></td>
			<td colspan="3" width="200"><%=sto.getSubjectPurpos()%></td>
		</tr>
		<tr height="30">
			<td width="50"><b>목표</b></td>
			<td colspan="3" width="200"><%=sto.getSubjectGoal()%></td>
		</tr>
		<tr height="30">
			<td width="50"><b>학년</b></td>
			<td width="200"><%=sto.getGrade()%></td>
			<td width="50"><b>평가방법</b></td>
			<td width="200"><%=sto.getSubjectTest()%></td>
		</tr>
	</table>

</body>
</html>
<%
}
%>