package Thread_synchronized;

public class FamilyThread extends Thread {

	private Washroom wr;	// 인스턴스 변수
	private String who;

	public FamilyThread(String name, Washroom wr) {
		this.wr = wr;
		this.who = name;
	}
	@Override
	public void run() {
		wr.openDoor(who);
	}

}
