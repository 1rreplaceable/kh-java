package control;

import java.util.Scanner;

public class TTtt {

	public static void main(String[] args) {

		/*
		 * 나이를 Scanner 입력 받아서
		 * 나이가 20세 미만 "소아청소년"
		 * 	    23세 이상 "성인
		 * 
		 * 나이를 입력 받고 20세 미만 "할인률 10% 입니다" 출력
		 *              30세 미만 "할인률 20% 입니다"
		 * 				30세 이상 "할인률 5% 입니다"
		 * 
		 * * # 놀이기구 이용제한 
		 * 1. 키를 입력받는다. 
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다. 
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다. 예) 부모님과 함께
		 * 오셨나요?(yes:1, no:0) 1번누르면 "부모님과 동반 탑승가능" 2번 " 탑승불가"
		 * 
		 * 
		 * * # 구구단 게임[1단계] 
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		 * 2. 입력받은 숫자를 토대로 구구단 문제를
		 *    출력한다. 
		 *    예) 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 * 
		 * 5. 국어 수학 영어 3개를 받아서 평균
		 * 평균이 90점 이상인 경우
		 * 		국어 수학 영어 모두 90점 이상 "최우수상"
		 * 		그중 하나라도 90점 미만이면 "우수상"
		 * 
		 * 평균이 80점이상 89점 이하 경우
		 * 		국어 수학 영어 3개 중에 하나라도 90점 이상 "장려상"
		 * 		국어 수학 영어 모두 90점 미만 "입상"
		 * 
		 * 평균 80점미만 "안녕"
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("나이>");
		int age = in.nextInt();
		if(age < 20) {
			System.out.println("소아청소년");
		}else if (age > 23) {
			System.out.println("성인");
		}
		
		System.out.println("나이2>");
		int age2 = in.nextInt();
		if(age2 < 20) {
			System.out.println("할인률 10% 입니다");
		}else if (age2 < 30) {
			System.out.println("할인률 20% 입니다");
		}else if (age2 > 30) {
			System.out.println("할인률 5% 입니다");
		}
		
		System.out.println("키>");
		int height = in.nextInt();
		
		if (height > 120) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		}else {
			System.out.println("부모님과 함께 오셨나요?(yes:1, no:0)");
			int num = in.nextInt();
			if (num == 1) {
				System.out.println("부모님과 동반 탑승 가능");
			}else if(num == 0){
				System.out.println("탑승 불가능");
			}
		}
		
		System.out.println("숫자2개>");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int answer = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = ?");
		int my_answer = in.nextInt();
		if (my_answer == answer) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}
		
		System.out.println("국어 수학 영어>");
		int korea = in.nextInt();
		int math = in.nextInt();
		int english = in.nextInt();
		
		int avg = (korea + math + english) / 3;
		if (avg >= 90) {
			if(korea >= 90 && math >= 90 && english >= 90) {
				System.out.println("최우수상");
			}else {
				System.out.println("우수상");
			}
		}else if (avg >= 80) {
			if(korea >= 90 || math >= 90 || english >= 90) {
				System.out.println("장려상");
			}
		}else {
			System.out.println("안녕");
		}
	}

}
