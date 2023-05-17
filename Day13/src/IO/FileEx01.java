package IO;

import java.io.File;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		// file 클래스
		// - 파일 또는 디렉터리(폴더) 생성, 삭제 및 이름 변경
		// 디렉터리 내용 나열 등

		// File file = new File("[디렉터리명]");
		File file = new File("test.txt");

		// 만약 지정 위치에 파일이 존재하면 false
		// 파일이 없다 true

		try {
			boolean res = file.createNewFile();
			System.out.println(res);

			if (res) {
				System.out.println("파일생성완료");
			} else {
				System.out.println("파일생성안함");
			}

			// exists()
			if (file.exists()) {

				System.out.println("파일의 이름: " + file.getName());
				System.out.println("파일의 경로: " + file.getAbsolutePath());
				System.out.println("파일 쓰기 유무: " + file.canWrite());
				System.out.println("파일 읽기 유무: " + file.canRead());
				System.out.println("파일의 크기: " + file.length());
			}else {
				System.out.println("파일이 없습니다");
			}
			//file.mkdir();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 디렉터리 mkdir()
	// 새 폴더를 생성
	
	
}
