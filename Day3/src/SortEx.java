
public class SortEx {

	public static void main(String[] args) {

		// 정렬
		// 버블정렬

		// 값 교체
		int a = 10;
		int b = 20;
		int temp = 0;

		temp = b;
		b = a;
		a = temp;

		// 배열 선언
		int[] arr = { 3, 6, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp1 = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp1;
				}
			}
		}

		// 순서가 있는 자료형

		String[] list = { "python", "java", "html" };

		for (String str : list) {
			System.out.println(str);
		}

		for (int value : arr) {
			System.out.println(value);
		}
		
		// * 
		// **
		// ***
		// ****
		// *****
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
