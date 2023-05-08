
class Parent {

	int money; // 상속금액
	private int amount; // 비상금액

	Parent() {
		money = 1000000000;
		amount = 10000000;
	}
	
	// 
	int getMoney(String s) {
		if(s.equals("허락")) {
			this.amount = 1000000;
			return 10000000;
		}else {
			System.out.println("미안하다");
			return 0;
		}
	}
	
	void setMoney(int amount) {
		this.amount += amount;
	}
}

class Children extends Parent {

}

public class Main {

	public static void main(String[] args) {

		// private	(비공개)
		// - 상속을 한 자식클래스 접근 불가능

		// public 	(공개)
		
		Parent p1 = new Parent();
		System.out.println(p1.money);

		Children c1 = new Children();
		System.out.println(c1.money);
		
		Parent p2 = c1;
		
		c1.getMoney("돈 빌려주세요");
		

	}

}
