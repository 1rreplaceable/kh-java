package Interface;

public class Hulk implements Hero {
	private int hp = Hero.MAX_HP;

	@Override
	public void attack() {
		System.out.println("눈에 보이는 건 다 던지기");
	}

	@Override
	public void heal(int portion) {
		hp += portion;

		if (hp > Hero.MAX_HP) { // 고정체력보다 많이차면 다시 고정값으로 저장
			hp = Hero.MAX_HP;
		}
		System.out.println("헐크가 체력을 " + portion + "만큼 회복했습니다");
	}
	
	void jump() {
		System.out.println("헐크가 엄청 높게 점프합니다");
	}

}
