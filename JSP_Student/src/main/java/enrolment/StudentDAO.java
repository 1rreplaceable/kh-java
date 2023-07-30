package enrolment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

	private StudentDAO() {
	}

	private static StudentDAO instance = new StudentDAO();

	public static StudentDAO getInstance() {

		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 연동하는 메서드!

	private Connection getConnection() {
		String dbURL = "jdbc:mysql://localhost:3308/enrolment01?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "1234";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 학번하고 비밀번호 확인하는 메서드
	public int studentCheck(String hakbun, String passwd) {
		int check = -1; // 의미없는 값!
		String dbPassword = "";

		// 연결 하는 내용 만약 에러가 발생하면 드라이버를 가져올 수 없다!
		try {
			conn = getConnection();
			System.out.println("연결 성공~");
			// sql 문 조회 학번을 이용해서 기존에 데이터베이스에 있는 비밀번호를 조회해서
			// 가져온 다음에 새로 매개변수로 받은 passwd랑 비교해서 결과가 같으면 체크 1
			// 아니다 0

			// 1. 쿼리
			String sql = "select passwd from member where hakbun = ?";

			// 2. 학번 저장
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hakbun);

			// 3. rs 꺼내서 비교하기
			rs = pstmt.executeQuery();

			// dbPassword가지고 온 데이터랑 passwd 같니?
			// 같으면 체크 1 다르면 체크 0
			if (rs.next()) {
				dbPassword = rs.getString("passwd");
				System.out.println("db 비밀번호:" + dbPassword);
				System.out.println("입력창: " + passwd);

				if (dbPassword.equals(passwd)) {
					check = 1;

				} else {
					check = 0;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
					conn.close();
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return check;
	}

	public StudentDTO getStudent(String hakbun) {
		StudentDTO sto = null;
		// sql에 조회해서 내용가지고 오고 sto 변수애 저장해서
		try {
			conn = getConnection();
			System.out.println("연결 성공~");

			String sql = "select * from member where hakbun = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hakbun);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				
				sto = new StudentDTO();
				
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String major = rs.getString("major");
				int grade = Integer.parseInt(rs.getString("grade"));
				int hakjom = Integer.parseInt(rs.getString("hakjom"));
				
				sto.setHakbun(hakbun);
				sto.setPasswd(passwd);
				sto.setName(name);
				sto.setAddress(address);
				sto.setTel(tel);
				sto.setEmail(email);
				sto.setMajor(major);
				sto.setGrade(grade);
				sto.setHakjom(hakjom);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
					conn.close();
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return sto;
	}

}