package control;
import java.util.Scanner;


public class IfEx {

	public static void main(String[] args) {
		
		/*
		 * if (비교){
		 * 참인 경우 실행
		 * 
		 * }else{
		 * 거짓인 경우 실행
		 * }
		 * 
		 */
		// 문제) 시험점수3개를 입력받고 학점출력 
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하                      ==> 재시험 
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+
		Scanner in = new Scanner(System.in);
		System.out.println("3개의 시험점수를 입력하시오>");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int avg = (a + b + c) / 3;
		System.out.println("평균: " + avg);
		System.out.print("학점: ");
		int endNum = avg % 10;
		if (avg >= 90) {
			System.out.print('A');
		}else if (avg >= 80) {
			System.out.print('B');
		}else if (avg >= 70) {
			System.out.print('C');
		}else {
			System.out.println("재시험");
		}
		if (avg >= 70 && endNum >= 7 || avg == 100) {
			System.out.println('+');
		}
		
	}
}
