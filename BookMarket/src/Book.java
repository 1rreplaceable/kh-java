
public class Book {

	String BookId;
	String Name;
	int UnitPrice;
	String Author;
	String Description;
	String Category;
	String ReleaseDate;

	public Book() {
	}

	public Book(String bookId, String name, int unitPrice, String author, String description, String category,
			String releaseDate) {
		BookId = bookId;
		Name = name;
		UnitPrice = unitPrice;
		Author = author;
		Description = description;
		Category = category;
		ReleaseDate = releaseDate;
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return BookId + " | " + Name + " | " + UnitPrice + " | " + Author + " | " + Description + " | " + Category
				+ " | " + ReleaseDate + " | ";
	}

}
