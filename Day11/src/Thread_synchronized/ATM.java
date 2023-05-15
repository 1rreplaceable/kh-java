package Thread_synchronized;

import java.util.Scanner;

public class ATM extends Thread {

	Account a; // 고객정보 받는 참조변수
	String name; // 이용하는 사람의 정보!
	Scanner in = new Scanner(System.in);
	int userPw = 0;
	int input = 0;
	synchronized void input() {
		input = in.nextInt();

	}

	public ATM(Account a, String name) {
		this.a = a;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("비밀번호 입력>");
		userPw = in.nextInt();

		a.withd(name, userPw);
	}
}
