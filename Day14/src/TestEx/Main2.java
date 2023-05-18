package TestEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void practice1() {
		int[] ex = new int[10];
		for (int i = 0; i < ex.length; i++) {
			ex[i] = i + 1;
			System.out.print(ex[i] + " ");
		}
	}

	public static void practice2() {
		int[] ex = new int[10];
		for (int i = 0; i < ex.length; i++) {
			ex[i] = 10 - i;
			System.out.print(ex[i] + " ");
		}
	}

	public static void practice3() {
		Scanner in = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int num = in.nextInt();
		int[] ex = new int[num];
		for (int i = 0; i < ex.length; i++) {
			ex[i] = i + 1;
			System.out.print(ex[i] + " ");
		}
	}

	public static void practice4() {
		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(fruits[1]);
	}

	public static void practice5() {
		Scanner in = new Scanner(System.in);
		System.out.println("문자열 : ");
		String user = in.nextLine();
		System.out.println("문자 : ");
		String userChar = in.nextLine();
		String idx = "";
		int count = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == userChar.charAt(0)) {
				count++;
				idx += (i + " ");
			}
		}
		System.out.println(user + "에 " + userChar + "가 존재하는 위치(인덱스) : " + idx);
		System.out.println(userChar + " 개수 : " + count);

	}

	public static void practice6() {
		Scanner in = new Scanner(System.in);
		String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int myWeek = in.nextInt();
		if (myWeek >= 0 && myWeek <= 6) {
			System.out.println(week[myWeek]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public static void practice7() {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = in.nextInt();
		int[] ex = new int[num];
		int sum = 0;
		for (int i = 0; i < ex.length; i++) {
			System.out.println("배열 " + i + "번쨰 인덱스에 넣을 값 : ");
			ex[i] = in.nextInt();
			sum += ex[i];
		}
		for (int i : ex) {
			System.out.print(i + " ");
		}
		System.out.println("\n총 합: " + sum);
	}

	public static void practice8() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("정수 : ");
			int num = in.nextInt();
			if (num % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				int[] ex = new int[num];
				for (int i = 0; i <= (ex.length - 1) / 2; i++) {
					ex[i] = i + 1;
				}
				for (int i = (ex.length + 1) / 2; i < ex.length; i++) {
					ex[i] = ex.length - i;
				}
				for (int i : ex) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;

			}
		}
	}

	public static void practice9() {
		Scanner in = new Scanner(System.in);
		String[] chick = { "양념", "후라이드", "간장", "불닭" };
		System.out.println("치킨 이름을 입력하세요 : ");
		String my_chick = in.nextLine();
		int cnt = 0;
		for (int i = 0; i < chick.length; i++) {
			if (my_chick.equals(chick[i])) {
				System.out.println(my_chick + "치킨 배달 가능");
			} else {
				cnt++;
			}
		}
		if (cnt == 4) {
			System.out.println(my_chick + "치킨은 없는 메뉴입니다.");
		}
	}

	public static void practice10() {
		Scanner in = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String jumin = in.nextLine();
		char[] arr = jumin.toCharArray();
		for (int i = 0; i < arr.length - 6; i++) {
			System.out.print(arr[i]);
		}
		for (int i = arr.length - 6; i < arr.length; i++) {
			System.out.print("*");
		}
	}

	public static void practice11() {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public static void practice12() {
		Random r = new Random();
		int[] arr = new int[10];
		int maxNum = 0;
		int minNum = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			maxNum = arr[i] > maxNum ? arr[i] : maxNum;
			minNum = arr[i] < minNum ? arr[i] : minNum;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
	}

	public static void practice13() {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}

	}
	
	public static void practice14() {
		Random r = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		
	}
	
//	public static void practice15() {
//		Scanner in = new Scanner(System.in);
//		System.out.println("문자열 : ");
//		String user = in.nextLine();
//		char[] arr = char[];
//		int cnt = 0;
//		System.out.println(user.length());
//		for(int i =0; i < user.length(); i++) {
//			arr[i] = user.charAt(i);
//		}
//		for(int i =0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(cnt);
//	}

	public static void practice16() {
		Scanner in = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		int num = in.nextInt();
		String[] arr = new String[num];
		in.nextLine();
		for(int i =0; i <arr.length; i++) {
			System.out.println((i+1)+"번째 문자열 : ");
			arr[i] = in.nextLine();
		}
		System.out.println("더 값을 입력하시겠습니까?(Y/N)");
		String user = in.nextLine();
		if(user.equals("Y")||(user.equals("y"))){
			String temp[] = arr;
			System.out.println("더 입력하고 싶은 개수 : ");
			int plusNum = in.nextInt();
			in.nextLine();
			String[] newArr = new String[temp.length + plusNum];
			for(int i = 0; i < temp.length; i ++) {
				newArr[i] = temp[i];
			}
			System.out.println(newArr.length);
			for(int j = arr.length; j < newArr.length; j++) {
				System.out.println((j+1)+"번째 문자열 : ");
				newArr[j] = in.nextLine();
			}
		}
	}
	public static void main(String[] args) {
		practice13();
	}
}
