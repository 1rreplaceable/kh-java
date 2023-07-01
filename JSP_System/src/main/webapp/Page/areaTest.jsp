<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String var = "�Ϲ� ����";
	out.println("�Ϲ� ����: " + var + "<br/>");
	
//	�ý��� ���� ���� ����ϱ�
//	�����̸�.setAttribute("���� ���� �̸�", ���� ������ ������ ������);
//	���� ������ ����Ǵ� ��� ������ ���� ���� �̸��� key�� �ϰ� ���� ������ ����Ǵ� �����͸� value�� ��
//	Map<String, Object> ������ ������ value�� �ڷ����� Object�� ������ �����ڰ� � Ÿ���� �����͸�
//	���� ������ �������� �𸣱� �����̴�.
	pageContext.setAttribute("pageContextVar", "areaTest.jsp�� pageContext ���� ����");

//	���� ������ ����� �����ʹ� �����̸�.getAttribute("���� ���� �̸�")�� ���� ���´�.
	out.println("pageContext ���� ����: " + pageContext.getAttribute("pageContextVar") + "<br/>");

	request.setAttribute("requestVar", "areaTest.jsp�� request ���� ����");
	session.setAttribute("sessionVar", "areaTest.jsp�� session ���� ����");
	application.setAttribute("applicationVar", "areaTest.jsp�� application ���� ����");
	
	out.println("request ���� ����: " + request.getAttribute("requestVar") + "<br/>");
	out.println("session ���� ����: " + session.getAttribute("sessionVar") + "<br/>");
	out.println("application ���� ����: " + application.getAttribute("applicationVar") + "<br/>");
	
//	���� ������ ���� ������ �����ϴ� �����Ͱ� ���Ǵ� ������ Map<String, Object> �����̹Ƿ� 
//	getAttribute() �޼ҵ�� ���� ������ ����� �����͸� ������ Object Ÿ������ ������ ������ ���� ������
//	����� �����ʹ� ������ ������ Ÿ������ �ݵ�� ����ȯ���Ѽ� ����ؾ� �Ѵ�.
	String pageContextVar = (String) pageContext.getAttribute("pageContextVar");
	out.println("pageContext ���� ����: " + pageContextVar + "<br/>");
	
	
	// sendRedirect() : �μ��� ������ �������� �Ѱ��ش�.
	//  �޼���� request ������ �����͸� ������ �ʰ� �μ��� ������ �������� �Ѿ��.
	//  �޼���� �ּ�â�� ǥ�õǴ� ������ �̸��� �μ��� ������ ������ �̸����� ����ȴ�.
	//  ���� �������� sendRedirect() �޼����� �μ��� ������ �������� ������ �и��ȴ�.
	//  ���ΰ�ħ�� �ϸ� �ּ�â�� ǥ�õ� �������� �ٽ� ����ȴ�.
	response.sendRedirect("requestTest.jsp");
	
	// forward() : �μ��� ������ �������� �Ѱ��ش�.
	// 	�޼���� request ������ �����͸� ������ �μ��� ������ �������� �Ѿ��.
	//  �޼���� �ּ�â�� ǥ�õǴ� ������ �̸��� forwatd() �޼��尡 ����� ������ �̸���
	//  �״�� �����Ѵ�.
	//	���� �������� forward() �޼����� �μ��� ������ �������� ����� ���´�.
	//	���ΰ�ħ�� �ϸ� �ּ�â�� ǥ�õ� forward�޼��尡 �Է� �� ���������� ���� ȭ�鿡 ���̴� ������
	//	���� �����̵ȴ�.
	pageContext.forward("requestTest.jsp");
%>
</body>
</html>