package Exception_Account;

import java.util.Scanner;

public class Account {
	String no;
	String name;
	private int money;
	int pw;

	public Account() {
	}

	public Account(String no, String name, int pw, int money) {
		this.no = no;
		this.name = name;
		this.pw = pw;
		this.money = money;
	}

	int myMoney() {
		return money;
	}

	void deposit(int input) {
		int money1 = myMoney();
		money1 += input;
		System.out.println(input + "만원 입금, 현재 돈: " + money1 + "만원");
	}

	void withdraw(int output) throws Exception {
		int money1 = myMoney();
		if (money1 < output) {
			throw new Exception("한도초과");
		} else {
			money1 -= output;
			System.out.println(output + "만원 출금, 현재 돈: " + money1 + "만원");
		}
	}

	void check(int pw) throws Exception {
		Scanner sc = new Scanner(System.in);
		if (this.pw != pw) {
			throw new Exception("비밀번호가 맞지 않습니다 확인하세요");
		} else {
			System.out.println("1.예금 2.출금");
			int user = sc.nextInt();
			System.out.println("돈>");
			int userMoney = sc.nextInt();
			if (user == 1) {
				deposit(userMoney);
			} else {
				withdraw(userMoney);
			}
		}
	}
	
	class CheckCard extends Account{
		int cardPw;
		
		public CheckCard(int cardPw) {
			this.cardPw = cardPw;
		}

		void pay() {
			Scanner sc = new Scanner(System.in);
			System.out.println("돈>");
			int userMoney = sc.nextInt();
			try {
				withdraw(userMoney);
			} catch (Exception e) {
			}
		}
	}

}
