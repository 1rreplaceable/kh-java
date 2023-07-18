package com.green.board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BoardDAO {
	public String realpath = "";
	String filename = "boarddata.txt";
	// (1) 새 게시글을 저장해주는 메서드
	/*
	 * 아래 5개의 항목은 입력받을 수 없는 데이터로서 직접 값을 저장해줘야 한다.
	 * 
	 * ① 게시글 번호 : 마지막 게시글 번호에 1을 증가시킨다. ② 작성일 : Date클래스를 활용해 작성일자를 저장한다. ③ ref : 새글의
	 * ref는 현재 최대 ref값에 1을 증가시킨다. ④ reStep : 새글의 reStep의 값은 1이다. ⑤ reLevel : 새글의
	 * reLevel의 값은 1이다.
	 */
	// (2) 전제 게시글 수를 리턴해주는 메서드
	// (3) 오늘 날짜를 문자열로 리턴해주는 메서드
	// (4) 최대 ref 값을 리턴해주는 메서드
	// (5) 전체 게시글 내용을 출력해주는 메서드 <-- 콘솔에서 검토용
	// (6) boardList를 리턴해주는 메서드
	// (7) 게시글 번호를 넘겨받으면 해당 게시글의 인덱스를 리턴해주는 메서드
	// (7) 게시글 번호를 넘겨받아 해당 게시글 정보를 리턴해주는 메서드(게시글 내용 확인하기)
	// (8) 게시글 번호를 넘겨받아 해당 게시글 정보를 리턴해주는 메서드(게시글 내용 수정하기)
	// (9) 게시글의 내용을(이메일,제목,내용) 수정해주는 메서드
	// (10) 게시글 삭제해주는 메서드 : 비밀번호가 일치하면 1을 불일치하면 -1을 리턴해준다.

	public BoardDAO() {
	}

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	// 메모장에 저장되는 모든 내용을 저장하는 리스트
	private ArrayList<BoardDTO> boardlist = new ArrayList<>();

	public ArrayList<BoardDTO> getBoardList() {
		return boardlist;
	}

	public void setBoardlist(ArrayList<BoardDTO> boardlist) {
		this.boardlist = boardlist;
	}

	public void insertBoard(BoardDTO board) {
		boardlist.add(board);
		saveData();
	}

	public int getBoardlistSize() {
		return boardlist.size();
	}

	public void loadData() {
		File file = new File(realpath + filename);
		// realpath + /userdata.txt 파일이 존재한다면

		if (file.exists()) {
			// 기존의 데이터를 지우고 새로 작성한다.
			
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();

				while (line != null) {
					String arr[] = line.split("/");
					BoardDTO board = new BoardDTO(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5],
							arr[6], Integer.parseInt(arr[7]), Integer.parseInt(arr[8]), Integer.parseInt(arr[9]),
							Integer.parseInt(arr[10]));
					boardlist.add(board);
					line = br.readLine();
				}
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void saveData() {

		String data = "";

		for (BoardDTO temp : boardlist) {
			// 텍스트 파일이 문자형식 안에 멤버들을 문자로 변경해서 저장
			data += temp.getNum();
			data += "/";
			data += temp.getWriter();
			data += "/";
			data += temp.getEmail();
			data += "/";
			data += temp.getPassword();
			data += "/";
			data += temp.getSubject();
			data += "/";
			data += temp.getContent();
			data += "/";
			data += temp.getRegDate();
			data += "/";
			data += temp.getReadCount();
			data += "/";
			data += temp.getRef();
			data += "/";
			data += temp.getReStep();
			data += "/";
			data += temp.getReLevel();
			data += "\r\n";
		}

		System.out.println("실제 메모장의 위치 = " + realpath);

		try {
			FileWriter fw = new FileWriter(realpath + filename);
			fw.write(data);
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
