package InnerClass;

// 멤버클래스도 선언을 하게 되면 외부클래스 멤버이기때문에
// private에는 아무런 영향이 없다

class Outer1 { // 외부클래스
	private int num = 0;
	
	class Member{
		void add(int n) {num += n;}
		int get() {return num;}
	}
	
}
public class MemberClass {

	public static void main(String[] args) {
		
		// 멤버클래스
		//  - 외부 인스턴스를 생성하고 그 다음에 내부 클래스를 생성
		
		// 외부클래스 생성
		Outer1 out = new Outer1();
		Outer1 out2 = new Outer1();
		
		// 내부클래스 생성
		Outer1.Member o1 = out.new Member();
		Outer1.Member o2 = out2.new Member();
		
		// 실제 내부클래스의 메서드를 이용해서 데이터를 저장
		o1.add(100);
		System.out.println(o1.get());
	}
}
