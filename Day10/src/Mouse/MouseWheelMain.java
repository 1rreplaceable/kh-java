package Mouse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelMain extends JFrame implements MouseWheelListener{

	JPanel pan;
	JLabel label;
	int size = 30;
	Random r = new Random();
	public MouseWheelMain(){
		
	
			setTitle("마우스 이벤트");
			setSize(400, 200);
			
			pan = new JPanel();
			label = new JLabel("안녕하세요");
			label.setFont(new Font("굴림체", Font.PLAIN, 30));
			
			addMouseWheelListener(this);
			
			pan.add(label);
			add(pan);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MouseWheelMain();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// 휠이 움직였을 때 이벤트가 발생
		// 마우스가 앞으로 움직임 -1
		// 마우스가 뒤로 움직임 1

		int res = e.getWheelRotation();
		
		//  R G B 랜덤
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		
		pan.setBackground(new Color(red,green,blue));
		if(res == -1) {
			size--;
		}else {
			size++;
		}
		
		label.setFont(new Font("굴림체",Font.PLAIN, size));
	}

}
