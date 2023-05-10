package Event;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 이벤트를 듣고 있는 리스너 클래스를 생성
class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트 객체에서 getSource() 
		//  이벤트 정보를 가지고 있다. 버튼.목록
		// Object 모든 객체들을 받아서 돌려 줄 수있다.
	
		JButton btn = (JButton)e.getSource();
		
		String text = btn.getText();	
		boolean res = text.equals("왜 눌렀니??");
		
		
		if(res) {
			btn.setText("아! 왜 눌렀냐니까!!");
		}else {
			btn.setText("왜 눌렀니??");
		}
		
		//System.out.println(btn.getText());
		//btn.setText("왜 눌렀니??");		
	}	
}

class MyFrame extends JFrame implements ActionListener {

	// 숫자버튼 16개 
	
	JButton[] btnlist = new JButton[16];
	
	
	MyFrame() {

		setBounds(450, 450, 400, 300);

		JPanel panel = new JPanel();
		add(panel);
		
		// setLayout(행 열 좌우,위아래여백) 
		panel.setLayout(new GridLayout(4,4,10,10));
		
		for(int i = 0; i < btnlist.length; i++) {
			btnlist[i] = new JButton((i+1) + "");
			btnlist[i].addActionListener(this);
			panel.add(btnlist[i]);
			
		}
		
		add(panel);		
		

//		JButton btn1 = new JButton("버튼을 누르세요~");
//		
//		btn1.setFont(new Font("굴림체",Font.BOLD,30));
//		
//		// 버튼에 이벤트를 설정 할것 (버튼에 이벤트를 추가)
//		
//		// MyFrame클래스 안에 
//		btn1.addActionListener(this);
		
		// 객체 생성해서 사용 implements ActionListener
		// 구현해서 자기 자신을 참조하게 만들어도 된다. 
		//btn1.addActionListener(new MyListener());
		
		//panel.add(btn1);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼의 text값을 가지고 와서 
		// 비교 
	}
}
public class Main {

	public static void main(String[] args) {

		new MyFrame();

		// 이벤트
		// - 특정한 상황이 발생했다.
		// - 상태 변화

		// Font font = new Font("굴림체",Font.BOLD,30);

//		btn1.setFont(font);
		//
		//

	}
}