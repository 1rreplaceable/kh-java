package bookModel;

import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	Book[] bArr = new Book[10];
	int k = 0;
	public BookMenu() {
		bc.makeFile();

	}

	public void mainMenu() {
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		System.out.println("메뉴 번호 : ");
		int choiceMenu = sc.nextInt();
		sc.nextLine();
		switch (choiceMenu) {
		case 1:
			fileSave();
			break;
		case 2:
			fileRead();
			break;
		case 9:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			break;
		}
	}

	public void fileSave() {
		Calendar cal = Calendar.getInstance();
		System.out.println("도서 명 :");
		String title = sc.nextLine();
		System.out.println("저자 명 :");
		String author = sc.nextLine();
		System.out.println("도서 가격 :");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("출판 날짜(yyyy-mm-dd) :");
		String date = sc.nextLine();
		System.out.println("할인율 :");
		double discount = sc.nextDouble();
		String[] calendar = date.split("-");
		int year = Integer.parseInt(calendar[0]);
		int month = Integer.parseInt(calendar[1]);
		int day = Integer.parseInt(calendar[2]);

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, day);
		
		Book b = new Book(title, author, price, cal, discount);
		
		bArr[k++] = b;
		bc.fileSave(bArr);
		mainMenu();
		
	}

	public void fileRead() {
		System.out.println(bc.fileRead());
	}
}
