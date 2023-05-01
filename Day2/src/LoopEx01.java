
public class LoopEx01 {

	public static void main(String[] args) {

		/*
		 * 반복문
		 * while(조건문){
		 *  // 참인동안 반복하는 문장들
		 *  
		 * }
		 * for
		 * 
		 * 
		 */
		
		int i = 1;
		while (i <= 10) {
			if(i > 4 && i < 10) {
				System.out.printf("%d ", i);
			}
		i++;
		
		}
		System.out.println();
		
		int j = 10;
		while (j >= 1) {
			if(j > 2 && j < 7) {
				System.out.printf("%d ", j);
			}
		j--;
		}
		
		
	}

}
