<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!class Player {
		Integer number;
		String name;
		String position;

		// 생성자
		Player(Integer number, String name, String position) {
			this.number = number;
			this.name = name;
			this.position = position;
		}
	}%>

<%!int[] numbers = { 1, 2, 3, 4, 5, 6 };
	String[] name = { "에이", "비이", "씨이", "디이", "이이", "에프" };
	String[] positions = { "GK", "CAM", "CB", "LW", "ST", "CDM" };

	Player[] players = new Player[numbers.length];%>
<%
for (int i = 0; i < numbers.length; i++) {
	players[i] = new Player(numbers[i], name[i], positions[i]);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body class = "container">
	<div class="jumbotron">
		<h1>선 수</h1>
	</div>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>번호</th>
				<th>포지션</th>
				<th>이름</th>
			</tr>
		</thead>
		<tbody>
		
		<%
			for(int i = 0; i < players.length; i++){
				out.println("<tr>");
				out.println("<td>"+players[i].number+"</td>");
				out.println("<td>"+players[i].position+"</td>");
				out.println("<td>"+players[i].name+"</td>");
				out.println("</tr>");
			}
			
		
		%>
		</tbody>
	</table>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<Script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<Script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</body>
</html>

<%--

	선언부, 표현식, 스크립트 body 안에 넣을 필요 없다.
	변수와 메서드가 선언되면 해당 파일 어느 곳에든지 사용 가능하다.
	<%! ~~~ %> 클래스도 안에 정의 할 수 있다.



 --%>