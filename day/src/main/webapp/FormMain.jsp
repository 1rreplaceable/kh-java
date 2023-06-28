<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
		<h1>Form</h1>
		<h6>폼을 통해 데이터 전송해봅시다.</h6>
		<br>
		<br>
		<br>
	</div>
	<form action="FormPro.jsp" method="post">
		<div>이메일</div>
		<input type="email" name="email">
		<div>비밀번호</div>
	
		<input type="password" name="password"> <br><br><input type="submit"
			value="Submit">
			
	</form>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<Script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<Script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</body>
</html>
