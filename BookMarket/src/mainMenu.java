import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {
	Welcome w = new Welcome();
	Person p;
	Scanner in = new Scanner(System.in);
	int cnt = 1;
	ArrayList<CartItem> cartList = new ArrayList<>();
	Book b1 = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서 ",
			"2018/10/08");
	Book b2 = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서 ", "2022/01/22");
	Book b3 = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문 ", "2019/06/10");

	public void menuGuestInfo(String name, String number) {
		p = new Person(name, number, "없음");
		System.out.println("이름: " + name + "   연락처: " + number);
	}

	public void menuCartItemList() {
		System.out.println("--------------------------------------------");
		System.out.println("도서ID  |   수량   |    합계");
		for (CartItem cart : cartList) {
			System.out.println(cart);
		}
	}

	public void menuCartClear() {
		System.out.println("장바구니의 모든 항목을 삭제하시겠습니까? Y | N ");
		String yn = in.nextLine();
		if (yn.equals("Y") || yn.equals("y")) {
			cartList.removeAll(cartList);
			System.out.println("장바구니의 모든 항목을 삭제했습니다.");
		}

	}

	public void menuCartAddItem() {

		CartItem c = new CartItem();
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		for (Book book : bookList) {
			System.out.println(book);
		}
		System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
		String bookID = in.nextLine();
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).BookId.equals(bookID)) {
				c.setBookId(bookID);
				c.setTotalPrice(bookList.get(i).UnitPrice);
				c.setQuantity(1);
			}
		}
		for (int i = 0; i < cartList.size(); i++) {
			if (cartList.get(i).getBookId().equals(bookID)) {
				c.setTotalPrice(c.getTotalPrice() * (cartList.get(i).getQuantity() + 1));
			}

		}
		for (int i = 0; i < cartList.size(); i++) {
			if (cartList.get(i).getBookId().equals(bookID)) {
				c.setQuantity(cartList.get(i).getQuantity() + 1);
				cartList.remove(i);
			} else {
				c.setQuantity(1);
			}
		}

		System.out.println("장바구니에 추가하시겠습니까? Y | N ");
		String yn = in.nextLine();
		if (yn.equals("Y") || yn.equals("y")) {
			cartList.add(c);
		}
	}

	public void menuCartRemoveItemCount() {
		System.out.print("삭제할 도서의 ID를 입력하세요 : ");
		String deleteID = in.nextLine();

		for (int i = 0; i < cartList.size(); i++) {
			if (cartList.get(i).getBookId().equals(deleteID)) {
				System.out.print("수량 : ");
				int deleteQuatity = in.nextInt();
				if (cartList.get(i).getQuantity() > 1) {
					cartList.get(i).setTotalPrice(
							((cartList.get(i).getTotalPrice()) * (cartList.get(i).getQuantity() - deleteQuatity))
									/ (cartList.get(i).getQuantity()));
					cartList.get(i).setQuantity(cartList.get(i).getQuantity() - deleteQuatity);
				} else {
					cartList.remove(i);
				}
			} else {
				continue;
			}
		}
	}

	public void menuCartRemoveItem() {
		System.out.println("--------------------------------------------");
		System.out.println("도서ID    |    수량    |    합계");
		for (CartItem cart : cartList) {
			System.out.println(cart);
		}
		System.out.print("삭제할 도서의 ID를 입력하세요 : ");
		String deleteID = in.nextLine();
		System.out.println("장바구니의 항목을 삭제하시겠습니까? Y | N ");
		String yn = in.nextLine();
		if (yn.equals("Y") || yn.equals("y")) {
			for (int i = 0; i < cartList.size(); i++) {
				if (cartList.get(i).getBookId().equals(deleteID)) {
					cartList.remove(i);
				} else {
					continue;
				}
			}

		}

	}

	public void menuCartBill(String name, String number) {
		int total = 0;
		System.out.println("배송받을 분은 고객정보와 같습니까? Y | N");
		String yn = in.nextLine();
		if (yn.equals("Y") || yn.equals("y")) {
			System.out.println("배송지를 입력해주세요");
			String address = in.nextLine();
			System.out.println("---------------배송 받을 고객 정보---------------");
			System.out.println("고객명 : " + name + "\t\t연락처 : " + number);
			System.out.println("배송지 : " + address);
			System.out.println("장바구니 상품 목록 : ");
			System.out.println("--------------------------------------------");
			System.out.println("도서ID    |    수량    |    합계");
			for (CartItem cart : cartList) {
				System.out.println(cart);
				total += cart.getTotalPrice();
			}
			System.out.println("--------------------------------------------");
			System.out.println("주문 총금액 : "+ total + "원");
		}
	}

	public void menuExit() {
	}

}
