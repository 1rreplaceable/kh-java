package Variable;

class Hotel {

	static String master_key = "카드";
	
	// 투숙객 마다 방번호랑 예약한 사람의 이름
	static Hotel_cust[] list = new Hotel_cust[10];	
	
	// 투숙객들의 정보를 교환
	static void ch() {}
}

class Hotel_cust {

	// 클래스 객체가 생성 될 때마다 변수를 만든다.
	// 객체 안에 변수가 여러개 생긴다
	// 인스턴스 변수
	String name; // 이름
	int roomNumber; // 방번호
}
// 변수의 크기가 유동적(크거나 작거나 변경이 많이 된다)
// heap 영역 - 프로그램이 시작하고 나서 변수를 선언

// stack 영역 - 프로그램 시작 전에 변수를 저장하는 공간
//  변수의 크기가 고정되어있음. 중괄호 시작되고 끝나면 삭제된다

// static 영역
//  프로그램이 끝날 때까지 전역변수 데이터가 유지
//  중복적인 이름은 쓸 수 없다

public class Main {

	public static void main(String[] args) {

		Hotel_cust one1=  new Hotel_cust();
		one1.roomNumber = 1001;
		
		Hotel_cust one2=  new Hotel_cust();
		one2.roomNumber = 1002;
		
		// static 객체를 생성할 필요 없다
		// 접근방법
		Hotel hotel = new Hotel();

		System.out.println(hotel.master_key);
	}

}

class Mon{
	static int MAX_hp;
	int hp;
}
