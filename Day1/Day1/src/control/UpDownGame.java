package control;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		int com = 8;
		Scanner in = new Scanner(System.in);
		System.out.println("숫자>");
		int me = in.nextInt();
		
		// 여러개의 경우를 선택하는 if문
		// if (비교문) 작성 가능하다.
		// else (비교문) 작성
		
		
		if (me < com) {
			System.out.println("Up!");
		}else if (me > com) {
			System.out.println("Down!");
		}else {
			System.out.println("Bingo!");
		}
		
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
		 */
		 
	}

}
