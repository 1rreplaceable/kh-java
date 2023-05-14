package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame implements ItemListener, ActionListener, KeyListener {

	JTextField t1, t2;
	JTextArea area; // 여러 줄을 입력할 수 있는 클래스
	JButton cal, reset; // 버튼 계산과 리셋
	JComboBox<String> cb; // 드롭다운 클래스

	public Test() { // 생성자 메인프레임 설정
		setTitle("원 넓이 구하기");
		setLayout(new BorderLayout(10, 10));
		setSize(400, 300);

		showNorth();
		showCenter();
		showSouth();

		// 전역변수 생성자 안에 이벤트리스너 추가
		t1.addKeyListener(this);
		cal.addActionListener(this);
		reset.addActionListener(this);
		cb.addItemListener(this);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	void showNorth() {
		JPanel pan1 = new JPanel(); // 반지름 필드
		JPanel pan2 = new JPanel(); // 원의 넓이 필드
		JPanel panel = new JPanel(new GridLayout(2, 0));

		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");

		t1 = new JTextField(10);
		t2 = new JTextField(10);

		// 보여지긴 하지만 비활성화
		t2.setEditable(false);

		// 추가
		pan1.add(l1);
		pan1.add(t1);
		pan2.add(l2);
		pan2.add(t2);

		// 두개를 묶어주는 panel 추가
		panel.add(pan1);
		panel.add(pan2);

		add(panel, BorderLayout.NORTH);

	}

	void showCenter() {
		// panel.setBackground(Color.black);
		// 여러 줄을 입력받는 공간

		JPanel panel = new JPanel();
		area = new JTextArea(10, 20);
		area.setText("이 영역에 원의 넓이를 \n 계산하는 과정");
		area.setEditable(false);
		area.setForeground(Color.red);

		panel.add(area);
		add(panel, BorderLayout.CENTER);
	}

	void showSouth() {
		String[] color = { "red", "blue" };
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

		cal = new JButton("계산");
		cb = new JComboBox(color);
		reset = new JButton("리셋");

		// 이벤트 추가
		cal.addActionListener(this);

		panel.add(cal);
		panel.add(cb);
		panel.add(reset);

		add(panel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == cal) {

			// t1 값이 있는지 없는지 확인
			// 1. getText()
			// 2. inEmpty() 비어있으면 true, 아니면 false
			// 비어있다면 "반지름을 입력하세요"
			// 1. 텍스트필드에 값을 가지고 와야된다.
			if (t1.getText().isEmpty()) {
				area.setText("반지름을 입력하세요");
			} else {
				String s = t1.getText();
				// 2. 변환 실수값으로
				// 문자 -> 실수로 변경
				double radius = Double.parseDouble(s);
				double result = radius * radius * 3.14;

				// 3. 계산된 결과를 결과로 수정
				t2.setText("" + result);
				String resultText = radius + "*" + radius + "* 3.14 = " + result;
				area.setText(resultText);
			}

		} else if (obj == reset) {
			t1.setText(null);
			t2.setText(null);
			area.setText(null);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		// 아이템 배열로 저장 했다.
		// 인덱스
		// getSelectedIndex() 선택된 index번호를 가져온다
		int index = cb.getSelectedIndex();

		if (index == 0) {
			area.setForeground(Color.red);
		} else {
			area.setForeground(Color.blue);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == 10) {
			if (t1.getText().isEmpty()) {
				area.setText("반지름을 입력하세요");
			} else {
				String s = t1.getText();
				double radius = Double.parseDouble(s);
				double result = radius * radius * 3.14;
				t2.setText("" + result);
				String resultText = radius + "*" + radius + "* 3.14 = " + result;
				area.setText(resultText);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}

//		setTitle("원 넓이 구하기");
//		setSize(400, 300);
//		JPanel mainPanel = new JPanel();
//		
//		JPanel radiusPanel = new JPanel();
//		radiusPanel.setBounds(0, 0, 400, 30);
//		JLabel radiusLabel = new JLabel("원의 반지름");
//		JTextField radiusText = new JTextField(10);
//		radiusPanel.add(radiusLabel);
//		radiusPanel.add(radiusText);
//		
//		JPanel areaPanel = new JPanel();
//		areaPanel.setBounds(0, 50, 200, 30);
//		JLabel areaLabel = new JLabel("원의 넓이");
//		JTextField areaText = new JTextField("31400.0", 10);
//		areaPanel.add(areaLabel);
//		areaPanel.add(areaText);
//		
//		JPanel calcPanel = new JPanel();
//		areaPanel.setBounds(0, 150, 400, 50);
//		JTextArea calcText = new JTextArea();
//		calcPanel.add(calcText);
//		
//		JPanel btnPanel = new JPanel();
//		btnPanel.setBounds(0, 350, 200, 30);
//		JButton calcbtn = new JButton("계산");
//		String[] color = {"red", "blue", "black"};
//		JComboBox colors = new JComboBox(color);
//		JButton resetbtn = new JButton("리셋");
//		btnPanel.add(calcbtn);
//		btnPanel.add(colors);
//		btnPanel.add(resetbtn);
//		
//		mainPanel.add(radiusPanel);
//		mainPanel.add(areaPanel);
//		mainPanel.add(calcPanel);
//		mainPanel.add(btnPanel);
//		
//		add(mainPanel);
//		
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);