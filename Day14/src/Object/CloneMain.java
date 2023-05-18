package Object;

public class CloneMain {

	public static void main(String[] args) {

		// clone()
		// 객체를 복사해서 새로운 인스턴스(객체 생성)
		// 얇은 복사 깊은 복사

		// 일반변수 값 그대로 복사 가능하다
		// 참조변수 직접 값을 복사 하는 게 아니라(주소를)
		// 주소를 복사한다 같은 객체를 참조하고 있다.

		User user1 = new User("love", "love");

		// clone()
		// 접근제어자 변경하기
		// 인터페이스 cloneable 구현하기
		// 예외 발생

		// 깊은 복사

		try {
			User copy = (User) user1.clone();

			System.out.println(copy.hashCode());
			System.out.println(user1.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
