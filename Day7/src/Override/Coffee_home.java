package Override;

class Drink {
	String name;
	int price;

	void ordered() {
	}


}

class Coffee extends Drink {

	@Override
	void ordered() {
		System.out.println("커피가 주문되었습니다.");
	}

}

class Tea extends Drink {

	@Override
	void ordered() {
		System.out.println("티가 주문되었습니다.");
	}
}

class Juice extends Drink {

	@Override
	void ordered() {
		System.out.println("주스가 주문되었습니다.");
	}
}

public class Coffee_home {
	public static void main(String[] args) {
		// 주문서 (여러개의 객체를 관리하는 배열)

		Coffee d1 = new Coffee();
		d1.name = "커피";
		Tea d2 = new Tea();
		d2.name = "티";
		Juice d3 = new Juice();
		d3.name = "주스";
		Drink drink1 = d1;
		Drink drink2 = d2;
		Drink drink3 = d3;

		Drink[] drinks = { drink1, drink2, drink3 };

		for (int i = 0; i < drinks.length; i++) {
			drinks[i].ordered();
		}
	}

}

// 커피클래스
// 멤버 name, price

// 티클래스
// 멤버 name, price

// 주스클래스
// 멤버 name, price
