package Object;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		User a = new User("qwer", "qwer");
		
		// getClass()
		// 자신이 속한 클래스의 객체를 반환하는 메서드
		// 모든 정보를 담고 있는 클래스
		// 클래스 당 1개만 존재
		// 자바파일 -> .class -> 객체를 생성할 때
		
		System.out.println(a.getClass());
		
		// 자바에서 Reflection API
		// 자바에서 타입을 모르더라도 getClass(). 다양한 기능
		
		System.out.println("로그인");
		System.out.println("아이디 입력>");
		String login_id = in.nextLine();
		System.out.println("비밀번호 입력>");
		String login_pw = in.nextLine();
		
		User login1 = new User(login_id, login_pw);
		
		if (login1.equals(a)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
