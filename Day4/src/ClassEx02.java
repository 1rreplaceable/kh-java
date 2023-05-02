import java.util.ArrayList;
import java.util.Arrays;

// class 첫글자 대문자
class Cat {

	// 필드(정보, 상태 영역
	String name; // 이름
	String breeds; // 품종
	double weight; // 몸무게

	// 메서도(동작, 기능) 영역
	void claw() {
		System.out.println("할퀴기");
	}

	void meow() {
		System.out.println("야옹!");
	}
}

class Stu {
	
	// 학생의 정보 영역 (필드)
	String name;
	int hakbun;
	//int scores[] = new int[3];
	ArrayList<Integer> scores = new ArrayList<>();
	
	// 학생의 기능(동작) 영역
	void info() {
		System.out.println(name);
		System.out.println(hakbun);
		
		for(Integer num : scores) {
			System.out.println(num);
		}
		
		//Arrays.toString(scores)
	}
	
}

public class ClassEx02 {

	public static void main(String[] args) {

		// 학생 객체 생성
		Stu student1 = new Stu();
		
		student1.name = "최석진";
		student1.scores.add(10);
		
		student1.info();
		
		Stu student2 = new Stu();
		student2.scores.add(25);
		
		
		
		// 프로젝트폴더 안에 여러개의 자바파일
		// 클래스명은 중복 될 수 없다

		// 객체 생성
		// 자동으로 초기화 String null
		// int 0 double 0.0
		Cat c = new Cat();

		// 저장
		c.name = "나비";
		c.weight = 1.5;
		c.breeds = "먼치킨";

		System.out.println(c.name);
	}

}
