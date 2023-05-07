package Inheritance_currency;

public class Currency {

	// 수량 amount
	// 표기 (원, 유로, 엔)

	double amount;
	String notation;

	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}

}

class KRW extends Currency {

	public KRW(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("KRW : %.2f %s", amount, notation);
	}

}

class USD extends Currency {

	public USD(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("USD : %.2f %s", amount, notation);
	}

}

class EUR extends Currency {

	public EUR(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("EUR : %.2f %s", amount, notation);
	}

}

class JPY extends Currency {

	public JPY(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("JPY : %.2f %s", amount, notation);
	}

}
