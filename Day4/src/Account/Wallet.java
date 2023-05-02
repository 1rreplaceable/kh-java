package Account;

class OpenWallet{
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

public class Wallet {

	public static void main(String[] args) {
		OpenWallet my = new OpenWallet();
		my.setMoney(50000);
		System.out.println(my.getMoney());
	}

}
