package Override;

public class OverrideEx {

	public static void main(String[] args) {

		// 마법사
		Wizard w1 = new Wizard();
		w1.fireball();

		// 전직 마법사
		GreatWizard g1 = new GreatWizard();
		g1.fireball();

		// 동물
		Animal a1 = new Animal();
		a1.cry();
		Cat c1 = new Cat();
		c1.cry();
		Dog d1 = new Dog();
		d1.cry();

		Point p2 = new Point();
		p2.info();
		System.out.println(p2);

		// toString()
		// 특별한 메서드
		// 함수 호출 하지 않아도 System.out.println()
		// 호출하면 자동적으로 toString 호출되도록
		// 약속이 되어있다.

		// 메서드 오버라이딩
		// - 부모클래스의 메서드를 자식클래스가 재정의
		// - 부모클래스 메서드 이름을 자식클래스가 똑같이 만들어서
		// 사용하는 것

		// 오버라이딩
		// - 함수이름 똑같아야함
		// - 매개변수 똑같아야함
		// - 리턴타입 똑같아야함

		// 메서드 오버로딩
		// - 함수이름 여러개 사용하는 기능

	}

}
