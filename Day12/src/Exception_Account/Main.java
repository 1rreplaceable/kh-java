package Exception_Account;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Account a1 = new Account("1", "x", 1234, 150);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("비밀번호 입력");
			int mypw = sc.nextInt();

			try {
				a1.check(mypw);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

//		Class명 : Account
//		속성 : no(계좌), name(예금주), private money(잔액)
//		생성자(기본 생성자 – 매개변수 O )
//		no=x
//		name=y
//		money=z
//		기능 : deposit() , withdraw()
//		deposit() : 매개변수만큼 예금(단위 만원)
//		withdraw() : 매개변수 만큼 출금(단위 만원)

		// 출금액이 부족하면 한도초과 예외처리

		// check(): 비밀번호를 입력 받는다
		// 계좌등록시 입력한 비밀번호 현재 입력 비밀번호 비교
		// 맞다면 출금 함수를 호출
		// 예외처리 "비밀번호가 맞지 않습니다 확인하세요"

		// 체크카드 발급
		// 카드번호 카드 비밀번호 외부에 접근이 불가능한 private
		// account 계좌의 내용을 체크카드가 상속
		// pay() 만들어서 결제할 카드금액을 account 가지고 있는 출금 메서드로 넘긴다
		// 결과를 돌려받는다 카드금액만큼 결제되면 결제완료
		// 예외적인 상황 한도초과

		// 카드로 결제

	}

}
