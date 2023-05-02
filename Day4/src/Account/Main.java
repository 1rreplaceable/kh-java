package Account;

// 접근 제어자
// private Bank 객체 이외의 다른 클래스들은 접근금지
class Bank {
	private String accName;
	private String accNum;
	private String accPw;
	private int balance;

	Bank() {
	}

	Bank(String accName, String accNum, String accPw, int balance) {
		this.accName = accName;
		this.accNum = accNum;
		this.accPw = accPw;
		this.balance = balance;
	}
	void 입금(int money) {
		this.balance += money;
		System.out.println("현재 잔액: " + this.balance);
	}
	
	// 외부에서 출금기능
	int 출금(int money){
		// 내 통장에 50만원 / 20만원 출금해줄래
		
		if (this.balance < money) {
			System.out.println("한도초과");
			return 0;
		}else {
			this.balance -= money;
			System.out.println("현재 잔액: " + this.balance);
			return money;
		}		
	}

	void info() {
		System.out.println("계좌명     : " + accName);
		System.out.println("계좌번호    : " + accNum);
		System.out.println("계좌비밀번호 : " + accPw);
		System.out.println("잔액      : " + balance + "원");
	}
}

public class Main {

	public static void main(String[] args) {

		Bank seohee = new Bank();
		
		seohee.입금(500000);
		seohee.출금(200000);
		

	}
}
//		seohee.balance = 100000000;
//		
//		System.out.println(seohee.balance);
//		seohee.balance -= 500000;