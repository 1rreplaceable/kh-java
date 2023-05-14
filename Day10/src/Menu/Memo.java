package Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Memo extends JFrame{

	public Memo() {
		setTitle("제목 없음 - Windows 메모장");
		setSize(800, 800);
		
		memojang();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void memojang() {
		JMenuBar menubar = new JMenuBar();
		// 2. 메뉴 만들기
		JMenu menu01 = new JMenu("파일(F)");
		menubar.add(menu01);
		JMenu menu02 = new JMenu("편집(E)");
		menubar.add(menu02);
		JMenu menu03 = new JMenu("서식(O)");
		menubar.add(menu03);
		JMenu menu04 = new JMenu("보기(V)");
		menubar.add(menu04);
		JMenu menu05 = new JMenu("도움말(H)");
		menubar.add(menu05);
		
		JMenuItem item01 = new JMenuItem("새로 만들기(N)");
		menu01.add(item01);
		JMenuItem item02 = new JMenuItem("새 창(W)");
		menu01.add(item02);
		JMenuItem item03 = new JMenuItem("열기(O)");
		menu01.add(item03);
		
		JMenuItem item04 = new JMenuItem("실행 취소(U)");
		menu02.add(item04);
		JMenuItem item05 = new JMenuItem("잘라내기(T)");
		menu02.add(item05);
		JMenuItem item06 = new JMenuItem("복사(C)");
		menu02.add(item06);
		
		JMenuItem item07 = new JMenuItem("자동 줄 바꿈(W)");
		menu03.add(item07);
		JMenuItem item08 = new JMenuItem("글꼴(F)");
		menu03.add(item08);
		
		JMenuItem item09 = new JMenuItem("확대하기/축소하기");
		menu04.add(item09);
		JMenuItem item10 = new JMenuItem("상태표시줄(S)");
		menu04.add(item10);
		
		
		JMenuItem item11 = new JMenuItem("도움말 보기(H)");
		menu05.add(item11);
		JMenuItem item12 = new JMenuItem("피드백 보내기(F)");
		menu05.add(item12);
		JMenuItem item13 = new JMenuItem("메모장 정보(A)");
		menu05.add(item13);
		
		Font ft = new Font("굴림체", Font.PLAIN, 25);
		JTextArea memo = new JTextArea("");
		memo.setBackground(Color.WHITE);
		memo.setFont(ft);
		
		setJMenuBar(menubar);
		add(memo);
	}
	public static void main(String[] args) {
		new Memo();
	}

}
