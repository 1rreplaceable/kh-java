package Thread_synchronized;

import java.util.Scanner;

public class Account {
	private String name; // 계좌명
	private int pw; // 비밀번호
	private int money = 1000000; // 잔액
	private ATM atm;
	int input = 0;
	Scanner in = new Scanner(System.in);

	public Account(String name, int pw) {
		this.name = name;
		this.pw = pw;
	}

	synchronized void withd(String name, int pw) { // 매개변수는 비밀번호, 접근하는 사람 이름으로 설정할 것.
		// 비밀번호가 맞으면 출금액을 입력받고 출금액이 기존 돈보다 많지 않으면 출금하고
		// 기존 돈보다 출금액이 많으면 출금하지마라. 뽑으면 잔액도 출력하던가.
		if (pw == this.pw) {

			System.out.println("금액을 입력하세요");
			input = in.nextInt();
			String answer = input > this.money ? "출금액이 많습니다."
					: String.format("출금하신 분은 %s," + " 현재 잔액은 %d입니다\n", name, this.money);
			if (input > this.money) {
				System.out.println(answer);
				return;
			}
			this.money -= input;
			System.out.println(answer);
		}
	}

	// 출금 함수명 withd() 매개변수 비밀번호, 이름
	// 기능 비밀번호가 맞으면 출금액을 입력 받고
	// 출금액이 기존 돈보다 많지 않으면 출금 하고 잔액표시 + 누가 출금했는지
	// 기존 돈보다 출금액이 많다 그러면 "한도초과 출금 안됨"

}
