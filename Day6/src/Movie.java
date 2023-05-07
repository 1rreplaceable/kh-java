import java.util.Scanner;

/*
 *  showMenu() -> 1번누르면 예매 2.종료 
 *  
 *  showSeat() -> 자리를 표시하는 함수 
 *  
 *  choicSeat() ->  좌석을 예매하는 명령문을 담은 함수 
 *  
 *  showSales() -> 총 매출액을 출력하는 함수 
 *  
 */


class Ex07{
	int[] seat = new int[7];
	int money = 0;
	Scanner scan = new Scanner(System.in);
	
	public Ex07() {}
	
	//생성자를 이용해서 객체 생성시 scan
	public Ex07(Scanner scan) {
		this.scan = scan;
	}
	
	// 예약하는 함수
	void choicSeat() {
		
		System.out.println("좌석의 번호를 입력>");
		int idx = scan.nextInt() -1;
		
		if(this.seat[idx] == 0) {
			this.seat[idx] = 1; 
			this.money = this.money + 12000;
		}else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}		
	}
	
	// 자리를 출력 
	void showSeat() {
		
		for(int i=0; i < this.seat.length; i++ ) {
			
			// 0은 빈좌석 
			if(this.seat[i] == 0) {
				System.out.print("[ ]");
			}else {
				System.out.print("[O]");
			}			
		}// 반복문 끝
		System.out.println();	
	}	
	
}//클래스 끝!


public class Movie {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex07 e = new Ex07();
		
		while(true) {
			
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				e.showSeat();	
				e.choicSeat();			
			}
			else if(sel == 2) {
				break;
			}
		}
	}
}