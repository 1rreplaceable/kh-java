<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Time"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 

	���� ��������
 		- ���� �����ص� ���� ������ �����ش�.
 		- css, html, javascipt ���� ���ε� �Ǹ� �����ڰ� �����ϱ� ������ �Ź� ����
 		- ������ �������� �ǳ��ش�.
 		   �� ���� ���������� ���� ��û�� ���� ��� ������ �߰����� ó������ ���� Ŭ���̾�Ʈ����
 		   ���� ������. 
 		   
	���� �������� 
 		- �������� ���� ���������� ���� ��û�� ���� ��� ������ �߰����� ó���������� 
 		  Ŭ���̾�Ʈ���� ������ ������.
 		- ������������ �湮�ڿ� ��ȣ �ۿ��ϱ� ������ ������ ������ �׶� �׶� �ٸ���.
 		- ��� , ���� �ְ� ���� �� ���� ���� ������ ���� ���� ���� ���ȴ�.

 -->

	<h1>1. ���</h1>
	<%
		String name = "��ö��";
		System.out.println(name); // console�� ������ ���
		out.println(name);		  // html�� ������ ���
	%>
	
	��� ���: name
	<br><br>
	<!-- html �ڵ� �ڿ� jsp �������� ��� -->
	��� ���: <%=name %>
	
	<h1>���ǹ�</h1>
	<%
		String name2 = "�̸���";
	%>
	<br><br>
	
	<%if(name2.equals("�̸���")){%>
	�̸����Դϴ�.
	<%}else{%>
	�̸��� �ƴմϴ�.
	<%} %>
	
	<h2>import �Ӽ�</h2>
	
	<%
		Random ran = new Random();
		
		// �迭�� �ʱ�ȭ ���� ����ϸ� �迭�� ����, �޸��Ҵ�, �ʱⰪ ������ �ѹ��� �� �� �ִ�.
		String[] str = {"jsp","JAVA", "Spring","HTML5"};
		int i = ran.nextInt(4);
		
	%>
	<br>
	<%= str[i]%> �� ����ִ�.
	<!-- java.sql.timestamp
		 sql�� timestamp Ÿ�Կ� �����ϱ� ���� ���������.
		 timestamp Ŭ������ ��¥, �ð��� ������ �������� ������ ���ϴ� ��쿡 �̿��� �Ѵ�.
	 -->
	<%
		//Timestamp now = new Timestamp(System.currentTimeMillis());	
		//out.println(now.getHours()+"��");
		Timestamp now = new Timestamp(System.currentTimeMillis());	
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = format.format(now);
		
		out.println(strdate);
		
		Timestamp cur = new Timestamp(System.currentTimeMillis());	
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String strdate2 = format2.format(cur);
		out.println(strdate2);
		
	%>
	
	<h2>�ݺ���</h2>
	<%
	int j =0;
	while(j < 10){
		out.println(j);
		j++;
	}
	%>
	<br><br>
	<!-- 
	
	*
	**
	***
	****
	*****
	
	123A
	45BC
	6DEF
	
	 -->
	<%
	for(int k = 0; k < 5; k++){
		for(int q = 0; q <= k; q++){
		out.println("*");
		}out.println("<br>");
	}
	out.println("<br>");
	out.println("<br>");
	
	char[] num = {'1','2','3','4','5','6'};
	char[] alpha = {'A','B','C','D','E','F'};
	int num_idx = 0;
	int alpha_idx = 0;
	for(int a = 0; a < 3; a++){
		for(int b = 0; b < 4; b++){
			if(a + num_idx < 3){
				out.println(num[num_idx++]);
			}else{
				out.println(alpha[alpha_idx++]);
			}
		}out.println("<br>");
	}
	%>
</body>
</html>