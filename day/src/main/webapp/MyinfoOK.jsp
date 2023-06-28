<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form에서 넘어온 데이터를 jsp로 처리하는 내용!</title>
</head>
<body>
	<%
	// form에서 입력된 한글 데이터가 post 방식으로 전송될 때 깨지는 현상을 방지한다.
	// sumbit 클릭을 하면 request객체에 form 가지고있는 정보가 모두 담겨 객체로 반환된다.
	// getParamter() 메서드가 실행 되기 전 (맨 처음에) 인코딩 내용을 작성한다.
	request.setCharacterEncoding("UTF-8");

	//getParamter() 메서드 모든 정보는 문자열 형태로 넘어온다.

	String name = request.getParameter("name");
	out.println(name + "님 안녕하세요 <br>");

	String id = request.getParameter("id");
	out.println(name + "님 id : " + id + "입니다. <br>");

	String password = request.getParameter("password");
	out.println(name + "님 password : " + password + "입니다. <br>");

	String age = request.getParameter("age");
	out.println(name + "님 age : " + age + "입니다. <br>");

	// out.println() 웹페이지에 출력

	// 여성인지 남성인지 request 객체 이용
	// Boolean 래퍼클래스를 이용해서 객체로 생성 -> auto unboxing 이용해서
	// 기본자료형 저장
	boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
	out.println(name + "님 " + (gender ? "남자" : "여자") + "입니다.<br>");

	// 체크박스에 있는 값들을 가지고 오기
	// getParameter(name) 넘어온 데이터를 받으면 맨 처음 선택한 값 1개만 받을 수 있다.
	// getParameterValues() 메서드로 받아서 배열에 저장해서 리턴한다.

	String[] hobbies = request.getParameterValues("hobbies");
	//out.println(name + "취미는" + hobbies + "입니다.<br>");
	//out.println(name + "취미는" + Arrays.toString(hobbies) + "입니다.<br>");

	out.println(name + "님 취미는");

	// 만약에 아무것도 데이터를 선택하지 않을 경우 에러
	// 예외적인 처리를 해야된다.
	try {
		for (int i = 0; i < hobbies.length; i++) {
			out.println(hobbies[i] + " ");
		}

		out.println("입니다.<br>");
	} catch (NullPointerException e) {
		out.println("없습니다.<br>");
	}
	
	// 콤보상자, 목록상자 내용들 확인
	
	String trip = request.getParameter("trip");
	out.println(name+"님 "+trip+"에 가고 싶습니다.<br>");
	
	String[] travel = request.getParameterValues("travel");
	//out.println(name+"님 "+travel+"를 가고 싶습니다.<br>");
	//out.println(name+"님 "+Arrays.toString(travel)+"를 가고 싶습니다.<br>");
	out.println(name+"님 ");
	
	try {
		for (int i = 0; i < travel.length; i++) {
			out.println(travel[i] + " ");
		}

		out.println("를 가고 싶습니다.<br>");
	} catch (NullPointerException e) {
		out.println("없습니다.<br>");
	}
	
	// 메모 (textarea)
	String content = request.getParameter("content");
	
	// out.println()
	// 태그 사용 가능, 줄바꿈 불가능
	out.println(name + "님이 남긴 글" + content + "<br>");
	
	// 태그 사용 가능, 줄바꿈 가능
	out.println(name + "님이 남긴 글<br>" + content.replace("\r\n","<br>") + "<br>");
	
	
	
	
	
	
	
	
	%>
</body>
</html>