package control;

import java.util.Scanner;

public class Ttt {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("8번째 7의 배수: " + 7 * 8);
		
		System.out.print("6 ==>");
		for (int i=1; i<=6; i++) {
			if (6 % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.print("\n8 ==>");
		for (int i=1; i<=8; i++) {
			if (8 % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.print("\n공약수는 ");
		for (int i=1; i<=8; i++) {
			if (8 % i == 0 && 6 % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		int gcd = 0;
		System.out.print("\n최대공약수는 ");
		for (int i=1; i<=8; i++) {
			if (8 % i == 0 && 6 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d", gcd);
		
		int gcd2 = 0;
		System.out.print("\n25, 75의 최대공약수는 ");
		for (int i=1; i<=75; i++) {
			if (75 % i == 0 && 25 % i == 0) {
				gcd2 = i;
			}
		}
		System.out.printf("%d", gcd2);
		
		int gcd3 = 0;
		System.out.print("\n연필 42개와 지우개 28개를 ");
		for (int i=1; i<=42; i++) {
			if (42 % i == 0 && 28 % i == 0) {
				gcd3 = i;
			}
		}
		System.out.printf("%d명에게 나누어 줄 수 있다.", gcd3);
		
		
	}

}
