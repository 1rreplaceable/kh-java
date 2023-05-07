package Stack;

import java.util.Stack;

public class ArrayStack {

	int top; // 마지막 데이터가 어디인지 알려주는 방번호(인데스)
	int size; // 스택 배열의 크기
	int[] stack = new int[7];

	// 기본생성자
	ArrayStack() {
	}

	ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	// 추가
	void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + "push");
	}

	// 삭제
	void pop() {
		System.out.println(stack[top] + "pop");
		int pop = stack[top];
		stack[top] = 0;
		top -= 1;
	}

	// 조회
	void peek() {
		System.out.println(stack[top] + "peek");
	}

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<>();
		
		// 추가
		stack1.push(10);
		
		// 삭제
		stack1.pop();
		stack1.remove(10);
		
		// 조회
		stack1.peek();

		// 스택 객체 생성

		ArrayStack stack = new ArrayStack(7);

		// 함수실행
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.peek();

		// void remove() 값 삭제, 객체리턴 pop() 인덱스 삭제
		// remove 삭제한 값을 확인시키지 않고 그냥 삭제
		// pop 삭제한 값을 프로그래머한테 보여준다.
		stack.pop();
		stack.pop();
		stack.pop();

		/*
		 * 자료구조란? -데이터를 효율적으로 다룰 수 있게 도와주는 데이터보관 방법 -효율적(검색, 삭제, 추가) 쉬워야한다
		 * 
		 * 스택(Stack) -컴퓨터에서 아주 많이 사용되는 자료구조
		 * 
		 * 
		 */
	}

}
