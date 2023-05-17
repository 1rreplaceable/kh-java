package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	public static void main(String[] args) {
		
		// file 읽기
		
		FileReader fr = null;
		BufferedReader br = null; // 중간에 버퍼 생성(임시저장공간)
		
		try {
			fr = new FileReader("D:\\io_test\\ex01.txt");
			br = new BufferedReader(fr); // FileReader 버퍼랑 연결
			
			// 자식 클래스들이 구현해야할 read 추상 메서드  
		    // 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴.
			String str = br.readLine(); // 한 줄 읽기
			System.out.println(str);
			
			fr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 1. test.txt 파일명 폴더 현재 기본폴더
		 *  1번 줄 출력했습니다.
		 *  2번 줄 출력했습니다.
		 *  3번 줄 출력했습니다.
		 *  ...
		 *  100번 줄 출력했습니다.
		 * 
		 * 	저장
		 * 
		 * 2. 읽기 반복문
		 * 
		 * 3. 
		 */
	}
}
