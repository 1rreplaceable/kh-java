package schoolhomepage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class mainMenu {
	Scanner sc = new Scanner(System.in);
	Date now = new Date();
	Subject sub1 = new Subject("자바");
	Subject sub2 = new Subject("C언어");
	Subject sub3 = new Subject("파이썬");
	Subject sub4 = new Subject("html");
	ArrayList<Student> stulist = new ArrayList<>();
	ArrayList<Subject> sublist = new ArrayList<>();
	String[] strarr;
	public void main() {
		sublist.add(sub1);
		sublist.add(sub2);
		sublist.add(sub3);
		sublist.add(sub4);
		System.out.println("---------------회원정보---------------");
		System.out.println("1. 로그인 2. 회원가입 3. ID/PW 찾기");
		int choiceMain = sc.nextInt();
		sc.nextLine();
		switch (choiceMain) {
		case 1:
			login();
			break;
		case 2:
			signup();
			main();
			break;
		case 3:
			findIDPW();
			main();
			break;
		default:
			System.out.println("잘못누르셨습니다. 다시입력하세요");
			main();
			break;
		}

	}

	public void login() {

		System.out.println("---------------회원로그인---------------");
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pw = sc.nextLine();
		if (id.equals("admin") && pw.equals("1111")) {
			adminPage();
		}
		boolean successLogin = false;
		FileReader fr = null;
		BufferedReader br = null; // 중간에 버퍼 생성(임시저장공간)

		try {
			fr = new FileReader("user.txt");
			br = new BufferedReader(fr); // FileReader 버퍼랑 연결
			String str = null;
			// 자식 클래스들이 구현해야할 read 추상 메서드
			// 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴.
			while ((str = br.readLine()) != null) {
				strarr = str.split(",");
				if (strarr[1].equals(id) && strarr[2].equals(pw)) {
					successLogin = true;
					break;
				} else {
					successLogin = false;
				}
			}
			if (successLogin) {
				System.out.println("로그인성공");
				enrolment();
			} else {
				System.out.println("로그인실패");
				main();

			}
			strarr = null;
			fr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void signup() {
		System.out.println("---------------회원가입---------------");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pw = sc.nextLine();
		System.out.println("폰번호 : ");
		String phnum = sc.nextLine();
		System.out.println("수강과목수 : ");
		int studySubject = sc.nextInt();
		sc.nextLine();
		ArrayList<Subject> sub = new ArrayList<>();

		Student stu = new Student(name, id, pw, phnum, studySubject, sub);
		stulist.add(stu);
		System.out.println("회원가입 완료");

		FileWriter fw = null;

		try {
			File file = new File("user.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			// 1. 파일 생성
			fw = new FileWriter("user.txt", true);

			// 2. 파일 내용 저장
			fw.write(name + "," + id + "," + pw + "," + phnum + "," + studySubject);
			fw.write("\n");
			// 3.파일 닫기
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void findIDPW() {

		System.out.println("1. ID찾기 2. PW찾기");
		int choiceIDPW = sc.nextInt();
		sc.nextLine();
		switch (choiceIDPW) {
		case 1:
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("폰번호 : ");
			String phnum = sc.nextLine();
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader("user.txt");
				br = new BufferedReader(fr);
				String str = null;
				while ((str = br.readLine()) != null) {
					strarr = str.split(",");
					if (strarr[0].equals(name) && strarr[3].equals(phnum)) {
						System.out.println("ID는" + strarr[1] + "입니다.");
					}
				}

				strarr = null;
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case 2:
			System.out.println("이름 : ");
			String name2 = sc.nextLine();
			System.out.println("ID : ");
			String id = sc.nextLine();
			
					try {
				fr = new FileReader("user.txt");
				br = new BufferedReader(fr);
				String str = null;
				while ((str = br.readLine()) != null) {
					strarr = str.split(",");
					if (strarr[0].equals(name2) && strarr[1].equals(id)) {
						System.out.println("PW는" + strarr[2] + "입니다.");
					}
				}

				strarr = null;
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	public void enrolment() {
		System.out.println("---------------수강신청---------------");
		System.out.println("1. 수강신청하기 2. 수강취소하기 3. 뒤로가기");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			if (!sublist.isEmpty()) {
				System.out.println("----------------------------------");
				
				System.out.println("----------------------------------");
			}
			Subject sub = new Subject();
			SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
			System.out.print("과목명 : ");
			String subjectName = sc.nextLine();
			System.out.print("과목시간 : ");
			System.out.println(date.format(now));
			for (int i = 0; i < sublist.size(); i++) {
				if (sublist.get(i).getTitle().equals(subjectName)) {
					System.out.println("수강 할 수 없습니다.");
					enrolment();
				}
			}
			sub.setTitle(subjectName);
			sub.setDatetime(date.format(now));
			sublist.add(sub);
			System.out.println("수강신청이 완료 되었습니다.");
			break;
		case 2:
			if (!sublist.isEmpty()) {
				System.out.println("----------------------------------");
				for (Subject subject : sublist) {
					System.out.println(subject);
				}
				System.out.println("----------------------------------");
			}
			System.out.println("삭제할 과목 입력: ");
			String deleteSub = sc.nextLine();
			for (int i = 0; i < sublist.size(); i++) {
				if (sublist.get(i).getTitle().equals(deleteSub)) {
					System.out.println(deleteSub + " 과목 삭제");
					sublist.remove(i);
				}
			}
			break;
		case 3:
			main();
			break;
		default:
			System.out.println("잘못누르셨습니다. 다시입력하세요");
			break;

		}
		enrolment();
	}

	public void adminPage() {
		System.out.println("-------------관리자페이지-------------");
		System.out.println("1. 수강과목관리 2. 전체학생조회 3. 뒤로가기");
		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:

			for (Subject subject : sublist) {
				System.out.println(subject.getTitle());
			}
			System.out.println("1. 과목 추가 2. 과목 삭제 3. 뒤로가기");
			int choice2 = sc.nextInt();
			sc.nextLine();

			switch (choice2) {
			case 1:
				System.out.println("추가 할 과목명");
				String subName = sc.nextLine();
				Subject newsub = new Subject(subName);
				sublist.add(newsub);
				adminPage();
				break;
			case 2:
				System.out.println("삭제 할 과목명");
				String delName = sc.nextLine();
				for (int i = 0; i < sublist.size(); i++) {
					if (sublist.get(i).getTitle().equals(delName)) {
						sublist.remove(i);
					}
				}
				adminPage();
				break;
			case 3:
				adminPage();
				break;
			}

			break;
		case 2:
			FileReader fr = null;
			BufferedReader br = null; // 중간에 버퍼 생성(임시저장공간)

			try {
				fr = new FileReader("user.txt");
				br = new BufferedReader(fr); // FileReader 버퍼랑 연결
				String str = null;
				// 자식 클래스들이 구현해야할 read 추상 메서드
				// 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴.
				System.out.println("이름\tID\tPW\tMobile\t수강과목");
				while ((str = br.readLine()) != null) {
					strarr = str.split(",");
					System.out.println(
							strarr[0] + "\t" + strarr[1] + "\t" + strarr[2] + "\t" + strarr[3] + "\t" + strarr[4]);
				}

				strarr = null;
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			adminPage();
			break;
		case 3:
			main();
			break;
		default:
			System.out.println("잘못누르셨습니다. 다시입력하세요");
			break;

		}
	}
}
