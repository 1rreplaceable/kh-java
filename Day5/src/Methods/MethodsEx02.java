package Methods;

import java.util.Scanner;

public class MethodsEx02 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return (double) a / b;
	}

	public static int loop(int a) {
		int res = 0;
		for (int i = 1; i <= a; i++) {
			res += i;
		}
		return res;
	}
	
	public static int maxNumber(int a, int b, int c) {
		int maxNumber = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		
		return maxNumber;
	}
	
	public static int minNumber(int a, int b, int c) {
		int minNumber = (a < b ? a : b) < c ? (a < b ? a : b) : c;
		
		return minNumber;
	}
	
	public static boolean equals(String str1, String str2) {
		return str1.equals(str2);
	}

	public static void main(String[] args) {
		// 모든 결과값을 출력하는 건 main

		// 문자열을 비교하는 함수
		// equals
		// 매개변수 str1, str2
		// return true, false
		
		String str1 = "hello";
		String str2 = "world";
		
		System.out.println(equals(str1, str2));
		
	
		
		
		
		
		
		
		
		
		
		
		// 함수명 maxNumber, minNumber
		// 3개의 정수 매개변수
		// 가장 큰 값 가장 작은 값 main return 출력
		int x = 13, y = 5, z = 8;
		int max1 = maxNumber(x, y, z);
		int min1 = minNumber(x, y, z);
		System.out.println("가장 큰 값: "+max1);
		System.out.println("가장 작은 값: "+min1);
		
		
		
		
		
		
		

		// 함수 loop
		// 매개변수 10
		// 기능 1부터 매개변수의 값까지 더한 다음
		// 결과를 return 해서 출력
		int loop_res = loop(10);
		System.out.println(loop_res);

		int a = 10, b = 20;
		int add_res = add(a, b);
		System.out.println("더한 결과: " + add_res);
		int mul_res = mul(a, b);
		System.out.println("곱한 결과: " + mul_res);
		double div_res = div(a, b);
		System.out.println("나눈 결과: " + div_res);

	}

}
//
//public static void show(int temp) {
//	
//	System.out.println(temp);
//}
//
//public static long sq(int num) {
//	
//	int res = num * num;
//	return res;
//}
//
//public static String input() {
//	
//	String name = "최석진";
//	int number2 = 100;
//	double number3 = 10.254;
//	
//	return name; // main에게 데이터를 보낸다
//}
//
//public static void main(String[] args) {
//	
//	int number = 10;
//	show(number);
//	
//	System.out.println(input());
//	
//	// 하나의 정수를 Scanner로 받아서
//	// 제곱하는 함수를 만드세요
//	// 입력 정수
//	// 함수명 sq
//	// return
//	Scanner in = new Scanner(System.in);
//	System.out.println("정수입력>");
//	int num = in.nextInt();
//	System.out.println(sq(num));
//	
//}