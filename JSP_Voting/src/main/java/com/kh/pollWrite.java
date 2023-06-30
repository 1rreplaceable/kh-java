package com.kh;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class pollWrite {
	public static void pollWrite(String filepath, ArrayList<String> poll) {
		
		PrintWriter printwriter = null;
		
		try {
			printwriter = new PrintWriter(filepath);
			
			// ArrayList에 저장된 개수만큼 텍스트 파일로 출력한다.
			for(String str : poll) {
				printwriter.write(str+"\r\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("디스크에 파일이 존재하지않는다");
		}finally {
			if(printwriter!=null) {
				printwriter.close();
			}
		}
		
		
	}

}
