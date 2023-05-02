import java.util.ArrayList;
import java.util.Scanner;

class Account {

	// 정보
	String id;
	String pw;

	// 기본생성자
	Account() {
	}
	// 객체를 생성할 때 빈 객체로 저장된다

	// 생성자
	// 객체를 생성할 때 원하는 값으로 저장된다
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}

class Naver {

	// 필드(정보)
	// 고객들의 정보를 저장하는 타입 <>
	ArrayList<Account> acclist = new ArrayList<>();
}

// 고객의정보
class User {
	//고객정보
	String id;
	String pw;
	String phone;
	String email;
	
	// 예매정보를 저장하는 변수
	Reservation res = new Reservation();
	
	
	public User() {}

	void info() {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(phone);
		System.out.println(email);
	}

}

// 예매정보
class Reservation {
	
	String movie_name;	//영화이름
	String movie_time;	//영화시간
	int number_people;	//인원수
	String movie_room;	//몇관인지
	public Reservation() {}
	void info() {
		System.out.print(" 영화이름: " + movie_name);
		System.out.print(" 영화시간: " +movie_time);
		System.out.print(" 인원 수: " +number_people);
		System.out.println(" 몇 관: " +movie_room);
	}
	
}

// 영화예매
class CGV {

	// 고객들의 정보를 저장하는 ArrayList
	// userList
	// <> 내가 만든 고객 클래스 타입
	ArrayList<User> userList = new ArrayList<>(); 
	
	// user정보는 본인
	// 웅남이 98분 2명 5관
	
	//각각의 객체들을 만들 때 생성자 이용
	
}

public class ClassEx04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		CGV ticket = new CGV();		
		User user1 = new User();
		
		while(true) {
			System.out.println("---cgv---");
			System.out.println(" 1. 영화예매");
			System.out.println(" 2. 영화예매 조회");
			System.out.println(" 3. 영화예매 삭제");
			System.out.println(" 0. 영화예매 종료");
			System.out.println(ticket.userList.size());
			
			int sel = in.nextInt();
			switch(sel) {
			
			case 1:
				in.nextLine();
				
				System.out.println("고객정보를 입력>");
				System.out.println("id:");
				user1.id = in.nextLine();
				System.out.println("pw:");
				user1.pw = in.nextLine();
				System.out.println("phone:");
				user1.phone = in.nextLine();
				System.out.println("email:");
				user1.email = in.nextLine();
				
				ticket.userList.add(user1);
				System.out.println("예매정보를 입력>");
				System.out.println("영화 이름:");
				user1.res.movie_name = in.nextLine();
				System.out.println("영화 시간:");
				user1.res.movie_time = in.nextLine();
				System.out.println("인원 수:");
				user1.res.number_people = in.nextInt();
				System.out.println("몇 관:");
				in.nextLine();
				user1.res.movie_room = in.nextLine();
				break; //예매정보, 고객정보 입력을 받아서
					   // 객체 생성 후 cgv 리스트에 저장
			case 2:
				if (user1.res == null) {
					System.out.println("예매정보가 없습니다");
				}
				else {
					in.nextLine();
					System.out.println("id를 입력하세요>");
					String searchId = in.nextLine();
					for (int i = 0; i < ticket.userList.size(); i++) {
						
						if (searchId.equals(ticket.userList.get(i).id)) {
							System.out.println("예매정보 ");
							ticket.userList.get(i).res.info();
						}else {
							System.out.println("조회하신 id가 없습니다");
						}
					}
				}
				break;
			case 3:
				user1.res = null;
				break;
			case 0:
				return;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}

		

	}

}
