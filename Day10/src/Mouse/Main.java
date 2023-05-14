package Mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements MouseListener{

	JPanel pan;
	
	public Main() {
		setTitle("마우스 이벤트");
		setSize(400, 200);
		
		pan = new JPanel();
		
		// 실제 메인프레임에 이벤트가설정
		addMouseListener(this);
		
		add(pan);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new Main();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		pan.setBackground(Color.cyan);
	}


	@Override
	public void mousePressed(MouseEvent e) {
		pan.setBackground(Color.green);
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		pan.setBackground(Color.pink);
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		pan.setBackground(Color.magenta);
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		pan.setBackground(Color.orange);
		
	}

}
