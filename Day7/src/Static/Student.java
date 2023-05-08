package Static;

// id 1
// id 2
// id 3

public class Student {
	// 컴파일 시에 미리 메모리에 선언이 되고
	// 명령문 삭제된다
	static int count = 1;
	
	// 인스턴스화 시킬때 마다 객체 안에 각각 넣어주는
	// 인스턴스 변수
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

}
