package array;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };
		int size = game.length;
		int twoIdx = 2;

		while (true) {
			for (int i = 0; i < size; i++) {
				if (game[i] == 0) {
					System.out.print("__ ");
				} else {
					System.out.print("옷 ");
				}
			}
			System.out.println("\n왼쪽 1 or 오른쪽 2>");
			int user = in.nextInt();
			if (user == 1) {
				if (twoIdx != 0) {
					game[twoIdx] = 0;
					game[twoIdx - 1] = 2;
					twoIdx -= 1;
				}
			} else if (user == 2) {
				if (twoIdx != 6) {
					game[twoIdx] = 0;
					game[twoIdx + 1] = 2;
					twoIdx += 1;
				}
			} else if (user == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}

	}
}
