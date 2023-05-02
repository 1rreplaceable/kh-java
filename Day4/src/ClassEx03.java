import java.util.ArrayList;
import java.util.Scanner;

class Pokemon {

	// 포켓몬 정보
	String name;
	double weight;
	String charact;

	// 생성자
	// 특징1: 리턴 타입이 없는 메서드
	// 특징2: 이름이 클래스명과 같다

	// 기본 생성자
	Pokemon() {

	}

	Pokemon(String _name) {
		name = _name;
	}

	// 생성자
	Pokemon(String _name, double _weight, String _charact) {
		name = _name;
		weight = _weight;
		charact = _charact;
	}

	// 싸우는 기능
	void attack() {
		System.out.println(name + "의 펀치");
	}

}

class Member {
	// 정보
	String id, name, email, pw, pw_check, choice;
	
	String gen, me, jo, age;
	public Member(String id, String name, String email, String pw, String pw_check, String choice, String gen) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
		this.choice = choice;
		this.gen = gen;
	}
	// 동작
	public Member(String id, String name, String email, String pw, String pw_check){
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
	}
	void info() {
		
	}
}

public class ClassEx03 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		// 푸린
		Pokemon p1 = new Pokemon(); // 객체를 생성 p1 ->{name:null,
									// weight:0.0, charact:null}
		p1.charact = "헤롱헤롱"; // p1 -> {charact:"헤롱헤롱", weight:0.0,name:null}
		p1.weight = 5.5;
		p1.name = "푸린";

		p1.attack();
		Pokemon p2 = new Pokemon("피카츄", 3.5, "백만볼트");
		p2.attack();
		
		
		while(true) {
			
		}
		
		// new
		// 1. 메모리 공간 heap(힙 영역)
		// 2. 생성자를 호출(실행)
		// 3. ()괄호 안에 값이 있으면 초기화를 진행한다.
		// ()괄호 안에 값이 없으면 기본값 진행한다.
		// 4. 만들어진 객체 어디있는 지 주소값 부여하고
		// 5. 그 주소값을 변수에 저장한다.

		// 생성자
		// - 객체를 만드는 특별한 메서드

		// 역할
		// - 객체 생성(객체를 만드는 것)
		// - 객체의 필드(변수) 값을 설정 하는 것

	}

}
