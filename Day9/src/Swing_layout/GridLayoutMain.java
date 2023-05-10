package Swing_layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGrid extends JFrame{

	ArrayList<JButton> btn = new ArrayList<>();
	JPanel panel = new JPanel();
	
	public MyGrid() {
		setSize(400, 200);
		
		// 화면 배치 설정
		panel.setLayout(new GridLayout(5, 5));
		
		// 보조 프레임에 버튼 추가
		for(int i = 0; i < 25; i++) {
		}
		for (JButton jButton : btn) {
			panel.add(jButton);
		}
		
		add(panel);
		
		setVisible(true);
		
		// x눌렀을 때 메인프레임과 자바프로그램 자체 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class GridLayoutMain {

	public static void main(String[] args) {
		new MyGrid();
		
		// GridLayout
		//  - 행과 열을 만들어 격자 형태로 정렬하는 레이아웃
		//  - 모든 컴포넌트들이 동일한 크기를 가지고 프레임에
		//  - 배치된다.
		//  - 엑셀, 바둑판

		// 배열, 반복문
	}
}
