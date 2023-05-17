package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

		String[] names = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };
		FileWriter fw = null;
		try {
			fw = new FileWriter("student.txt");
			for (int i = 0; i < 3; i++) {
				fw.write(names[i] + "/" + ages[i] + ",");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fr = null;
		BufferedReader br = null;
		String strArr2 = null;
		try {
			fr = new FileReader("student.txt");
			br = new BufferedReader(fr);
			String str = br.readLine();
			String[] strArr = str.split(",");
			for (int i = 0; i < strArr.length; i++) {
				strArr2 = strArr[i];

				System.out.println("이름: " + strArr2.split("/")[0]);
				System.out.println("나이: " + strArr2.split("/")[1]);
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
