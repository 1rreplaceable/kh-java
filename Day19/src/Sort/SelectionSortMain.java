package Sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortMain {

	static int nums[];
	static Random ran = new Random();
	public static void main(String[] args) {
		// 선택정렬
		//  - 하나의 배열에서 기준 최대값을 이용해서 정렬
		//    최소값을 이용해서 정렬을 할 건지 정렬
		nums = new int[10];
		
		for(int i =0; i<10; i++) {
			nums[i] = ran.nextInt(20);
			
		}
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i <nums.length; i++) {
			
			int maxIndex = i;
			
			// 탐색을 여기서 진행
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[maxIndex] < nums[j]) {
					maxIndex = j;
				}
			}
			
			int temp = nums[maxIndex];
			nums[maxIndex] = nums[i];
			nums[i] = temp;
		}
		
		
		
		// 위에 있는 기준으로 정렬이 끝나면
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(nums));
		
	}
}

//		// 선택정렬
//		// 기준은 가장 작은 값을 기준으로 정렬
//		for(int i = 0; i <nums.length; i++) {
//			// 현재 탐색에서 가장 앞의 원소를 초기값으로 설정한다.
//			// 각각의 반복이 진행 될 때마다 min 초기화
//			int minIndex = i;
//			
//			// 탐색을 여기서 진행
//			for(int j = i + 1; j < nums.length; j++) {
//				if(nums[minIndex] > nums[j]) {
//					minIndex = j;
//				}
//			}
//			// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와
//			// 가장 작은 원소의 위치를 바꿔준다.
//			int temp = nums[minIndex];
//			nums[minIndex] = nums[i];
//			nums[i] = temp;
//		}