<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ϸ�: requestTest.jsp</title>
</head>
<body>
	requestTest.jsp�Դϴ�.
	<br>
	<%
	// �Ϲݺ����� �������� �ʾ����Ƿ� ������ �߻��Ѵ�.
	// out.println("�Ϲݺ���" + var + "<br>"); ��������

	out.println("pageContext ���� ����: " + pageContext.getAttribute("pageContextVar") + "<br/>");
	out.println("request ���� ����: " + request.getAttribute("requestVar") + "<br/>");
	out.println("session ���� ����: " + session.getAttribute("sessionVar") + "<br/>");
	out.println("application ���� ����: " + application.getAttribute("applicationVar") + "<br/>");
	%>
	<!--requestTest.jsp ������ pageContext ���� ����(println() �޼ҵ�): -->
	<% out.println(pageContext.getAttribute("pageContextVar") + "<br/>");%>
	<!-- requestTest.jsp ������ pageContext ���� ����(jsp ǥ����):  --><%=pageContext.getAttribute("pageContextVar")%><br/>
	requestTest.jsp ������ pageContext ���� ����(EL): ${pageContextScope.pageContextVar}<br/>
	requestTest.jsp ������ pageContext ���� ����(EL): ${pageContextVar}<br/>
	
	<!-- 
		���������� ����� �����͸� ��� �� �� ���� ��ü �̸��� ������� �ʰ� ���� ���� �̸��� ����ϸ�
		EL�� pageContext -> request -> session -> application ���� ������� �˻��ؼ� �������� ����
		�� ������ ��� ���� ���´�.
	 -->
</body>
</html>