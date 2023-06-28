<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<%
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
			out.println("연결 성공");
		}
		
		// 현재 데이터베이스를 선택해서 가져오기 cafe
		String sql = "select * from cafe";
		pstm = con.prepareStatement(sql);
		rs = pstm.executeQuery();
		
		while(rs.next()){
			out.println(rs.getString("cafeid"));
		}
		
	} catch (Exception e) {
		out.println(e.toString());
	}
	%>
</body>
</html>