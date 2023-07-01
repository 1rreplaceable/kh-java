<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>관리자 메인 페이지</title>
</head>
<body>
	<form action="" method="post">
		<table border="1">
			<tr>
				<td>번호</td>
				<td>아이디</td>
			</tr>
			<%
				// 파일의 내용을 불러와서 출력하는 내용
				// 유저의 정보를 클릭하면 페이지를 이동해서 유저의 정보만 확인하는 명령문
			
			%>
			<tr>
				<td colspan="2"><input type="button" value="뒤로가기"
					onclick="window.location.href='01_index.jsp'"></td>
			</tr>
		</table>


	</form>
</body>
</html>