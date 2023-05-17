package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {

		// 바이트 출력 스트림 문자, 동영상, 이미지 1byte

		try {
			File file = new File("gugudan.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileInputStream fos = new FileInputStream(file);

			int i = 0;
			// read() 데이터가 읽을 없다
			// null 나오기 전까지 읽어오기
			while ((i = fos.read()) != -1) {
				System.out.print((char)i);
			}

				fos.close();

			System.out.println("정상적");
		} catch (IOException e) {
			System.out.println("파일에 대한 예외발생");
		}

		// 문자기반 2byte

	}
}

//String str = "Hello java Programming";