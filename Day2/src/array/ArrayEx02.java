package array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		int findIdx = -1;
		Scanner in = new Scanner(System.in);

		System.out.println("학번 입력>");
		int hakbun = in.nextInt();

		int index = 0;
		while (index != hakbuns.length) {
			if (hakbun == hakbuns[index]) {
				findIdx = index;
			}
			index++;
		}
		if (findIdx == -1) {
			System.out.println("찾는 학번이 없습니다.");
		} else {
			System.out.println(scores[findIdx]);
		}
	}

}
