
public class CartItem {

	private String bookId;
	private int totalPrice;
	private int quantity;

	public CartItem() {
	}

	public CartItem(String[] itemBook, String bookId, int totalPrice, int quantity) {
		this.bookId = bookId;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return bookId + "    " + quantity + "      " + totalPrice;
	}
}
