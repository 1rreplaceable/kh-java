package Methods;

public class 김밥천국 {

	public static String 주방장(String 이모님) {
		String 메뉴 = 이모님;

		System.out.println("주문이 들어왔다");
		System.out.println("요리를 만드는중");
		System.out.println(메뉴 + "가 완성되었습니다");

		return 메뉴;
	}

	public static void 라면을산다() {
		System.out.println("라면을 산다");
	}

	public static void 물을올린다() {
		System.out.println("물을 올린다");
	}

	public static void 스프를넣는다() {
		System.out.println("스프넣기");
	}

	public static void 면을넣는다() {
		System.out.println("면넣기");
	}
	
	public static void 라면완성() {
		System.out.println("라면이완성");
	}

	public static void main(String[] args) {

		// 주문
		// 주문 이모님이 주방장에 전달
		// 주문한 음식
		String 음식 = 주방장("김치찌개");
		System.out.println("맛있게 먹는다 " + 음식);

		// 함수의 실행 순서

		// 라면이 없고 라면을 끓일 때 면을 넣고 스프 완성
		라면을산다();
		물을올린다();
		면을넣는다();
		스프를넣는다();
		라면완성();
		// 라면 스프넣고 면을 완성
		물을올린다();
		스프를넣는다();
		면을넣는다();
		라면완성();
	}

}
