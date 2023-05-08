package Override;

// 마법사 파이어볼 데미지10
public class Wizard {

	void fireball() {
		System.out.println("데미지 10씩 준다");
	}
}

// 마법사가 전직 데미지를 30씩

class GreatWizard extends Wizard{

	@Override
	void fireball() {
		System.out.println("데미지 30씩 준다");
	}
	
}
