package Variable;

public class GalaxyTest {

	public static void main(String[] args) {

		// 스마트폰 일련번호
		Galaxy g1 = new Galaxy();
		Galaxy g2 = new Galaxy();
		Galaxy g3 = new Galaxy();
		Galaxy g4 = new Galaxy();
		Galaxy g5 = new Galaxy();

		Galaxy[] gs = new Galaxy[5];
		gs[0] = g1;
		gs[1] = g2;
		gs[2] = g3;
		gs[3] = g4;
		gs[4] = g5;

		for (Galaxy galaxy : gs) {
			galaxy.print();
		}
		System.out.println("Galaxy 객체의 개수: " + Galaxy.count);
	}

}

class Galaxy {

	String serialNum; // 일련번호

	/* 1. 해당 필드를 클래스 변수화 하세요. */
	static int count = 0;

	// 생성자
	Galaxy() {
		count++;
		char c = randomAlphabet(); // A ~ Z 중 택1
		serialNum = String.format("%c-%d", c, count);
	}

	// 메소드
	char randomAlphabet() {
		return (char) ('A' + Math.random() * 26); // A to Z
	}

	void print() {
		System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
	}
}