package array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {

		//숫자 (정수)
		Scanner in = new Scanner(System.in);
		int[] arr = {10,20,0,0,0};
		int count = 2;
		int totalSize = arr.length;
		while(true) {
			System.out.println("현재 남은 공간:" + (totalSize - count));
			System.out.println("1.추가 2.삭제 0.종료");
			int sel = in.nextInt();
			int zeroCnt = 0;
			
			if(sel == 1) {
				// 추가
				if(count != 5) {
					System.out.println("정수 하나를 입력하세요");
					int num = in.nextInt();
					System.out.println("위치를 입력하세요");
					int idx = in.nextInt();
					arr[idx] = num;
					for(int i = 0; i < totalSize; i++) {
						if(arr[i] == 0) {
							zeroCnt++;
						}
					}
					count = 5 - zeroCnt;
				}
			}else if (sel == 2) {
				// 삭제
				System.out.println("삭제 할 번호 위치를 입력하세요");
				int delIdx = in.nextInt();
				if(arr[delIdx] != 0) {
					arr[delIdx] = 0;
				}
				else {
					System.out.println("그 위치는 비어있습니다.");
				}
				for(int i = 0; i < totalSize; i++) {
					if(arr[i] == 0) {
						zeroCnt++;
					}
				}
				count = 5 - zeroCnt;
			}else if (sel == 0) {
				break;
			}else {
				System.out.println("0~2번 사이만 입력하세요");
			}
			if(count == 5) {
				System.out.println("공간이 없습니다.");
				break;
			}
		}
		
	}

}
