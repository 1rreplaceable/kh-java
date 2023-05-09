package Interface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Friends f1 = new Friends("뮤지션", "김씨");
		Friends f2 = new Friends("건축가", "이씨");
		Friends f3 = new Friends("개발자", "박씨");
		Friends f4 = new Friends("변호사", "최씨");
		
		ArrayList<Friends> list = new ArrayList<>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		for (Friends friends : list) {
			System.out.print(friends.job+" "+
		                      friends.firstName+" -> ");
			friends.friendComment();
		}
	}
}

//		인터페이스란, 역할을 부여하는 것이다.
//		인터페이스는 추상 메소드로 구성된다.

//		추상 메소드란, 중괄호 내부가 없는 껍데기 메소드이다.
//		인터페이스 정의 및 구현
//		인터페이스 구현 시, implements 키워드를 사용한다.
//		해당 인터페이스(역할)를 구현하는(부여받은) 클래스를 구현체 클래스라 한다.
//		구현체 클래스는 모든 추상 메소드를 오버라이딩(재정의)해야 한다.

//		인터페이스의 장점
//		프로그램 설계의 명확성
//		서로 다른 객체에게 관계성 부여(업캐스팅 가능)
//		한 객체를 다양한 인터페이스로 해석 가능(다형성)
//		// 다형성
//		SmartPhone s1 = new SmartPhone();
//		
//		// 인터페이스
//		//  - 자신이 멤버로 가지고 있는 메서드, 상수에만 접근 할 수 있다.
//		//  - 오버라이딩
//		Alarm a1 = s1;
//		Messenger m1 = s1;
//		Phone p1 = s1;
//		
//// interface 인터페이스명
////  인터페이스의 멤버
////    - 상수 (final)
////	  - 추상메서등만 가능
//// 	  - 객체 생성 X
//// 	  - 하나 인터페이스를 가지고 여러개 객체에 구현할 수 있다. 다형성
////    - 업 캐스팅
//
//interface Alarm {
//
//	// public static final 생략가능
//	int num = 0;
//
//	// 인터페이스 비프음, 음악재생
//	void beep();
//
//	void playMusic();
//}
//
//interface Phone {
//	void call();
//
//	void ring();
//}
//
//interface Messenger {
//	void sendMsg();
//
//	void recieveMsg();
//}
//
//class SmartPhone implements Alarm, Phone, Messenger {
//	// 메서드 오버라이딩(재정의)
//	@Override
//	public void beep() {
//		System.out.println("삐삐삐");
//	}
//
//	@Override
//	public void playMusic() {
//		System.out.println("음악연주중");
//	}
//
//	@Override
//	public void sendMsg() {
//		System.out.println("보내기");
//	}
//
//	@Override
//	public void recieveMsg() {
//		
//	}
//
//	@Override
//	public void call() {
//		
//	}
//
//	@Override
//	public void ring() {
//		
//	}
//
//}
//		Bird f1 = new Bird();
//		Helicopter f2 = new Helicopter();
//		Rocket f3 = new Rocket();
//
//		ArrayList<Flyable> list = new ArrayList<>();
//		list.add(f1);
//		list.add(f2);
//		list.add(f3);
//		for (Flyable flyable : list) {
//			flyable.fly();
//		}
//		int total = 0;
//		
//		Mart a1 = new Mart("족발", 19800);
//		Mart a2 = new Mart("에어팟", 199000);
//		Mart a3 = new Mart("셔츠", 49900);
//		
//		a1.foodSale();
//		a2.electSale();
//		a3.clothSale();
//
//		ArrayList<Mart> list1 = new ArrayList<>();
//		list1.add(a1);
//		list1.add(a2);
//		list1.add(a3);
//		
//		for (Mart mart : list1) {
//			total += mart.total;
//		}
//
//		System.out.println("총합: " + total + "원");