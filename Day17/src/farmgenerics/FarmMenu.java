package farmgenerics;

import java.util.Scanner;

public class FarmMenu {

	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();

	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 직원 메뉴");
		System.out.println("2. 손님 메뉴");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택: ");
		int choiceMain = sc.nextInt();

		switch (choiceMain) {
		case 1:
			adminMenu();
			break;
		case 2:
			customerMenu();
			break;
		case 3:
			System.out.println("프로그램 종료");
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void adminMenu() {
		System.out.println("******* 직원 메뉴 *******");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 종류 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 선택: ");
		int choiceAdmin = sc.nextInt();

		switch (choiceAdmin) {
		case 1:
			addNewKind();
			adminMenu();
			break;
		case 2:
			removeKind();
			adminMenu();
			break;
		case 3:
			changeAmount();
			adminMenu();
			break;
		case 4:
			printFarm();
			adminMenu();
			break;
		case 9:
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}

	}

	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();

		System.out.println("******* 고객 메뉴 *******");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 선택: ");
		int choiceCust = sc.nextInt();
		switch (choiceCust) {
		case 1:
			buyFarm();
			customerMenu();
			break;
		case 2:
			removeFarm();
			customerMenu();
			break;
		case 3:
			printBuyFarm();
			customerMenu();
			break;
		case 9:
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void addNewKind() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("이름 : ");
			String nameF = sc.nextLine();
			System.out.print("수량 : ");
			int amountF = sc.nextInt();
			Fruit f = new Fruit("과일", nameF);
			if (fc.addNewKind(f, amountF)) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		case 2:
			System.out.print("이름 : ");
			String nameV = sc.nextLine();
			System.out.print("수량 : ");
			int amountV = sc.nextInt();
			Vegetable v = new Vegetable("채소", nameV);
			if (fc.addNewKind(v, amountV)) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		case 3:
			System.out.print("이름 : ");
			String nameN = sc.nextLine();
			System.out.print("수량 : ");
			int amountN = sc.nextInt();
			Nut n = new Nut("견과", nameN);
			if (fc.addNewKind(n, amountN)) {
				System.out.println("새 농산물이 추가되었습니다.");
				
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void removeKind() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("삭제할 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("이름 : ");
			String nameF = sc.nextLine();

			Fruit f = new Fruit("과일", nameF);
			if (fc.removeKind(f)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}

			break;
		case 2:
			System.out.print("이름 : ");
			String nameV = sc.nextLine();

			Vegetable v = new Vegetable("채소", nameV);
			if (fc.removeKind(v)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		case 3:
			System.out.print("이름 : ");
			String nameN = sc.nextLine();

			Nut n = new Nut("채소", nameN);
			if (fc.removeKind(n)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}

	}

	public void changeAmount() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("수정할 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("이름 : ");
			String nameF = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amountF = sc.nextInt();
			Fruit f = new Fruit("과일", nameF);
			if (fc.changeAmount(f, amountF)) {
				System.out.println("농산물 수량이 수정되었습니다.");
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		case 2:
			System.out.print("이름 : ");
			String nameV = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amountV = sc.nextInt();
			Vegetable v = new Vegetable("채소", nameV);
			if (fc.changeAmount(v, amountV)) {
				System.out.println("농산물 수량이 수정되었습니다.");
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		case 3:
			System.out.print("이름 : ");
			String nameN = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amountN = sc.nextInt();
			Nut n = new Nut("채소", nameN);
			if (fc.changeAmount(n, amountN)) {
				System.out.println("농산물 수량이 수정되었습니다.");
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void printFarm() {
		System.out.println(fc.printFarm());
	}

	public void buyFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("구매 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("구매 할 것 : ");
		String buy = sc.nextLine();
		switch (num) {
		case 1:
			Fruit f = new Fruit("과일", buy);
			if (fc.buyFarm(f)) {
				System.out.println("구매에 성공하였습니다.");
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
			}
			break;
		case 2:
			Vegetable v = new Vegetable("채소", buy);
			if (fc.buyFarm(v)) {
				System.out.println("구매에 성공하였습니다.");
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
			}
			break;
		case 3:
			Nut n = new Nut("채소", buy);
			if (fc.buyFarm(n)) {
				System.out.println("구매에 성공하였습니다.");
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
			}
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void removeFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("취소 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("구매 취소할 것 : ");
		String buy = sc.nextLine();
		switch (num) {
		case 1:
			Fruit f = new Fruit("과일", buy);
			if (fc.buyFarm(f)) {
				System.out.println("구매 취소에 성공하였습니다.");
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시입력해주세요.");
			}
			break;
		case 2:
			Vegetable v = new Vegetable("채소", buy);
			if (fc.buyFarm(v)) {
				System.out.println("구매 취소에 성공하였습니다.");
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시입력해주세요.");
			}
			break;
		case 3:
			Nut n = new Nut("채소", buy);
			if (fc.buyFarm(n)) {
				System.out.println("구매 취소에 성공하였습니다.");
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시입력해주세요.");
			}
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}

	public void printBuyFarm() {
		System.out.println(fc.printBuyFarm());
	}
}
