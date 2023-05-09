package Interface;

public abstract class Card {

	private String cardNumber; // 카드번호
	String cardName; // 카드명
	private String cardPw; // 비밀번호
	private int cvc; // cvc번호
	
	abstract void pay();
	abstract void save();

	// setter, getter
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardPw() {
		return cardPw;
	}

	public void setCardPw(String cardPw) {
		this.cardPw = cardPw;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

}

interface Shopping{
	void shop();
}

interface Gas{
	void gas();
}
interface Movie{
	void movie();
}
interface Pack{
	void pack();
}

class Hyundai_card extends Card implements Shopping, Gas{

	@Override
	void pay() {
		System.out.println("현대카드결제");
	}

	@Override
	void save() {
		System.out.println("현대카드적립");
	}

	@Override
	public void gas() {
		System.out.println("현대카드 주유시 10할인");
	}

	@Override
	public void shop() {
		System.out.println("현대카드 쇼핑시 5추가 할인 및 적립");
	}
	
}

class Samsung_card extends Card implements Pack{

	@Override
	public void pack() {
		System.out.println("삼성카드 사용시 5회 무료입장");
	}

	@Override
	void pay() {
		System.out.println("삼성카드결제");
	}

	@Override
	void save() {
		System.out.println("삼성카드적립");
	}
	
}

class Lotte_card extends Card implements Shopping, Gas, Movie{

	@Override
	public void movie() {
		System.out.println("롯데카드 사용시 5 할인");
	}

	@Override
	public void gas() {
		System.out.println("롯데카드 주유시 10 할인");
	}

	@Override
	public void shop() {
		System.out.println("롯데카드 쇼핑시 5추가 할인 및 적립");
	}

	@Override
	void pay() {
		System.out.println("롯데카드결제");
	}

	@Override
	void save() {
		System.out.println("롯데카드적립");
	}
	
}