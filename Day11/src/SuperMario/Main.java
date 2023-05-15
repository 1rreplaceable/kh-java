package SuperMario;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Mario mario = new Mario("마리오", "펀치", 1000);
		Marigee marigee = new Marigee("마리지", "폭탄", 500);
		Peach_Princess prin = new Peach_Princess("피치공주", "물건던지기", 1000);
		
		// Thread 클래스 도움
		// 다른 상속을 받은 클래스들은 Thread한테 객체생성시
		// 인터페이스로 구현한 run() 들어있는 객체를 넘겨준다
		Thread mariot = new Thread(mario);
		Thread marigeet = new Thread(marigee);
		Thread print = new Thread(prin);
		
//		ArrayList<Thread> list = new ArrayList<>();
//		list.add(mariot);
//		list.add(marigeet);
//		list.add(print);
//		
		mariot.setDaemon(true);
		marigeet.setDaemon(true);
		print.setDaemon(true);
		
		mariot.start();
		marigeet.start();
		print.start();

		
		while(true) {
			if(Coopa.hp <= 0) {
				System.out.println("쿠파죽음");
				break;
			}
		}
		
		
		// 마리오 클래스,마리지 클래스,피치공주,버섯돌이
		// 이름, 목숨, 기본 레벨 10
		
		// 마리오는 300 펀치공격! (35씩 감소) 1초에 한번씩 
		// 마리지는 300 폭탄공격! (30씩 감소) 0.5초에 한번씩
		// 피치공주는 300 물건 던지기 공격! (30씩 감소) 1초에 한번씩
		// 버섯도리는 300 버섯던지기 공격! (35씩 감소) 1.5초에 한번씩
		
		// 쿠파! 쿠파의 목숨은 인스턴스들이 접근을 할 수 있도록
		// 이름,목숨1000,기본레벨 30
		//  쿠파는 불기둥 공격! 공격시간 랜덤  30씩 
		// 공유!
		
		// 마리오가 쿠파 965
		// 피치    쿠파 935
		
		
		
		
		
		
	}
}
