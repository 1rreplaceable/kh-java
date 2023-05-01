package array;

import java.util.Random;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 배열 동일한 타입의 변수를 여러개 묶었다.
		// 학생분들의 점수를 저장하는 배열 25명
		// 단점 삭제X 추가X (공간)

		// 순서(인덱스) 0부터

		int[] scoreList = new int[25];

		int[] a = { 1, 2, 3 };
		int[] b;

		// 배열의 길이
		System.out.println(scoreList.length);

		// 배열을 복사
		b = a;

		// 함수를 이용해서 복사
		b = a.clone();

		System.out.println(b[0]);
		System.out.println(a[0]);

		b[0] = 3;
		System.out.println("값 변경");

		System.out.println(b[0]);
		System.out.println(a[0]);

		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50

		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

		Random r = new Random();

		String[] m = { "마라탕", "쌀국수", "돈까스", "엽기떡볶이", "해장국", "매운갈비찜", "김치찌개", "냉면" };

		int size = m.length;
		int ra = r.nextInt(size);

		System.out.println(m[ra]);

		int[] lotto = new int[6];

		int lottoNum;
		for (int i = 0; i < lotto.length; i++) {
			lottoNum = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lottoNum = r.nextInt(45) + 1;
					i--;
				}
			}
			lotto[i] = lottoNum;
			System.out.print(lotto[i] + " ");
		}
	}

}
