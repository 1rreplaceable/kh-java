package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements Runnable {

	Dimension dimen; // 너비와 높이를 저장하고 있는 클래스
	int x = 0;
	int y = 0;

	MyFrame() {
		setTitle("제목 없는 윈도우");
		setBounds(x, y, 400, 300);

		// 화면의 해상도를 얻어온다. 자동으로 Dimension 객체에 저장한다
		dimen = Toolkit.getDefaultToolkit().getScreenSize();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		while (true) {
			// 윈도우 창을 오른쪽으로 움직 일 것
			if ((x <= dimen.width - 400) && (y <= dimen.height-300)) {
				x++;
				y++;
			}
			// 자바 프로그램창을 넘어간다
			// 넘어가지 말고 멈출것

			// 지연을 시킨다.
			// 스레드가 너무 빠르면 실행했는지 안보인다
			// 일정시간마다 멈추고 동작을 보여줄 수 있게

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setLocation(x, y);
			// 창의 위치만 변경하고 싶을 경우에는 setLocation(좌우, 상하)
			// 좌우 오른쪽 + 왼쪽 -
			// 상하 위 - 아래 +
		}
	}
}
