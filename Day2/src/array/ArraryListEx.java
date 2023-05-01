package array;

import java.util.ArrayList;

public class ArraryListEx {

	public static void main(String[] args) {

		// 공간을 자동으로 추가 삭제하고 조회
		// 배열을 쓰는데 편하게 여러개의 데이터를 저장하고 싶다
		// ArrayList<자료형>

		// 정수를 저장하고 싶다
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);

		// 출력
		System.out.println(list1);

		System.out.println("길이: " + list1.size());
		list1.remove(1);
		System.out.println("길이: " + list1.size());
		System.out.println(list1);

		// 실수를 저장하는 배열
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(1.253);
		list2.add(101.2456);
		list2.remove(list2.indexOf(1.253));
		System.out.println(list2);

		// 문자열 저장하는 배열
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("김연아");
		list3.add("강동원");
		list3.add("진");
		list3.remove(list3.indexOf("진"));
		System.out.println(list3);
		list3.clear();
		System.out.println(list3);

	}

}
