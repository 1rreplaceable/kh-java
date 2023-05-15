
// 몬스터의 이름, 몇초마다 한번씩 출몰한다
// 오크		2초마다 한번씩
// 오크 전사	5초마다 한번씩

public class Monster extends Thread{
	String name;
	int time;
	public Monster(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			// 프로그램을 지연시키는 함수
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "출몰합니다.");
		}
	}
	
}
