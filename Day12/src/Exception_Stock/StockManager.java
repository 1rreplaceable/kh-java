package Exception_Stock;

public class StockManager {
	int stockNum;

	public StockManager(int stockNum) {
		this.stockNum = stockNum;
	}

	void updateStock() {
		System.out.println(this.stockNum);
	}

	void subStock(int amount) throws Exception {
		if (this.stockNum < amount) {
			throw new Exception("재고가 부족합니다.");
		} else {
			this.stockNum -= amount;
		}
	}

}
