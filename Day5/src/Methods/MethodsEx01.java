package Methods;

import java.util.Scanner;

public class MethodsEx01 {
	
	// 반복되는 문장들을 묶는 메서드 선언
	public static String grade(int score) {
		
		String res = null;
		
		if(score >= 90) {
			res = "A";
		}else if(score >=80) {
			res = "B";
		}else if(score >=70) {
			res = "C";
		}else if(score >=60) {
			res = "D";
		}else {
			res = "F";
		}
		
		return res;
	}
	
	// 프로그램이 시작하면 가장 먼저 실행하는 함수 (시작점)

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// 함수 실행(호출)
		System.out.println("국어 등급: " + grade(100)+" 입니다.");
		System.out.println("수학 등급: " + grade(100)+" 입니다.");
		System.out.println("영어 등급: " + grade(100)+" 입니다.");
		
		
		
		
	}
}
	// 함수 (입력, 기능, 출력)
	//  - 일련의 코드를 단순화한 문법
	//  - 반복되는 명령문들을 묶었다.
	//  - 어떤 문제를 처리하기 위한 방법을 소스코드로 묶어놓고
	// 	  필요에 따라서 동작하는 기능
	
	/*
	 * 국어 수학 영어 각각의 점수를 입력 
	 * 90 A 80 B 70 C 60 D F
	 * 
	 * 국어 등급:
	 * 수학 등급:
	 * 영어 등급:
	 * 
	 */
//	Scanner in = new Scanner(System.in);
//	
//	int[] scores = new int[3];
//	String[] subject = {"국어, 수학, 영어"};
//	for(int i =0; i<scores.length; i++) {
//		System.out.println("국어, 수학, 영어>");
//		scores[i] = in.nextInt();
//		String res="";
//		
//		if(scores[i] >= 90) {
//			res = "A";
//		}else if(scores[i] >=80) {
//			res = "B";
//		}else if(scores[i] >=70) {
//			res = "C";
//		}else if(scores[i] >=60) {
//			res = "D";
//		}else {
//			res = "F";
//		}
//		System.out.println(subject[i]+res+"입니다");
//	}

