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

	정적 웹페이지
 		- 언제 접속해도 같은 응답을 보내준다.
 		- css, html, javascipt 등이 업로드 되면 개발자가 수정하기 전까지 매번 같은
 		- 파일을 브라우저가 건네준다.
 		   즉 정적 웹페이지에 대한 요청을 받은 경우 서버는 추가적인 처리과정 없이 클라이언트에게
 		   응답 보낸다. 
 		   
	동적 웹페이지 
 		- 웹서버가 동적 웹페이지에 대한 요청을 받은 경우 서버는 추가적인 처리과정이후 
 		  클라이언트에게 응답을 보낸다.
 		- 동적페이지는 방문자와 상호 작용하기 때문에 페이지 내용은 그때 그때 다르다.
 		- 댓글 , 날씨 주가 정보 등 같이 정보 변경이 잦은 곳에 많이 사용된다.

 -->

	<h1>1. 출력</h1>
	<%
		String name = "김철수";
		System.out.println(name); // console에 데이터 출력
		out.println(name);		  // html에 데이터 출력
	%>
	
	출력 결과: name
	<br><br>
	<!-- html 코드 뒤에 jsp 문법으로 출력 -->
	출력 결과: <%=name %>
	
	<h1>조건문</h1>
	<%
		String name2 = "이만수";
	%>
	<br><br>
	
	<%if(name2.equals("이만수")){%>
	이만수입니다.
	<%}else{%>
	이만수 아닙니다.
	<%} %>
	
	<h2>import 속성</h2>
	
	<%
		Random ran = new Random();
		
		// 배열의 초기화 블럭을 사용하면 배열의 선언, 메모리할당, 초기값 설정을 한번에 할 수 있다.
		String[] str = {"jsp","JAVA", "Spring","HTML5"};
		int i = ran.nextInt(4);
		
	%>
	<br>
	<%= str[i]%> 가 재미있다.
	<!-- java.sql.timestamp
		 sql의 timestamp 타입에 대응하기 위해 만들어졌다.
		 timestamp 클래스로 날짜, 시간과 관련한 데이터의 조직을 행하는 경우에 이용을 한다.
	 -->
	<%
		//Timestamp now = new Timestamp(System.currentTimeMillis());	
		//out.println(now.getHours()+"시");
		Timestamp now = new Timestamp(System.currentTimeMillis());	
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = format.format(now);
		
		out.println(strdate);
		
		Timestamp cur = new Timestamp(System.currentTimeMillis());	
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String strdate2 = format2.format(cur);
		out.println(strdate2);
		
	%>
	
	<h2>반복문</h2>
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