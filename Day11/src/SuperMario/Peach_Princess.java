package SuperMario;

public class Peach_Princess extends Character implements Runnable {

	public Peach_Princess(String name, String 공격명,int time) {
		super(name, 공격명,time);
				
	}
	@Override
	void attack() {
		System.out.println(this.공격명 + "공격합니다.");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			attack();
			Coopa.hp -= 30;			
			System.out.println(Coopa.hp);
		}		
	}	
}