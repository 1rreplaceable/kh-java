package Sort;

import java.util.Scanner;

public class asd {

	public static int Factorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num * Factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println(arr[i]);
		}
		
		System.out.println("정수");
		int num2 = sc.nextInt();
		
		System.out.println(Factorial(num2));
	}
}
