package lotto;

import java.util.Iterator;
import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");

		while (true) {
			System.out.println("=====***** 메인메뉴 *****=====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			int choiceMain = sc.nextInt();
			switch (choiceMain) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				mainMenu();
				break;
			}
		}
	}

	public void insertObject() {
		System.out.println("추가할 추첨 대상 수 : ");
		int addNum = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < addNum; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phnum = sc.nextLine();

			Lottery l = new Lottery(name, phnum);
			if (lc.insertObject(l)) {
			} else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println("추가 완료되었습니다.");
	}

	public void deleteObject() {
		sc.nextLine();
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phnum = sc.nextLine();
		Lottery l = new Lottery(name, phnum);
		
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void winObject() {
		System.out.println(lc.winObject());
		
	}

	public void sortedWinObject() {
		Iterator<Lottery> iter = lc.winObject().iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	public void searchWinner() {
		sc.nextLine();
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phnum = sc.nextLine();
		Lottery l = new Lottery(name, phnum);
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}

}
