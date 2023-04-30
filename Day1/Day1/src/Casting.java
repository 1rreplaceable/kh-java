
public class Casting {

	public static void main(String[] args) {
		// 형변환
		// 강제적으로 형변환 (명시적)
		// - 프로그래머가 강제적으로 변환을 한다.
		
		System.out.println((double)1);
		System.out.println((int)1.2545);
		
		// 자동적으로 형변환 (묵시적)
		System.out.println(1 + 1.1);
		
		// 변수: 값 저장
		
		int a = (int)1.1;
		double b = 10;
		
		// 정수 + 정수 = 정수
		// 실수 + 실수 = 실수
		// 정수 + 실수 = 실수
		
		// 소수점 자리 표현
		// %f .6자리
		// %lf .15자리
		System.out.printf("%f \n",1.123456);
		System.out.printf("%.5f \n",1.123456);
		System.out.printf("%.4f \n",1.123456);
		System.out.printf("%.3f \n",1.123456);
		System.out.printf("%.2f \n",1.123456);
		System.out.printf("%.1f \n",1.123456);
		/*
		 * %d   정수표현
		 * %c   한문자
		 * %s   문자열  
		
		 */
		System.out.println();
	}

}
