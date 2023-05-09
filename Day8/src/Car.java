
// 상속은 물려만준다
// 강제성이 없다

public abstract class Car { // 세상에 존재하는 자동차

	String color;
	int door;

	// 강제성 무조건 오버라이딩
	abstract void drive();
	abstract void stop();
	abstract void 와이퍼();
	
	// 비강제성
	void 썬루프() {}
	void 블루투스() {}
	void 엉따() {}
}

class FireEngine extends Car {
	
	@Override
	void drive() {
		water();
	}
	
	void water() {
		System.out.println("물 뿌리는 기능");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub
		
	}
}

class Ambulance extends Car {
	
	@Override
	void stop() {
		siren();
	}

	void siren() {
		System.out.println("환자 이송");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub
		
	}
}

// default 제어자
// 생략이 가능하다
// 같은 패키지에서만 접근이 가능하다
//	값을 변경, 객체를 생성하거나, 메서드를 호출