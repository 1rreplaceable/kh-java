package bookModel;

import java.io.File;
import java.io.IOException;

public class BookController {

	BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File text = new File("book.txt");
		if(!text.exists()) {
			try {
				text.createNewFile();
			} catch (IOException e) {
			}
		}
	}
	
	public void fileSave(Book[] bArr) {
		try {
			bd.fileSave(bArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
