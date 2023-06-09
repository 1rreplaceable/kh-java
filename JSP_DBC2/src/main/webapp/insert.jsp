<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 폼에서 넘어온 값 캐릭터셋 설정 -->
<%
request.setCharacterEncoding("utf-8");
%>

<%!class User {
		Integer number;
		String name;
		Integer birth;
		String address;

		// 생성자
		User(Integer number, String name, Integer birth, String address) {
			this.number = number;
			this.name = name;
			this.birth = birth;
			this.address = address;
		}
	}%>


<%
Connection conn = null;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String password = "1234";
PreparedStatement ppst = null;
ResultSet rs = null;

try {
	Class.forName("oracle.jdbc.driver.OracleDriver"); // jdbc 드라이버 로딩

	conn = DriverManager.getConnection(url, user, password); // Connection 객체 생성(db 연결)
	if (conn != null) {
		out.println("db연결 OK!");
	}

	String sql = "insert into users values(?,?,?,?)";
	ppst = conn.prepareStatement(sql);
	ppst.setInt(1, Integer.parseInt(request.getParameter("num")));
	ppst.setString(2, request.getParameter("name"));
	ppst.setInt(3, Integer.parseInt(request.getParameter("birth")));
	ppst.setString(4, request.getParameter("address"));

	rs = ppst.executeQuery();

	while (rs.next()) {
		out.println(rs.getString("num"));
	}

} catch (Exception e) {
	e.getStackTrace();
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<title>파일이름: insert.jsp</title>
</head>
<body>
<body class="container">
	<div class="jumbotron">
		<h1>User 정보</h1>
	</div>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>주소</th>
			</tr>
		</thead>
		<tbody>
			<%
			try {
				ArrayList<User> ul = new ArrayList<>();
				if (conn != null) {
				}
				String sql = "select * from users";
				ppst = conn.prepareStatement(sql);

				rs = ppst.executeQuery();

				while (rs.next()) {
					int num = Integer.parseInt(rs.getString("num"));
					String name = rs.getString("name");
					int birth = Integer.parseInt(rs.getString("birth"));
					String address = rs.getString("address");
					User u = new User(num, name, birth, address);
					ul.add(u);
					
				}
				for (int i = 0; i < ul.size(); i++) {
					out.println("<tr>");
					out.println("<td>" + ul.get(i).number + "</td>");
					out.println("<td>" + ul.get(i).name + "</td>");
					out.println("<td>" + ul.get(i).birth + "</td>");
					out.println("<td>" + ul.get(i).address + "</td>");
					out.println("</tr>");
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
			%>


		</tbody>


		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
		<Script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
		<Script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>