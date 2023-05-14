package Menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuColorMain extends JFrame implements ActionListener{

	public MenuColorMain(){
		setTitle("메뉴 구성하기");
		setSize(400, 200);
		
		init();	// 메뉴들에 관한 명령문 저장하는 메서드
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		// 니모닉키
		// 마우스를 사용하지 않고 단축키 메뉴에 접근할 수 있도록
		// 설정을 해주는 것
		
		
		JMenuBar menubar = new JMenuBar();
		// 2. 메뉴 만들기
		JMenu menu01 = new JMenu("File");
		menu01.setMnemonic(KeyEvent.VK_ALT);
		menubar.add(menu01);
		JMenu menu02 = new JMenu("Color");
		menu02.setMnemonic(KeyEvent.VK_UP);
		menubar.add(menu02);

		
		
		// 3. 항목만들기
		JMenuItem item01 = new JMenuItem("파란색");
		// File 메뉴에 붙인다
		menu02.add(item01);
		JMenuItem item02 = new JMenuItem("빨간색");
		menu02.add(item02);
		JMenuItem item03 = new JMenuItem("노란색");
		menu02.add(item03);
		
		item01.addActionListener(this);
		item02.addActionListener(this);
		item03.addActionListener(this);
		// 프레임에 메뉴 설정 setJMenu(메뉴바객체);
		
		setJMenuBar(menubar);
		
	}
	public static void main(String[] args) {
		new MenuColorMain();
			

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JMenuItem item = (JMenuItem)obj;
		
		
		
		switch (item.getText()) {
		case "새 파일":
			System.out.println("새 파일");
			break;
		case "파일 열기":
			System.out.println("파일 열기");
			break;
		case "파란색":
			this.getContentPane().setBackground(Color.BLUE);
			break;
		case "빨간색":
			this.getContentPane().setBackground(Color.RED);
			break;
		case "노란색":
			this.getContentPane().setBackground(Color.YELLOW);
		}
	}

}
