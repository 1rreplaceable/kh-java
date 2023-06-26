package com.market.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestWindow extends JFrame {

	// 그래픽 프레임창의 기본설정은 생성자 안에다가 설정
	public GuestWindow(String title) {
		initContainer(title, 0, 0, 1000, 700);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height); // 프레임의 위치, 크기 설정
		setLayout(null); // 프레임 미설정(배치)

		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 16); // 글꼴설정

		// 너비와 높이를 필드로 가지고 있는 클래스
		// 툴킷 클래스
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);

		// 여러 컴포넌트 올리는 보조 프레임 생성
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 260);

		// 아이콘 (고양이)
		// 상대경로. 점으로 현재 폴더 (src)
		ImageIcon imageIcon = new ImageIcon("./images/user.png");
		// 이미지 아이콘 크기, 스타일 setImage()
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH));
		// 라벨
		JLabel iconLabel = new JLabel(imageIcon);
		// userPanel.add() 추가
		userPanel.add(iconLabel);
		// 보조프레임 -> 메인프레임
		add(userPanel);

		// 고객 정보를 입력하세요 -
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 350, 1000, 50);
		add(titlePanel);

		JLabel titleLabel = new JLabel("--고객 정보를 입력하세요--");
		// 라벨을 생성 글꼴 설정
		titleLabel.setFont(ft);
		titleLabel.setForeground(Color.blue); // 글꼴 색상
		titlePanel.add(titleLabel);

		// 이름: 입력받는 text 필드
		JPanel namePanel = new JPanel();
		namePanel.setBounds(0, 400, 1000, 50);
		add(namePanel);

		// 이름이랑 text 객체 각각 생성해서 namePanel 추가
		JLabel nameLabel = new JLabel("이    름:");
		nameLabel.setFont(ft);
		JTextField nameField = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameField);

		// 연락처
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 450, 1000, 50);
		add(phonePanel);

		// 연락처 라벨 연락처 텍스트필드 생성해서 phonePanel 추가
		JLabel phoneLabel = new JLabel("연락처:");
		phoneLabel.setFont(ft);
		JTextField phoneField = new JTextField(10);
		phonePanel.add(phoneLabel);
		phonePanel.add(phoneField);

		// 버튼
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 500, 1000, 50);
		add(btnPanel);

		JButton btnButton = new JButton("쇼핑하기", new ImageIcon("./images/shop.png"));
		btnButton.setFont(ft);
		btnPanel.add(btnButton);
	}
	public static void main(String[] args) {
		new GuestWindow("온라인서점");
}
}
