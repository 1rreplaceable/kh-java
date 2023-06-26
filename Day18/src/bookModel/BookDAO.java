package bookModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDAO {

	Book[] bArr = new Book[10];
	int k = 0;
	public void fileSave(Book[] bArr) throws IOException {
		ObjectOutputStream oos = null;

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("book.txt");
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i < bArr.length; i++) {
				if (bArr[i] != null) {
					oos.writeObject(bArr[i]);
				}
			}

			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("book.txt"));
			bArr[k++] = (Book) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bArr;
	}
}
