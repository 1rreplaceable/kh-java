package Variable;

public class Instance_static_variable {

	public static void main(String[] args) {

		// 붕어빵 객체를 생성
		// 레퍼런스 변수
		FishBread b1 = new FishBread("팥");
		FishBread b2 = new FishBread("피자");
		FishBread b3 = new FishBread("슈크림");
		FishBread b4 = new FishBread("고구마");
		
		// 철판
		FishBread[] 철판 = new FishBread[4];
		철판[0] = b1;
		철판[1] = b2;
		철판[2] = b3;
		철판[3] = b4;
		
		for (FishBread fishBread : 철판) {
			fishBread.print();
		}
		System.out.println("=====================");
		System.out.println(FishBread.count);
	}

}

class FishBread {

	// 내용물 (팥, 치즈, 고구마)
	// 인스턴스 변수
	String contents;

	// 붕어빵의 개수
	// 클래스 변수
	static int count;

	FishBread(String c) {
		this.contents = c;
		// 붕어빵 객체 수 카운팅
		FishBread.count++;

	}
	void print() {
		System.out.println(this.contents+"붕어빵");
	}

}