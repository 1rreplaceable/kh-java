import java.util.Random;

import javax.swing.JOptionPane;

class MyThread extends Thread{

	// 스레드를 상속받아서 실행되는 명령문을 작성하는 곳
	int i;
	@Override
	public void run() {
		for(i = 0; i < 10; i++) {
			
			// 프로그램을 지연시키는 함수
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "초");
		}
	}
	
	
}

public class ThreadMulti {

	public static void main(String[] args) {

		Monster m1 = new Monster("오크", 2000);
		Monster m2 = new Monster("오크 전사", 5000);
		
		m1.start();
		m2.start();
		
		System.out.println("메인 끝");
	}

}

//		
//		// 실제 스레드를 정의해서 객체를 생성하면
//		// start() 함수를 실행해야한다. 자동적으로 run()
//		// 메서드가 호출되며 그 안에 있는 내용을 실행하게 된다.
//		
//
//		String msg = JOptionPane.showInputDialog("입력:");
//		System.out.println(msg);
//		MyThread m1 = new MyThread();
//		Car c1 = new Car("소나타", 1000);
//		Car c2 = new Car("그랜저", 3000);
//		
//		
//		// 스레드 시작점 (start())호출
//		m1.start();
//		c1.start();
//		c2.start();
//		