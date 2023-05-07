package Inheritance_Car;

public class Main {

	public static void main(String[] args) {

		// 현대자동차
		// 브랜드명
		// 차명
		// 최대속력
		// 등급
		// 색상

		// 기능
		// 주행한다
		// 브레이크
		// 후진한다

		// 아반떼 흰색 소형 현대자동차 200
		// 그랜저 회색 대형 현대자동차 260
		// 제네시스 검은색 대형 현대자동차 300
		// 안마기능()

		Avante c1 = new Avante();
		c1.carName = "아반떼";
		c1.carColor = "흰색";
		c1.carSize = "소형";
		c1.maxSpeed = 200;

		Grandjer c2 = new Grandjer();
		c1.carName = "그랜저";
		c1.carColor = "회색";
		c1.carSize = "대형";
		c1.maxSpeed = 260;

		Genesis c3 = new Genesis();
		c1.carName = "제네시스";
		c1.carColor = "검은색";
		c1.carSize = "대형";
		c1.maxSpeed = 300;
	}

}
