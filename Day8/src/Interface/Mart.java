package Interface;

interface saleRate {
	void foodSale();
	void electSale();
	void clothSale();
}

public class Mart implements saleRate{

	String name;
	int price;
	
	public Mart(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	int total;
	
	@Override
	public void foodSale() {
		total = price * 9 / 10;
	}

	@Override
	public void electSale() {
		total = price * 8 / 10;		
	}

	@Override
	public void clothSale() {
		total = price * 7 / 10;		
	}

}
