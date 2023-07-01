<%@page import="_05_User.UserDTO"%>
<%@page import="_05_User.UserDAO"%>
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
		1. 한글깨짐
		2. id, pass 가져오기
		3. 체크를 이용해서 userlist의 2번에서 가져온 변수값을 이용해서 정보있는지 확인
		4. 정보가 있다, deleteUserId(id);
		   세션도 삭제를 함 log
		   alert() 탈퇴되었다. userMain 페이지 이동
		   
		5. 아이디 또는 비밀번호 확인 메시지를 출력하고
		// 바로 이전 페이지로 이동하는 메서드
		history.go(-1);
		
		deleteUserId(id); 실행시 리스트에서 삭제, 메모장에서도 삭제
		다시 저장하는 어떤 메서드를 호출 (saveData())
	 -->

	<%
	request.setCharacterEncoding("utf-8");
	%>

	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
	String name = request.getParameter("name");

	boolean check = UserDAO.getInstance().checkUserIdPw(id, pw);
	if (check) {
		UserDAO.getInstance().deleteUserId(id);

		// 특정 세션을 지정해서 삭제하기
		session.removeAttribute("log");

		// 모든 세션 지우기
		session.invalidate();
	%>
	<script>
		alert("회원 탈퇴");
		location.href = "03_01_userMain.jsp";
	</script>
	<%
	} else {
	%>
	<script>
		alert("아이디와 비밀번호를 확인해주세요");
		history.go(-1);
	</script>
	<%
	}
	%>


</body>
</html>