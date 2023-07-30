<%@page import="enrolment.MySubjectDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="enrolment.SubjectDAO"%>
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
	MySubjectDTO mto = new MySubjectDTO();

	String hakbun = (String) session.getAttribute("hakbun");
	int subjectNum = Integer.parseInt(request.getParameter("subjectNum"));

	SubjectDAO sdo = SubjectDAO.getInstance();

	int check = sdo.subjectCheck(hakbun, subjectNum);

	if (check != 1) {
		sdo.enrollSubject(subjectNum); // update subjectnum (-1)
		mto = sdo.insertArraySubject(hakbun, subjectNum); // MySubjectDTO에 넣기
		sdo.insertSQL(mto); //MySubjectDTO mto 값을 sql에 저장
	%>
	<script type="text/javascript">
		alert("수강신청이 완료되었습니다.");
		location.href = "01_Main.jsp?center=09_enrolmentAdd.jsp";
	</script>
	<%
	} else {
	%>
	<script type="text/javascript">
		alert("중복수강을 할 수 없습니다.");
		location.href = "01_Main.jsp?center=09_enrolmentAdd.jsp";
	</script>
	<%
	}
	%>





</body>
</html>