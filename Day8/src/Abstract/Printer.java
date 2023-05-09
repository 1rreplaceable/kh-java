package Abstract;

// 프린터 기능은 print 꼭 구현해야한다
// 강제성만 준다
// 추상메서드 구현부가 없는 메서드 (비정상적 메서드)
// 추상클래스 추상메서드가 하나라도 있으면 절대 정상적인 클래스X
public abstract class Printer {

	// 기능 print
	abstract void print();

}
class LG_Printer extends Printer {

	@Override
	void print() {
		System.out.println("엘지프린터");
	}
	
}

class Samsung_Printer extends Printer {

	@Override
	void print() {
		System.out.println("삼성프린터");
	}

}