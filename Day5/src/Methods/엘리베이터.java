package Methods;

public class 엘리베이터 {

	// 객체를 1층으로 고정된 값이 저장된다
	static int 현재층 = 1; // 엘리베이터가 기억

//	엘리베이터(int 시작하는층) {
//		this.현재층 = 시작하는층;
//	}
//	
	public static void 올라간다(Boolean 버튼, int 가고싶은층) {

		// 1층부터 내가 가고싶은층 증가 현재층 다시 저장
		while (현재층 <= 가고싶은층) {
			System.out.println(현재층);
			현재층++;
		}
	}

	public static void 내려간다(Boolean 버튼, int 가고싶은층) {
		while (현재층 >= 가고싶은층) {
			System.out.println(현재층);
			현재층--;
		}
	}

	public static void main(String[] args) {

		// 엘리베이터를 이용
		new 엘리베이터();
		올라간다(true, 4);
		내려간다(true, 1);

	}

}
