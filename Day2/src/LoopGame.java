import java.util.Random;
import java.util.Scanner;

public class LoopGame {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int cnt = 0;
		int score = 0;
		while(cnt < 5) {
			int x = r.nextInt(8) + 2;
			int y = r.nextInt(9) + 1;
			System.out.println(x + " x " + y + "= ?");
			System.out.println("정답>");
			int answer = in.nextInt();
			if (answer == x * y) {
				score += 20;
			}
			cnt++;
		}
		System.out.println("총점은: " + score);
	}

}
