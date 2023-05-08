package Java_Api;

import java.util.*;

import A.Main;

class B extends Main{
	
}
public class ApiEx extends Main{

	public static void main(String[] args) {

		ApiEx a = new ApiEx();
		
//		Main a1 = new Main();
//		
//		System.out.println(a1.a);
//		a1.a = 1000;
//		B b = new B();
//		b.
//		자바 API란
//		자바 API란 미리 만들어진 도구(클래스)이다.
//		자바 API는 패키지를 통해 제공된다.
//		패키지
//		패키지란, 소스코드를 담는 디렉터리이다.
//		패키지는 관련 코드를 묶거나, 같은 이름의 코드를 구분하기 위해 사용한다.
//		자바 API 사용 예
//		자바 API 문서 또는 구글링을 통해 API를 검색한다.
//		학습 시 많이 사용하는 API로 Math, Random, ArrayList 등이 있다.
		
		
		// 자바 api
		//  - 프로그램을 만들기 위한 도구
		//  - 이를 사용하면 더 편리한 프로그래밍이 가능하다
		//  - 자바API 패키지로 제공된다
		
		// 패키지
		//  - 디렉터리(폴더)
		//  - 중복적인 메서드, 변수, 클래스명
		
		// import 
		//  - 객체의 위치를 컴파일한테 알려준다
		
		// 역할
		//  - 관련 코드들을 하나로 묶어서 관리를 수월하게 한다.
		
		// Math 클래스

		int r = (int)(Math.random()*6)+1;
		System.out.println(r);
		
		// 절대값
		double a1 = Math.abs(-9.81);
		System.out.println(a1);
		
		// max, min
		double m = Math.max(3.14, 12.7);
		System.out.println(m);
		
		int[] random6 = new int[6];
		
		for (int i =0; i<100; i++) {
			int num = (int)(Math.random()*6)+1;
			random6[num-1]++;
		}
		for(int i =0; i<random6.length; i++) {
			System.out.println((i+1)+"번 개수: "+random6[i]);
		}
	}

}
