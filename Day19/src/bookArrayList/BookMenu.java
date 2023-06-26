package bookArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		System.out.println("******** 메인메뉴 ********");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차수 정렬");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택 : ");
		int choiceMenu = sc.nextInt();
		sc.nextLine();
		switch (choiceMenu) {
		case 1:
			insertBook();
			mainMenu();
			break;
		case 2:
			selectList();
			mainMenu();
			break;
		case 3:
			searchBook();
			mainMenu();
			break;
		case 4:
			deleteBook();
			mainMenu();
			break;
		case 5:
			ascBook();
			mainMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			break;
		}
	}

	public void insertBook() {
		String category = "";
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.println("도서 명 : ");
		String title = sc.nextLine();
		System.out.println("저자 명 : ");
		String author = sc.nextLine();
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int categoryNum = sc.nextInt();
		switch (categoryNum) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			category = "외국어";
			break;
		case 4:
			category = "기타";
			break;
		}
		System.out.println("가격 : ");
		int price = sc.nextInt();

		Book b = new Book(title, author, category, price);
		
		bc.insertBook(b);
	}

	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.addAll(bc.selectList());
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
	}

	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.println("검색 키워드 : ");
		String keyword = sc.nextLine();
		System.out.println(bc.searchBook(keyword));
	}

	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		Book remove = bc.deleteBook(title, author);

		if(remove!=null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
