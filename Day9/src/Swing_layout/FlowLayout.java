package Swing_layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFlow extends JFrame{
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	
	JPanel panel = new JPanel();
	
	// 화면 클래스 정의 FlowLayout
	MyFlow(){	// 기본생성자
		setSize(400, 200);
		
		// 화면 배치를 설정
		panel.setLayout(new java.awt.FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		add(panel);
		
		setVisible(true);
	}
}



public class FlowLayout {

	public static void main(String[] args) {

		MyFlow my = new MyFlow();
		// 왼쪽에서 오른쪽으로 한줄에 차례대로 정렬
		// 왼쪽에서 실행
		// 오른쪽에서실행
		
		
		// JFrame
		// 하나의 버튼만 올라갈 수 있고 여러가지를 표현
		// 여러가지의 버튼, 게시물, 스크롤 ,,,
		
		// 보조 프레임 (패널)
		// JPanel
	
		
		
	}

}
