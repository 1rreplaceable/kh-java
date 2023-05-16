package Exception_Kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		while (true) {
			System.out.println("1.고객계좌등록  2.고객조회  3.고객정렬");
			System.out.println("================================");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				a.insert();
				break;
			case 2:
				System.out.println("찾으시는 계좌번호 입력>");
				int choiceno = sc.nextInt();
				try {
					a.search(choiceno);
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 3:
				
				
				break;
			}
		}

		// 카카오뱅크 (인터페이스,상속)
		// 카카오뱅크에서 계좌를 관리하는 list private static
		//
		// 1. 고객계좌 등록 insert() 입력을 받아서 account 객체 생성해서
		// 고객 관리 리스트에 저장한다.

		// 2. 고객 조회
		// 고객 계좌번호로 찾을 건지 !
		// 맞는 계좌번호 가 있다면 고객의 정보를 출력하는 메서드 이용
		// 없으면 찾는 고객이 없습니다!

		// 3. 고객 정렬
		// 버블정렬을 이용해서 정렬 안에 있는 내용들 출력
		// 고객 id 추가 문자 숫자 id를 기준으로 정렬!

		// 0. 종료!

		// 예외처리 0~3사이 숫자 아니다 "메뉴번호 잘못 입력했습니다"

		// 5명 임의의대로 저장
	}

}
