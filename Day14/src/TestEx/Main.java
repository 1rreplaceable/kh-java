package TestEx;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void practice1() {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = in.nextInt();
		if (num <= 0) {
			System.out.println("양수가 아닙니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		}
	}

	public static void practice2() {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = in.nextInt();
			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 != 0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			}
		}

	}

	public static void practice3() {
		Scanner in = new Scanner(System.in);
		System.out.println("문자열 : ");
		String user = in.nextLine();
		System.out.println("문자 : ");
		String userChar = in.nextLine();

		int count = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == userChar.charAt(0)) {
				count++;
			}
		}

		System.out.println(user + " 안에 포함된 " + userChar + " 개수 : " + count);
	}

	public static void practice4() {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("문자열 : ");
			String user = in.nextLine();
			System.out.println("문자 : ");
			String userChar = in.nextLine();
			int count = 0;
			for (int i = 0; i < user.length(); i++) {
				if (user.charAt(i) == userChar.charAt(0)) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			while (true) {
				System.out.println("더 하시겠습니까? (y/n) : ");
				String yn = in.nextLine();
				if (yn.equals("y") || yn.equals("Y")) {
					break;
				} else if (yn.equals("n") || yn.equals("N")) {
					return;
				} else {
					System.out.println("잘못된 대답입니다. 다시입력해주세요.");
				}
			}
		}
	}

	public static void upDown() {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int com = ran.nextInt(100) + 1;
		int count = 0;
		while (true) {

			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int me = scan.nextInt();

			if (com > me) {
				System.out.println("Up !");
				count++;

			} else if (com < me) {
				System.out.println("Down !");
				count++;

			} else if (com == me) {
				count++;
				System.out.println("정답입니다 !!");
				System.out.println(count + "회만에 맞추셨습니다.!");
				break;
			}

		}
	}

	public static void rps() {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		System.out.println("당신의 이름을 입력해주세요");
		String name = in.nextLine();
		int cntW = 0, cntD = 0, cntL = 0, cntGame = 0;
		String com = "";
		String result = "";

		while (true) {
			System.out.println("가위바위보: ");
			String my = in.nextLine();
			int comRan = r.nextInt(3) + 1; // 1:가위 2:바위 3:보

			if (my.equals("가위")) {
				if (comRan == 1) {
					result = "비겼습니다.";
					cntD++;
				} else if (comRan == 2) {
					result = "졌습니다 ㅠㅠ";
					cntL++;
				} else {
					result = "이겼습니다 !";
					cntW++;
				}
				cntGame++;
			} else if (my.equals("바위")) {
				if (comRan == 1) {
					result = "이겼습니다 !";
					cntW++;
				} else if (comRan == 2) {
					result = "비겼습니다.";
					cntD++;
				} else {
					result = "졌습니다 ㅠㅠ";
					cntL++;
				}
				cntGame++;
			} else if (my.equals("보")) {
				if (comRan == 1) {
					result = "졌습니다 ㅠㅠ";
					cntL++;
				} else if (comRan == 2) {
					result = "이겼습니다 !";
					cntW++;
				} else {
					result = "비겼습니다.";
					cntD++;
				}
				cntGame++;
			} else if (my.equals("exit")) {
				System.out.println(cntGame + "전 " + cntW + "승 " + cntD + "무 " + cntL + "패");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			if (comRan == 1) {
				com = "가위";
			} else if (comRan == 2) {
				com = "바위";
			} else {
				com = "보";
			}
			System.out.println("컴퓨터 : " + com);
			System.out.println(name + " : " + my);
			System.out.println(result);
		}

	}

	public static void main(String[] args) {
		rps();
	}

}
