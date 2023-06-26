package bookArrayList;

import java.util.ArrayList;

public class BookController {

	ArrayList<Book> bookList = new ArrayList<>();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

	public void insertBook(Book bk) {
		bookList.add(bk);
	}

	public ArrayList selectList() {
		return bookList;
	}

	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).title.equals(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}

	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).title.equals(title) && bookList.get(i).author.equals(author)) {
				removeBook = new Book(bookList.get(i).title, bookList.get(i).author, bookList.get(i).category,
						bookList.get(i).price);
				bookList.remove(i);
			}
		}
		return removeBook;
	}

	int ascBook() {
		
		return 1;
	}

}
