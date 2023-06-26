import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		mainMenu m = new mainMenu();
		Scanner sc = new Scanner(System.in);
		Boolean quit = false;
		System.out.println("당신의 이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("연락처를 입력하세요 : ");
		String number = sc.next();
		while (quit != true) {
			System.out.println("**********************************************");
			System.out.println("\tWelcome to Shopping Mall");
			System.out.println("\tWelcome to Book Market");
			System.out.println("**********************************************");
			System.out.println("1. 고객 정보 확인하기		4. 장바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기	5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기		6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기		8. 종료");
			System.out.println("9. 관리자 로그인           10. 1:1채팅하기");
			System.out.println("**********************************************");

			System.out.print("메뉴번호를 선택해주세요");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice < 1 || choice > 10) {
				System.out.println("1부터 10까지의 숫자를 입력하세요");
			} else {
				switch (choice) {
				case 1:
					System.out.println("1. 고객 정보 확인하기");
					m.menuGuestInfo(name, number);
					break;
				case 2:
					System.out.println("2. 장바구니 상품 목록 보기");
					m.menuCartItemList();
					break;
				case 3:
					System.out.println("3. 장바구니 비우기");
					m.menuCartClear();
					break;
				case 4:
					System.out.println("4. 바구니에 항목 추가하기");
					m.menuCartAddItem();
					break;
				case 5:
					System.out.println("5. 장바구니의 항목 수량 줄이기");
					m.menuCartRemoveItemCount();
					break;
				case 6:
					System.out.println("6. 장바구니의 항목 삭제하기");
					m.menuCartRemoveItem();
					break;
				case 7:
					System.out.println("7. 영수증 표시하기");
					m.menuCartBill(name, number);
					break;
				case 8:
					System.out.println("8. 종료");
					m.menuExit();
					quit = true;
					break;
				case 9:
					System.out.println("9. 관리자 로그인");
					System.out.println("관리자 정보를 입력하세요");
					System.out.print("아이디 : ");
					String id = sc.nextLine();
					System.out.print("비밀번호 : ");
					String pw = sc.nextLine();
					System.out.println("이름 " + name + "   연락처" + number);
					System.out.println("아이디 " + id + "   비밀번호" + pw);
					break;
				case 10: {
					BufferedReader in = null;
					BufferedWriter out = null;
					Socket socket = null;
					try {
						socket = new Socket("localhost", 9999);

						in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

						while (true) {
							System.out.println("사용자 >");
							String outputMessage = sc.nextLine();

							if (outputMessage.equalsIgnoreCase("bye")) {
								out.write(outputMessage + "\n");
								out.flush();
								break; // 서버로 전송 후 끝내기
							}

							out.write(outputMessage + "\n");
							out.flush();
							String inputMessage = in.readLine();
							System.out.println("서버: " + inputMessage);
						}

					} catch (IOException e) {
					} finally {
						try {
							if (socket != null)
								socket.close(); // 통신 소켓 닫기
						} catch (IOException e) {
							System.out.println("서버와 채팅 중 오류 발생");
						}

					}
					break;
				}
				}
			}
		}
	}
}
