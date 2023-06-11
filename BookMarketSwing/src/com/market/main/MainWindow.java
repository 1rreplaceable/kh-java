package com.market.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{
	
	JPanel mMenuJPanel;
	

	public MainWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height);
		
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height); // 프레임의 위치, 크기 설정
		setLayout(null); // 프레임 미설정(배치)

		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 16); // 글꼴설정

		// 너비와 높이를 필드로 가지고 있는 클래스
		// 툴킷 클래스
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);
		
		
		// 메뉴 버튼 표시를 위한 보조프레임 설정 및 출력
		mMenuJPanel = new JPanel();
		
		// setSize(x, y) -> 컴포넌트들의 위치 변경
		// setLocation(width, height) -> 창의 너비 높이
		mMenuJPanel.setBounds(x, y, width, height);
		
		// 첫번째 고객 정보 확인하기
		
		JPanel menuPanel1 = new JPanel();
		menuPanel1.setBounds(0, 80, 900, 300);
		add(menuPanel1);
		
		JButton btn1 = new JButton("고객 정보 확인하기", new ImageIcon("./images/1.png"));
		menuPanel1.add(btn1);
		JButton btn2 = new JButton("장바구니 상품 목록 보기", new ImageIcon("./images/2.png"));
		menuPanel1.add(btn2);
		JButton btn3 = new JButton("장바구니 비우기", new ImageIcon("./images/3.png"));
		menuPanel1.add(btn3);
		JButton btn4 = new JButton("장바구니 항목 추가하기", new ImageIcon("./images/4.png"));
		menuPanel1.add(btn4);
		JButton btn5 = new JButton("장바구니의 항목 수량 줄이기", new ImageIcon("./images/5.png"));
		menuPanel1.add(btn5);
		JButton btn6 = new JButton("장바구니의 항목 삭제하기", new ImageIcon("./images/6.png"));
		menuPanel1.add(btn6);
		JButton btn7 = new JButton("주문하기", new ImageIcon("./images/7.png"));
		menuPanel1.add(btn7);
		JButton btn8 = new JButton("종료", new ImageIcon("./images/8.png"));
		menuPanel1.add(btn8);
		JButton btn9 = new JButton("관리자", new ImageIcon("./images/9.png"));
		menuPanel1.add(btn9);
	}
	public static void main(String[] args) {
		new MainWindow("온라인서점", 0, 0, 1000, 700);
	}

}
