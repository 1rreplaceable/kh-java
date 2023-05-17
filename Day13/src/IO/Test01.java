package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt");
			for (int i = 1; i <= 100; i++) {
				fw.write(i + "번 줄 출력했습니다.\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("test.txt");
			br = new BufferedReader(fr);

			for (int i = 1; i <= 100; i++) {
				String str = br.readLine();
				System.out.println(str);
			}

			fr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
