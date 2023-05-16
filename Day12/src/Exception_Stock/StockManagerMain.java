package Exception_Stock;

import java.util.Scanner;

public class StockManagerMain {

	public static void main(String[] args) {

		StockManager s1 = new StockManager(90);
		Scanner sc = new Scanner(System.in);

		System.out.println("amount>");
		int amt = sc.nextInt();

		try {
			s1.subStock(amt);
			s1.updateStock();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
