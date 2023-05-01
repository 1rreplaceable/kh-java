import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		/*
		 * # 반복문 for 1. 반복문의 조건 3가지 1) 초기식 2) 조건식 3) 증감식 2. for문의 구조 for(초기식;조건식;증감식){
		 * 조건식이 참일 동안 실행할 문장; } 3. for문의 실행순서 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식
		 * ...
		 */

		for (int i = 1; i <= 10; i++) {
			if (i < 3 || i > 7) {
				System.out.print(i + " ");
			}
		}

		int a = 0;
		int b = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				a += i;
			} else {
				b += i;
			}
		}
		System.out.println();
		System.out.println("1~100 홀수의 합: " + b);
		System.out.println("1~100 짝수의 합: " + a);

		Scanner in = new Scanner(System.in);
		/*
		 * int sum = 0; for (int i = 0; i < 5; i++) { System.out.println("정수를 입력하세요");
		 * int user = in.nextInt(); sum += user; if (sum >= 100) {
		 * System.out.println("합이 100 이상이라 종료"); break; } }
		 * System.out.println("정수들의 합: " + sum);
		 */

		// if문 먼저, switch
		// 월 입력 받는다.
		// 3~5월까지는 봄
		// 6~8월까지는 여름
		// 9~11월까지는 가을
		// 12~2월까지는 겨울
		// 무한적으로 받다가 99숫자를 입력하면 프로그램 종료
		// 단 1~12외의 숫자를 입력하면 "월을 잘못 입력했습니다"
		String weather = "";

		while (true) {
			System.out.println("월을 입력하세요");
			int month = in.nextInt();
			if (month == 99) {
				System.out.println("종료합니다");
				break;
			}
			switch (month) {
			case 12, 1, 2:
				weather = "겨울";
				break;
			case 3, 4, 5:
				weather = "봄";
				break;
			case 6, 7, 8:
				weather = "여름";
				break;
			case 9, 10, 11:
				weather = "가을";
				break;

			default:
				System.out.println("월을 잘못 입력했습니다");
				break;
			}

			System.out.println("계절: " + weather);
		}

	}

}
