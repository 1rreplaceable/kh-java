package Sort;

public class RecursionMain {

	public static void Function(int num) throws StackOverflowError{
		System.out.println("반갑습니다.");
		
		if(num == 0) {
			return;
		}
		Function(num-1);
	}
	
	public static int Function2(int num) {
		if(num == 1) {
			return 1;
		}
		return num + Function2(num-1);
	}
	
	public static void main(String[] args) {
		
		// 재귀 함수
		//  - 자기 자신을 다시 호출하여 문제를 해결해 가는 함수
		// StackOverflowError 스택이 넘쳐 흐를 수 있다.
		// 끝나는 조건을 잘 주어야된다.
		try {
			System.out.println(Function2(5));
		} catch (StackOverflowError e) {
			System.out.println("재귀함수 예외발생 조건 작성하기");
		}
	}
}
