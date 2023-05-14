package Mouse;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelGame extends JFrame implements MouseWheelListener {

	JPanel panR;
	JPanel panG;
	JPanel panB;
	JPanel panelRGB;
	JPanel panBot;
	int r = 128, g = 128, b = 128;

	JLabel redLabel = new JLabel(r+"");
	JLabel greenLabel = new JLabel(g+"");
	JLabel blueLabel = new JLabel(b+"");
	public MouseWheelGame() {
		setSize(400, 600);
		JPanel panel = new JPanel(new GridLayout(2, 0));

		panR = new JPanel();
		panG = new JPanel();
		panB = new JPanel();
		panelRGB = new JPanel(new GridLayout(0, 3));
		panBot = new JPanel();
		panBot.setBackground(new Color(r, g, b));

		panR.setBackground(new Color(255, 0, 0));
		panG.setBackground(new Color(0, 255, 0));
		panB.setBackground(new Color(0, 0, 255));

		panR.addMouseWheelListener(this);
		panG.addMouseWheelListener(this);
		panB.addMouseWheelListener(this);
		
		redLabel.setForeground(Color.white);
		greenLabel.setForeground(Color.white);
		blueLabel.setForeground(Color.white);
		
		panR.add(redLabel);
		panG.add(greenLabel);
		panB.add(blueLabel);
		
		panelRGB.add(panR);
		panelRGB.add(panG);
		panelRGB.add(panB);
		panel.add(panelRGB);
		panel.add(panBot);

		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseWheelGame();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		int res = e.getWheelRotation();
		// 어떤 객체에서 이벤트가 발생했는지 확인
		Object obj = e.getSource();
		JPanel pan = (JPanel) obj;

		if (pan == panR) {
			if (res == -1) {
				r = --r < 0 ? 0 : r;
			} else {
				r = ++r > 255 ? 255 : r;
			}
			redLabel.setText(r + "");
		} else if (pan == panG) {
			if (res == -1) {
				g = --g < 0 ? 0 : g;
			} else {
				g = ++g > 255 ? 255 : g;
			}
			greenLabel.setText(g + "");
		} else if (pan == panB) {
			if (res == -1) {
				b = --b < 0 ? 0 : b;
			} else {
				b = ++b > 255 ? 255 : b;
			}
			blueLabel.setText(b + "");
		}
		panBot.setBackground(new Color(r, g, b));

	}

}
