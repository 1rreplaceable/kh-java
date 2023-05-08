package Static;

class Socar {

	// 운전자
	static String name;
}

class User {
	String name;

	User(String name) {
		this.name = name;
	}
}

public class Main {

	public static void main(String[] args) {

		// 접근, 실행 할 때 클래스명.변수명
		System.out.println("현재 count값:" + Student.count);
		
		// 학생들을 관리하는 배열
		Student[] stulist = new Student[5];
		
		stulist[0] = new Student(Student.count++,"이서희1");
		stulist[1] = new Student(Student.count++,"이서희2");
		stulist[2] = new Student(Student.count++,"이서희3");
		stulist[3] = new Student(Student.count++,"이서희4");
		stulist[4] = new Student(Student.count++,"이서희5");
		
		System.out.println(stulist[0].id);
		
		
		// static "공유"
		// 클래스의 필드와 메서드에 적용할 수 있다.
		// static 필드 -> 클래스 변수
		// static 메서드 -> 클래스 메서드

		// 클래스 변수 (하나만)
		// 공유를 위한 객체 외부 변수

		// 인스턴스 변수 (각각각)
		// 객체 내부에 존재하는 변수
	}

}

//		
//		// static 생성
//		Socar.name = "이서희";
//		
//		User u2 = new User("김자바");
//		User u3 = new User("김이썬");
//		User u4 = new User("이스타일");