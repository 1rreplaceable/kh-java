<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
request.setCharacterEncoding("utf-8");
%>

<%!class Enrollment {
		String name;
		Integer student_id;
		String department;
		Integer grade;
		Integer mincredit;
		Integer maxcredit;

		// ������
		Enrollment(String name, Integer student_id, String department, Integer grade, Integer mincredit,
				Integer maxcredit) {
			this.name = name;
			this.student_id = student_id;
			this.department = department;
			this.grade = grade;
			this.mincredit = mincredit;
			this.maxcredit = maxcredit;
		}
	}%>


<body>
	<table border="1">
		<%
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		PreparedStatement ppst = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
			}

			// ���� �����ͺ��̽��� �����ؼ� �������� cafe
			String checkid = "select * from student";
			ppst = conn.prepareStatement(checkid);
			rs = ppst.executeQuery();
			while (rs.next()) {
				int input_id = Integer.parseInt(request.getParameter("student_id"));
				String input_pw = request.getParameter("password");

				if (input_id == 20160000) {
			if (input_pw.equals("1234")) {

				out.println("<tr>");
				out.println("<td colspan ='2'>" + "2020�� 2�б� ������û" + "</td>");
				out.println("</tr>");
				String sql = "select * from studentenrollment";
				ppst = conn.prepareStatement(sql);
				rs = ppst.executeQuery();

				while (rs.next()) {
					String name = rs.getString("name");
					int student_id = Integer.parseInt(rs.getString("student_id"));
					String department = rs.getString("department");
					int grade = Integer.parseInt(rs.getString("grade"));
					int mincredit = Integer.parseInt(rs.getString("mincredit"));
					int maxcredit = Integer.parseInt(rs.getString("maxcredit"));

					out.println("<tr>");
					out.println("<td>" + "�̸�" + "</td>");
					out.println("<td>" + name + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td>" + "�й�" + "</td>");
					out.println("<td>" + student_id + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td>" + "�к�(��)" + "</td>");
					out.println("<td>" + department + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td>" + "�г�" + "</td>");
					out.println("<td>" + grade + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td>" + "�ּҽ�û����" + "</td>");
					out.println("<td>" + mincredit + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td>" + "�ִ��û����" + "</td>");
					out.println("<td>" + maxcredit + "</td>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td colspan ='2'>" + "<input type='text' value='�α׾ƿ�'>" + "</td>");
					out.println("</tr>");
				}

			} else {
				out.println("<tr>");
				out.println("<td colspan ='2'>" + "2020�� 2�б� ������û" + "</td>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>" + "�̸�" + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>" + "�й�" + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>" + "�к�(��)" + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>" + "�г�" + "</td>");
				out.println("<tr>");
				out.println("<td>" + "�ּҽ�û����" + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>" + "�ִ��û����" + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("</tr>");
			}
				}
				else{
					out.println("���̵� Ʋ���ϴ�");
				}
			}

		} catch (Exception e) {
			out.println(e.toString());
		}
		%>
	</table>

</body>
</html>