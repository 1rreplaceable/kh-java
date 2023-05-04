package Methods;

import java.util.Scanner;

class User_Coffee {
// User_Coffee클래스 

// 정보 
// 주문 번호 
// 지불금액 
// 메뉴 
// 사이즈 
	String info;
	int ordNum;
	int pay;
	String menu;
	String size;

	public User_Coffee(String info, int ordNum, int pay, String menu, String size) {
		this.info = info;
		this.ordNum = ordNum;
		this.pay = pay;
		this.menu = menu;
		this.size = size;
	}
}

public class Coffee {

	public static void userCoffeePrice(User_Coffee k) {
		String[] menus = { "Americano", "Cafe mocha", "Cafe Latte", "Green Tea Latte" };
		int[] menus_price = { 3900, 45000, 50000, 55000 };
		int menus_idx = -1;
		int menus_pay = 0;
		String[] sizes = { "G", "R", "S" };
		int[] sizes_price = { 1000, 500, 0 };
		int sizes_idx = -1;
		int sizes_pay = 0;
		for (int i = 0; i < menus.length; i++) {
			if (k.menu.equals(menus[i])) {
				menus_idx = i;
			}
		}
		menus_pay += menus_price[menus_idx];

		for (int i = 0; i < sizes.length; i++) {
			if (k.size.equals(sizes[i])) {
				sizes_idx = i;
			}
		}
		sizes_pay += sizes_price[sizes_idx];

		System.out.println("총 금액은 " + (sizes_pay + menus_pay) + "원 입니다.");
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Harry Cafe");
		System.out.print("Choose 1 : Americano / Cafe mocha / Cafe Latte / Green Tea Latte : ");
		System.out.print("Choose size : G(grande) / R(regular) / S(short) : \n");

		String info = in.next();
		int ordNum = in.nextInt();
		int pay = in.nextInt();
		String menu = in.next();
		String size = in.next();

		User_Coffee u1 = new User_Coffee(info, ordNum, pay, menu, size);

		userCoffeePrice(u1);

	}

}

//public static int coffees(String cafe) {
//	String[] menus = {"Americano", "Cafe mocha", "Cafe Latte", "Green Tea Latte"};
//	int[] menus_price = {3900, 45000, 50000, 55000};
//	int menus_idx = -1;
//	int menus_pay = 0;
//	
//	for(int i = 0; i< menus.length; i++) {
//		if(cafe.equals(menus[i])) {
//			menus_idx = i;
//		}
//	}menus_pay += menus_price[menus_idx];
//	
//	return menus_pay;
//}
//
//public static int sizes(String size) {
//	String[] sizes = {"G", "R", "S"};
//	int[] sizes_price = {1000, 500, 0};
//	int sizes_idx = -1;
//	int sizes_pay = 0;
//	
//	for(int i = 0; i< sizes.length; i++) {
//		if(size.equals(sizes[i])) {
//			sizes_idx = i;
//		}
//	}sizes_pay += sizes_price[sizes_idx];
//	
//	return sizes_pay;
//}
//
//public static void price(int a, int b) {
//	System.out.println("총 금액은 "+(a+b)+"원 입니다.");
//}
