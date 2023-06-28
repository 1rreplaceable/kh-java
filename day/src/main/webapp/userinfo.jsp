<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!class User {
		String name;
		String date;
		String address;

		// 생성자
		User(String name, String date, String address) {
			this.name = name;
			this.date = date;
			this.address = address;
		}
	}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
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
			request.setCharacterEncoding("utf-8");
			%>
			<%
			ArrayList<User> ul = new ArrayList<>();
			Connection con = null;
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "1234";
			PreparedStatement pstm = null;
			ResultSet rs = null;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				con = DriverManager.getConnection(url, user, password);
				if (con != null) {
				}

				// 현재 데이터베이스를 선택해서 가져오기 cafe
				String sql = "select * from userTBL";
				pstm = con.prepareStatement(sql);
				rs = pstm.executeQuery();

				while (rs.next()) {
					String username = rs.getString("username");
					String birthyear = rs.getString("birthyear");
					String addr = rs.getString("addr");
					User u = new User(username, birthyear, addr);
					ul.add(u);
				}
				for (int i = 0; i < ul.size(); i++) {
					out.println("<tr>");
					out.println("<td>" + (i + 1) + "</td>");
					out.println("<td>" + ul.get(i).name + "</td>");
					out.println("<td>" + ul.get(i).date + "</td>");
					out.println("<td>" + ul.get(i).address + "</td>");
					out.println("</tr>");
				}
			} catch (Exception e) {
				out.println(e.toString());
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