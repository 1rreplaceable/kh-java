package Generics;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

//	사용자가 직접 메인 메뉴를 선택 할 수 있음. 
//	종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	void mainMenu() {
		while (true) {
		System.out.println("=======KH 사이트=======");

		System.out.println("*******메인 메뉴*********");

		// joinMembership() 실행
		System.out.println("1. 회원 가입 ");
		System.out.println("2. 로그인"); // login()실행 후 memberMenu() 실행
		System.out.println("3. 같은 이름 회원 찾기"); // sameName()
		System.out.println("9. 종료!"); // 프로그램 종료 후 main()

		System.out.print(">");
		int key = sc.nextInt();
		sc.nextLine();

			switch (key) {
			case 1: {
				joinMembership();
				break;
			}
			case 2: {
				login();
				memberMenu();
				break;
			}
			case 3: {
				sameName();
				memberMenu();
				break;
			}
			
			case 9: {
				System.out.println("프로그램 종료!");				
				return; 
			}
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
			}
		}

	}

	void memberMenu() {
		System.out.println("*******회원 메뉴*********");

		System.out.println("1. 비밀번호 바꾸기 ");
		System.out.println("2. 이름 바꾸기"); 
		System.out.println("3. 로그아웃"); 
		
		System.out.print("메뉴 번호 선택: >>");
		int keyMember = sc.nextInt();
		sc.nextLine();
		switch (keyMember) {
		case 1: {
			changePassword();
			break;
		}
		case 2: {
			changeName();
			break;

		}
		case 3: {
			System.out.println("로그아웃 되었습니다.");
			mainMenu();
			break;
		}
		default:
			System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
		}
	}

	void joinMembership() {
		System.out.println("id>");
		String id = sc.nextLine();
		
		System.out.println("pw>");
		String pw = sc.nextLine();
		
		System.out.println("name>");
		String name = sc.nextLine();
		Member temp = new Member(name, pw);
		
		boolean res = mc.joinMemberShip(id, temp);
		
		if(res) {
			System.out.println("가입이 완료되었습니다");
		}else {
			System.out.println("가입 완료되지 않았습니다");
		}
	}

	void login() {
		System.out.println("id>");
		String nameLogin = sc.nextLine();
		
		System.out.println("pw>");
		String pwLogin = sc.nextLine();
		if(mc.login(nameLogin, pwLogin)!=null) {
			System.out.println(mc.login(nameLogin, pwLogin)+"님 환영합니다.");
		}else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요");
			mainMenu();
		}
		
		
	}

	void changePassword() {
		System.out.println("id>");
		String id = sc.nextLine();
		
		System.out.println("pw>");
		String pwOld = sc.nextLine();
		
		System.out.println("newpw>");
		String pwNew = sc.nextLine();
		boolean res = mc.changePassword(id, pwOld, pwNew); 
		if(res) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요");
		}
	}

	void changeName() {
		System.out.println("id>");
		String id = sc.nextLine();
		
		System.out.println("pw>");
		String pw = sc.nextLine();
		
		System.out.println("newid>");
		String nameNew = sc.nextLine();
		String name = mc.login(id, pw);
		if(name!=null) {
			mc.changeName(id, nameNew);
			System.out.println("이름 변경 성공");
		}else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
		}
		
	}

	void sameName() {
		System.out.println("검색할 이름>");
		String name = sc.nextLine();
		
		System.out.println(mc.sameName(name));
	}
}