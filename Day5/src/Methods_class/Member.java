package Methods_class;

import java.util.Random;
import java.util.Scanner;

// 클래스를 이용해서 값을 넘겨주고 받는 프로그램

class Objection{
	String area;
	int pay;
	
	public Objection(String area, int pay) {
		
		this.area = area;
		this.pay = pay;
	}
}

public class Member {

	public static void trainPrint(Objection k) {
		System.out.println("목적지: "+k.area + " 운임비: "+k.pay);
	}

	
	
	public static void main(String[] args) {
		
		Objection h1 = new Objection("수원", 3000);
		Objection h2 = new Objection("광주", 35000);
		Objection h3 = new Objection("대전", 25000);
		
		// 내가 만든 클래스로 여러개를 저장
		Objection[] list = new Objection[3];
		list[0] = h1;
		list[1] = h2;
		list[2] = h3;
		System.out.println(list[0].area.equals(h1.area));
		System.out.println(list[1].area.equals(h2.area));
		System.out.println(list[2].area.equals(h3.area));
	}

}
//		// Objection 클래스(목적지 클래스)
//		// String 목적지, int 운임비
//		
//		// 대구 25000
//		// 부산 40000
//		
//		// 새로운 변수를 각각 만들어서
//		// trainPrint
//		// 매개변수 objection 타입의 변수 저장
//		// return void
//		System.out.println("----- 예매 정보 -----");
//		Objection area1 = new Objection();
//		area1.area = "대구";
//		area1.pay = 25000;
//		trainPrint(area1);
//		Objection area2 = new Objection();
//		area2.area = "부산";
//		area2.pay = 40000;
//		trainPrint(area2);
//		
//public static void moviePrint(Movie m) {
//	System.out.println("영화 제목:" + m.movie_name);
//	System.out.println("영화 시간:" + m.movie_time);
//
//}
//
//class User {
//
//	int id;
//	int pw;
//}
//
//class Movie {
//	String movie_name; // 영화명
//	String movie_time; // 상영시간
//}

////웅남이 98분
//		Movie m1 = new Movie();
//		m1.movie_name = "웅남이";
//		m1.movie_time = "98분";
//		moviePrint(m1);
//		// 존윅4 130분
//		Movie m2 = new Movie();
//		m2.movie_name = "존윅4";
//		m2.movie_time = "130분";
//		moviePrint(m2);
//public static void info(User _u1) {
//	System.out.println("---kh user---");
//	System.out.println(_u1.id);
//	System.out.println(_u1.pw);
//}
//public static void funct1(Random _r) {
//	
//}
//
//public static void funct2(Scanner _in) {
//	
//}
//
//// 자바가 만들어준 api
//Random r = new Random();
//Scanner in = new Scanner(System.in);
//
//// 내가 만든 클래스
////User 1111 2222
//User u1 = new User();
//u1.id = 1111;
//u1.pw = 2222;
//
//info(u1);
//public static Objection objectInput() {
//	Scanner in = new Scanner(System.in);
//	System.out.println("목적지와 운임비를 입력>");
//	String area = in.next();
//	int pay = in.nextInt();
//	
//	Objection o = new Objection();
//	o.area = area;
//	o.pay = pay;
//	
//	return o;
//}
//Objection o1 = objectInput();
//trainPrint(o1);