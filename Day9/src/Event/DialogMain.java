package Event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MyDialog extends JFrame implements ActionListener {

	JButton btn1 = new JButton("에러");
	JButton btn2 = new JButton("정보");
	JButton btn3 = new JButton("경고");
	JButton btn4 = new JButton("질문");
	JPanel pan = new JPanel();

	public MyDialog() {

		setBounds(100, 100, 500, 400);

		// 각각의 버튼에 리스너 추가
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		pan.add(btn4);

		add(pan);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btn1) {
			//JOptionPane.showMessageDialog(this, "팝업창 대화상자", "에러", JOptionPane.ERROR_MESSAGE);
			if (btn1.getBackground()==Color.blue) {
				btn1.setBackground(Color.white);
			}else {
			btn1.setBackground(Color.blue);
			}
		} else if (obj == btn2) {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "정보", JOptionPane.INFORMATION_MESSAGE);
		} else if (obj == btn3) {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "경고", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "팝업창 대화상자", "경고", JOptionPane.QUESTION_MESSAGE);
		}

	}

}

public class DialogMain {

	public static void main(String[] args) {
		new MyDialog();
	}
}