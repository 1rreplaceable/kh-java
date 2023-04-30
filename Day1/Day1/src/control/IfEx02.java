package control;
import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		/*
		 * 최대값 구하기
		 * 1. 숫자 3개
		 * 2. 입력받은 3개의 수 비교,
		 * 3. 가장 큰 수 출력
		 * 4. 가장 작은 수 출력
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("정수 3개>");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		int max = (num1 > num2 ? num1 : num2) > num3 ? (num1 > num2 ? num1 : num2) : num3;
		int min = (num1 > num2 ? num2 : num1) > num3 ? num3 : (num1 > num2 ? num2 : num1);
		
		System.out.println("가장 큰 수: " + max + "\n" + "가장 작은 수: " + min);
	}

}
