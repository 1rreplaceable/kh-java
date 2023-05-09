package Interface;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
	}

}

class Helicopter implements Flyable {

	@Override
	public void fly() {
		System.out.println("<헬기>가 플로펠러를 힘차게 돌리며 날아갑니다!");
	}

}

class Rocket implements Flyable {

	@Override
	public void fly() {
		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
	}

}
