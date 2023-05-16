package InnerClass;

class Student {
	String name;
	int math, eng, kor;

	public Student(String name, int math, int eng, int kor) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}

	void score() {

		int total = 3;
		class Avg {
			int sum = math + eng + kor;

			void grade() {
				System.out.println(sum / total);
			}
		}
		Avg a1 = new Avg();
		a1.grade();
		
		
	} // score() 끝

}

public class LocalClassMain {

	public static void main(String[] args) {

		Student s1 = new Student("최석진",60, 70, 80);
		s1.score();
		
		
		// 로컬클래스
		// - 특정 메서드내에 내부클래스를 선언
		// - 해당 메서드가 호출시 생성, 수행 종료시 소멸(지역변수)
		// - 내부 클래스가 접근 할 수 있는 지역변수 final변수만
		// 가능하다.
	}
}
