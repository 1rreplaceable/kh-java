package Inheritance;

class 포켓몬 { // 부모클래스
	// 포켓몬의 공통적인 부분을 묶는다

	String name;
	int hp;
	String type;
	double wei;

	void attack() {
		System.out.println("펀치");
	}
}

class 꼬부기 extends 포켓몬 { // 자식클래스

	void 물대포() {
	}
}

class 어니부기 extends 꼬부기 {
	void 두배는강한물대포() {
	}
}

class 거북왕 extends 어니부기 {
	void 폭포공격() {
	}
}

class 캐릭터 {
	String id;
	int 목숨;
	int 마법력;
	int 민첩;
	int 힘;

	void attack() {
		System.out.println("기본 공격");
	}

}

class 마법사 extends 캐릭터 {

	
}
class 바드 extends 마법사{
	void 힐() {}
}
class 아르카나 extends 마법사{
	void 카드() {}
}
class 전사 extends 캐릭터 {

}

//class Person{
//	String name;
//	int age;
//	int hei;
//	int wei;
//	String blo;
//	void 먹다() {}
//	void 놀다() {}
//	void 자다() {}
//}

//class Captain extends Person{
//	void 방패공격() {}
//}
//
//class Ironman extends Person{
//	void 한손공격() {}
//}
//
//class Hurk extends Person{
//	void 초록공격() {}
//}
//
//class widow extends Person{
//	void 암살() {}
//}

public class InheritanceEx01 {

	public static void main(String[] args) {
		
		
		꼬부기 서희꼬부기 = new 꼬부기();
		어니부기 서희어니부기 = new 어니부기();
		
		서희꼬부기.hp = 100;
		서희꼬부기.name = "꼬부기";
		
		

		// 상속
		// - 기존 클래스를 확장하여 새 클래스를 만든다
		// - 물려받는다
		// - 공통되는 클래스들의 내용을 묶는다
		
		// class 클래스명 extends 기존클래스명
		
		// 장점
		// - 코드 중복 제거
		// - 프로그램 확장성 좋다
		
		// 히어로 클래스 상속
		// 캡틴 => 방패공격()
		// 아이언맨 => 한손공격()
		// 헐크 => 초록공격()
		// 위도우 => 암살()

		// Person
		// 이름, 나이, 키, 몸무게, 혈액형
		// 먹다, 놀다, 잔다

	}

}
