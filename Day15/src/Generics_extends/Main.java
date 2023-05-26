package Generics_extends;

import java.util.ArrayList;

class Unit {
}

class Stu extends Unit implements Readable, Closeable {
	String name;
}

class Stu2 implements Closeable{
	String name;
}

// 타입제한을 할 때 클래스랑 인터페이스가 같이 있으면
// 클래스명부터 작성 클래스명 & 인터페이스

class School<T extends Unit & Closeable & Readable> {

}

// T 제네릭 타입을 정하고 제한을 주지 않으면 이상한
// 객체 타입으로 선언된다

// 계산기는 숫자 정수, 실수
class Calc<T extends Number, U extends Number> {

	void add(T a, T b) {
	}

	void min(T a, T b) {
	}

	void mul(T a, T b) {
	}

	void div(T a, T b) {
	}
}
// 와일드카드

//class Calc2<T super Number>{
//	
//	void add(T a, T b) {}
//	void min(T a, T b) {}
//	void mul(T a, T b) {}
//	void div(T a, T b) {}
//}

public class Main {

	public static void main(String[] args) {

		// 타입 한정 키워드 extends
		// <> extends 쓰이면 관련있는 타입들만 객체 타입으로
		// 지정할 수 있다.
		// Number 클래스를 상속받은 타입들은 객체 타입지정이 가능하다.

//		Calc<Number> cal1 = new Calc<>();
//		Calc<Integer> cal2 = new Calc<>();
//		Calc<Double> cal3 = new Calc<>();
//
//		// Calc<Stu> cal4 = new Calc<>(); 에러
//
//		ArrayList<Stu> list = new ArrayList<>();
//		list.add(new Stu());
//		list.add(new Stu2());

	}
}
