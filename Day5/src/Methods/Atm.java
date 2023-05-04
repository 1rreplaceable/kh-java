package Methods;

public class Atm {

	// 내가 현재 가지고 있는 money, 입금금액
	public static int 입금(int money, int addMoney) {
		money += addMoney;
		return money;
	}
	
	public static void main(String[] args) {

		// main(나)
		int money = 10000;
		// 입금
		// 입금하고 난 총 잔액을 확인
		System.out.println(입금(money, 20000));
		
		
	}

}
