import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {

//		// 2차원 배열
//		int[][] arr = new int[3][3];
//		int[][] a = new int[5][2];
//		
//		/*
//		 *  신체검사를 한다. 키를 저장 (실수)
//		 *  1학년 3개의 반이 있다.
//		 *  각각의 반에 5명의 키를 저장하는 2차원 배열
//		 */
//		
//		double[][] hei = new double[3][5];
//		
//		int[][] arr2 = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		
//		// 전체출력
//		for(int i =0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(arr2[i][j]);
//			}System.out.println();
//		}
//		
//		for(int[] num:arr2) {
//			for(int num2 : num) {
//				System.out.print(num2);
//			}System.out.println();
//		}
//		
//		// 부분출력(원하는 값만 하나 출력
//		// 배열명[행][열]
//		// 배열명[행][열] = 값
//		
//		System.out.println(arr2[1][1]);
//		
		
		int[][] arr3 = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr3[i][j] = 10 * k;
				k += 1;
			}
		}
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		Scanner in = new Scanner(System.in);
		
		System.out.println("인덱스1 입력 :");
		int a = in.nextInt();
		System.out.println("인덱스2 입력 :");
		int b = in.nextInt();
		System.out.println(arr3[a][b]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		int xidx = 0, yidx = 0;
		System.out.println("값 입력 :");
		int c = in.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr3[i][j] == c) {
					xidx = i;
					yidx = j;
				}
			}
		}
		System.out.print("인덱스1 출력 :"+xidx + " ");
		System.out.println("인덱스2 출력 :"+yidx);
		
		// 문제 3)
		
		//기존 배열 확인
		for(int i =0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr3[i][j]);
			}System.out.println();
		}
		System.out.println("값 2개 입력 :");
		int d = in.nextInt();
		int e = in.nextInt();
		int dx = 0, dy = 0, ex = 0, ey = 0;
		int temp = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr3[i][j] == d) {
					dx = i;
					dy = j;
				}else if(arr3[i][j] == e) {
					ex = i;
					ey = j;
				}
			}
		}
		temp = arr3[dx][dy];
		arr3[dx][dy] = arr3[ex][ey];
		arr3[ex][ey] = temp;
		
		//바뀐 배열 확인
		for(int i =0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr3[i][j]);
			}System.out.println();
		}
		
		int[] list = {1,26,17,4,20,44,3};
		Arrays.sort(list);
		String res = Arrays.toString(list);
		
		System.out.println(res);
	}

}
