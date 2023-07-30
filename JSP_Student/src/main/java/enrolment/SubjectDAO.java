package enrolment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubjectDAO {
	private SubjectDAO() {
	}

	private static SubjectDAO instance = new SubjectDAO();

	public static SubjectDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 연동하는 메서드
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

	public ArrayList<SubjectDTO> getAllSubject() {
		ArrayList<SubjectDTO> s = new ArrayList<>();

		SubjectDTO sto = null;

		try {
			conn = getConnection();

			// 1. 조회하기 subject01 모두 가져오기
			String sql = "select * from subject01";
			// 2. rs 저장하기
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 3. 데이터가 있다면 rs에서 꺼내서 sto에 저장하기
			while (rs.next()) {
				sto = new SubjectDTO();
				sto.setSubjectNum(rs.getInt(1));
				sto.setSubjectName(rs.getString(2));
				sto.setProfessorName(rs.getString(3));
				sto.setHakjom(rs.getInt(4));
				sto.setMajor(rs.getString(5));
				sto.setRoom(rs.getString(6));
				sto.setSubjectPurpos(rs.getString(7));
				sto.setSubjectGoal(rs.getString(8));
				sto.setSubjectTest(rs.getString(9));
				sto.setGrade(rs.getInt(10));
				sto.setStudentCount(rs.getInt(11));

				s.add(sto);
			}

		} catch (Exception e) {

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

		return s;
	}

	public SubjectDTO getOneSubject(int subjectNum) {

		SubjectDTO sto = null;
		try {
			conn = getConnection();

			String sql = "select * from subject01 where subjectNum = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjectNum);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				sto = new SubjectDTO();
				sto.setSubjectNum(rs.getInt(1));
				sto.setSubjectName(rs.getString(2));
				sto.setProfessorName(rs.getString(3));
				sto.setHakjom(rs.getInt(4));
				sto.setMajor(rs.getString(5));
				sto.setRoom(rs.getString(6));
				sto.setSubjectPurpos(rs.getString(7));
				sto.setSubjectGoal(rs.getString(8));
				sto.setSubjectTest(rs.getString(9));
				sto.setGrade(rs.getInt(10));
				sto.setStudentCount(rs.getInt(11));
			}

		} catch (Exception e) {

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

	public ArrayList<SubjectDTO> getGradeMajorSubject(String major, String grade) {
		SubjectDTO sto = null;
		ArrayList<SubjectDTO> s = new ArrayList<>();
		try {
			conn = getConnection();

			String sql = "select * from subject01 where major = ? and grade = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, major);
			pstmt.setString(2, grade);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sto = new SubjectDTO();
				sto.setSubjectNum(rs.getInt(1));
				sto.setSubjectName(rs.getString(2));
				sto.setProfessorName(rs.getString(3));
				sto.setHakjom(rs.getInt(4));
				sto.setMajor(rs.getString(5));
				sto.setRoom(rs.getString(6));
				sto.setSubjectPurpos(rs.getString(7));
				sto.setSubjectGoal(rs.getString(8));
				sto.setSubjectTest(rs.getString(9));
				sto.setGrade(rs.getInt(10));
				sto.setStudentCount(rs.getInt(11));

				s.add(sto);
			}

		} catch (Exception e) {

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

		return s;
	}

	public int subjectCheck(String hakbun, int subjectNum) {
		int check = 0;
		try {
			conn = getConnection();

			String sql = "select * from mySubject where hakbun = ? and subjectNum = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			pstmt.setInt(2, subjectNum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				check = 1;
			}

		} catch (Exception e) {

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
		return check;
	}

	public void enrollSubject(int subjectNum) {

		try {
			conn = getConnection();

			String sql = "update subject01 set studentCount = studentCount - 1 where subjectNum = ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjectNum);
			pstmt.executeUpdate();

		} catch (Exception e) {

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
	}

	public MySubjectDTO insertArraySubject(String hakbun, int subjectNum) {
		MySubjectDTO mto = null;
		try {
			conn = getConnection();
			String sql = "select * from subject01 where subjectNum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjectNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				mto = new MySubjectDTO();

				mto.setMyNum(rs.getInt(1));
				mto.setSubjectNum(subjectNum);
				mto.setHakbun(hakbun);
				mto.setSubjectName(rs.getString(2));
				mto.setProfessorName(rs.getString(3));
				mto.setHakjom(rs.getInt(4));
				mto.setMajor(rs.getString(5));
				mto.setGrade(rs.getInt(10));

			}
		} catch (Exception e) {

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
		return mto;
	}

	public void insertSQL(MySubjectDTO mto) {

		try {
			conn = getConnection();
			String sql3 = "insert into mySubject(myNum, subjectNum, hakbun, subjectName, professorName, hakjom, major, grade) values(?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql3);
			pstmt.setInt(1, mto.getMyNum());
			pstmt.setInt(2, mto.getSubjectNum());
			pstmt.setString(3, mto.getHakbun());
			pstmt.setString(4, mto.getSubjectName());
			pstmt.setString(5, mto.getProfessorName());
			pstmt.setInt(6, mto.getHakjom());
			pstmt.setString(7, mto.getMajor());
			pstmt.setInt(8, mto.getGrade());

			pstmt.executeUpdate();
		} catch (Exception e) {

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
	}
}