import java.util.Scanner;

public class VectorEx {

	public static void main(String[] args) {

		// 정수
		// 처음에 프로그램을 시작하면 비어있는 배열 선언

		int[] arr = null;

		// 데이터 개수를 count
		int count = 0;
		int sel;
		// 1.추가 2.삭제 3.정렬 0.종료

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.삭제 \n3.정렬 0.종료");
			sel = in.nextInt();

			switch (sel) {
			case 1:
				// count 0이면 배열을 하나만 생성
				// count 1이상 배열을 새로 만들어거 기존에
				// 데이터를 복사하고 새로운 데이터를 추가

				if (count == 0) {
					arr = new int[1];
				} else {
					int[] temp = arr;
					arr = new int[count + 1];

					for (int i = 0; i < count; i++) {
						arr[i] = temp[i];
					}

					// 기존 배열이 필요가 없다
					// 새로운 배열 복사를 했기때문에 주소값을
					// 저장 할 필요가 없다.
					temp = null;
				}

				// 위에서 공간 생성
				// 실제 그 안에 데이터 추가
				System.out.println("추가 할 정수>");
				int data = in.nextInt();
				arr[count] = data;

				count++;

				break;
			case 2:
				if (count == 0) {
					System.out.println("빈 공간입니다. 데이터를 추가하세요");

				} else {
					// 삭제 데이터 찾기
					// 입력
					System.out.println("삭제 할 데이터를 입력>");
					int del = in.nextInt();
					// del 삭제 할 데이터를 이용해서 인덱스를 찾는다.
					int delIndex = -1;

					for (int i = 0; i < count; i++) {
						if (arr[i] == del) {
							delIndex = i;
							break;
						}
					}

					// 데이터가 없다
					if (delIndex == -1) {
						System.out.println("삭제 할 값이 없다");
					} else {
						// 삭제 할 인덱스 빼고 복사
						int[] temp = arr;
						arr = new int[count - 1];
						// 복사 과정에 삭제할 인덱스 데이터는 복사X
						// i는 기존 배열의 방번호를 사용
						// j는 새로운 배열의 방번호로 사용
						for (int i = 0, j = 0; i < count; i++) {
							if (i != delIndex) {
								arr[j] = temp[i];
								j++;
							}
						}
						temp = null;
						count -= 1;

					}

				}

				break;
			case 3:
				// 전체 출력
				for (int num : arr) {
					System.out.println(num);
				}
				break;
			case 0:
				return;
			default:
				System.out.println("잘못 입력");
			}

		}

	}

}
