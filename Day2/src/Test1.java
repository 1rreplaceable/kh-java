import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int firstScore = 100;
		int com = r.nextInt(100) + 1;
		
		while(true) {
			System.out.println("1 ~ 100 사이의 수를 입력하시오");
			int my = in.nextInt();
			
			if (com == my) {
				System.out.println("정답이므로 게임종료");
				break;
			}else {
				firstScore -= 5;
				String msg="";
				msg = com > my ? "크다" : "작다"; 
				System.out.println(msg);
			}
			if (firstScore == 0) {
				System.out.println("점수가 0이되어 게임종료");
				break;
			}
		}
		
		
		
		
		
	}

}
