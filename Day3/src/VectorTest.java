import java.util.Scanner;

public class VectorTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 이름을 저장하는 배열 (벡터구조)
		// 학번을 저장하는 배열, 점수를 저장하는 배열
		int[] haks = null;
		int[] scores = null;
		int count = 0;
		int sel;
		while (true) {

			System.out.println("---kh정보학원---");
			System.out.println("1. 학번과 점수 추가");
			System.out.println("2. 학번과 점수 삭제");
			System.out.println("3. 학번과 점수 조회");
			System.out.println("4. 학번과 점수 파일 저장");
			System.out.println("0. 종료");
			sel = in.nextInt();
			// 2,3 기준은 학번을 기준
			// 조회 학번조회를 하면 1. 전체출력 2. 조회하는 학번의 내용
			switch (sel) {
			case 1:
				if (count == 0) {
					haks = new int[1];
					scores = new int[1];
				} else {
					int[] temp = haks;
					int[] temp2 = scores;
					haks = new int[count + 1];
					scores = new int[count + 1];

					for (int i = 0; i < count; i++) {
						haks[i] = temp[i];
						scores[i] = temp2[i];
					}
					temp = null;
					temp2 = null;
				}
				System.out.println("학번과 점수 저장>");
				int hakData = in.nextInt();
				int scoreData = in.nextInt();
				haks[count] = hakData;
				scores[count] = scoreData;

				count += 1;

				break;

			case 2:
				if (count == 0) {
					System.out.println("빈 공간입니다. 데이터를 추가하세요");
				} else {
					System.out.println("삭제 할 학번을 입력>");
					int del = in.nextInt();
					int delIndex = -1;
					for (int i = 0; i < count; i++) {

						if (haks[i] == del) {
							delIndex = i;
							break;
						}
					}
					if (delIndex == -1) {
						System.out.println("삭제 할 값이 없다!");
					} else {
						int[] temp = haks;
						int[] temp2 = scores;
						haks = new int[count - 1];
						scores = new int[count - 1];

						for (int i = 0, j = 0; i < count; i++) {
							if (i != delIndex) {
								haks[j] = temp[i];
								scores[j] = temp2[i];
								j += 1;
							}
						}
						temp = null;
						temp2 = null;
						count -= 1;
					}
				}
				break;
			case 3:
				int searchIndex = -1;
				System.out.println("1. 전체출력 2. 조회하는 학번의 내용");
				int oneOrTwo = in.nextInt();
				if (oneOrTwo == 1) {
					for (int i = 0; i < count; i++) {
						System.out.println("학번: " + haks[i] + " 점수: " + scores[i]);
					}
				} else if (oneOrTwo == 2) {
					System.out.println("조회 할 학번을 입력>");
					if (searchIndex == -1) {
						System.out.println("조회 할 값이 없다!");
					} else {
						int search = in.nextInt();
						for (int i = 0; i < count; i++) {

							if (haks[i] == search) {
								searchIndex = i;
								break;
							}
						}
						System.out.println("학번: " + haks[searchIndex] + " 점수: " + scores[searchIndex]);
					}
				}

				break;

			case 4:
			case 0:
				return;
			default:
				System.out.println("잘못 입력");
			}

		}

	}

}
