
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%!class User {
		String email;
		String password;

		// ������
		User(String email, String password) {
			this.email = email;
			this.password = password;
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
<body class = "container">
	<div class="jumbotron">
		<h1>Form ����</h1>
	</div>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>��ȣ</th>
				<th>�̸���</th>
				<th>��й�ȣ</th>
			</tr>
		</thead>
		<tbody>
		
		<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User u = new User(email,password);
				out.println("<tr>");
				out.println("<td>"+1+"</td>");
				out.println("<td>"+u.email+"</td>");
				out.println("<td>"+u.password+"</td>");
				out.println("</tr>");
			
		
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
