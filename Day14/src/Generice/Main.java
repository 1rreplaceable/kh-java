package Generice;

import java.util.ArrayList;

class Calc<T> {
	// 두 수를 입력을 해서 계산을 하는 계산기
	T x;
	T y;

}

public class Main {

	public static void main(String[] args) {

		Person<Integer, Double> p1 = new Person<Integer, Double>();
		
		ArrayList<Person> list = new ArrayList<>();
	}
}

//		// 박스 생성
//		Box<Apple> applebox = new Box<Apple>();
//
//		applebox.obj = new Apple[30];
//
//		Cup c1 = new Cup();
//
//		c1.obj = new Coffee();
//		c1.obj = new Water();
//		c1.obj = new Milk();
//
//		Cup<Coffee> cup1 = new Cup<Coffee>();
//
//		cup1.obj = new Coffee();
//		// 매개변수의 타입
//		// E 원소
//		// K key
//		// N 숫자
//		// T 타입
//		// V 값

// 무조건 정수타입의 데이터만 저장할 수 있다.
// Calc<Integer> calc1 = new Calc<Integer>();

// 무조건 실수타입의 데이터만 저장할 수 있다.
// Calc<Double> calc2 = new Calc<Double>();

// 제네릭 <>
// - <> 안에 타입명을 기재한다.
// - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
// - 객체 자료형(타입)을 지정하여 지정된 타입만 객체를 저장하는 기능
// - 클래스 정의시 클래스명<타입>
// - 기본자료형을 받지 않는다.