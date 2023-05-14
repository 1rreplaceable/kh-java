package Key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 내부클래스
//  클래스가 클래스 안으로 들어간다
//  멤버 변수, 멤버메서드
class MyAdapter extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == 10) { // KeyEvent.VK_ENTER
			
		}
	}
}

public class Main extends JFrame implements KeyListener{

	
	Main(){
		// Adapter 클래스
		//  - 여러개의 인터페이스를 오버라이딩 할 때 실제 사용되는 메서드
		//    원하는 인터페이스만 오버라이딩해서 사용할 수 있게 만든 어댑터 클래스
		//  - 인터페이스의 메서드가 하나인 경우에는 어댑터 클래스가 없다
		setTitle("키 어댑터");
		setSize(400, 200);
		
		JLabel l = new JLabel("키 어댑터",JLabel.CENTER);
		JTextField t = new JTextField(10);
		
		// 보더레이아웃 add(위치, 컴포넌트)
		// "North" 문자열로 주고 앞 글자 무조건 대문자
		add("North", t);
		add("Center", l);
		
		t.addKeyListener(this);
		
		addKeyListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// key 이벤트
	// 사용자가 키를 입력할 때 발생하는 이벤트
	
	public static void main(String[] args) {
		new Main();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("타이핑 할 때");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// e.getKeyChar() 아스키코드값을 기점으로 문자표시
		System.out.println(e.getKeyCode());		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키를 땔 때");		
	}

}
