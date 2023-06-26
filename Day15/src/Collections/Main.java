package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void info(ArrayList<String> arr) {
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> list2 = new LinkedList<>(); 
		
		// add() : 맨 마지막에 추가
		// 기존 데이터를 복사해서 새로운 배열을 만들어서 저장
		ArrayList<String> list = new ArrayList<>();
		list.add("이서희");
		list.add("강동원");
		list.add("이준기");
		
		System.out.println(list);
		// 메서드를 이용해서 안에 있는 데이터를 출력
		// 이름( ** )
		
		
		
		
		
		// 컬렉션 - 여러 객체를 모아놓은 것
		// 프레임웍 - 표준화, 정형화된 체계적인 프로그래밍 방식
		// 컬렉션 프레임워크
		//  - 다수의 객체를 다루기 위한 표준화된 프로그래밍 방식
		//  - 데이터를 쉽고 편하게 다룰 수 있도록 미리 만들어놓은 자료형
		
		// 배열 타입의 자료구조
		// ArrayList 클래스
		
		// 컬렉션 (인터페이스로 나눠져있다.)
		//  - 3개로 정리한 계열들의 공통적인 메서드를 모아놓은 인터페이스
		
		// List
		//  - 순서가 있는 데이터의 집합, 자료형 (인덱스번호)
		//  - 데이터 중복을 허용한다
		
		// set
		//  - 순서가 없는 데이터의 집합, 자료형 (인덱스번호x)
		//  - 로또 중복적인 내용을 제거해야될 때 구현
		
		// map
		//  - key, value 을 이용해서 쌍으로 데이터의 집합, 자료형
		//  - 순서가 없으며, 키는 (리스트 인덱스) 중복허용x, 값은 중복허용
	}
}