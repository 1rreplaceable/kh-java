package array;

public class ArrayEx03 {

	public static void main(String[] args) {

		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		int index = 0;
		int max_index = 0;
		while(index < 5) {
			if(scores[index] >= scores[max_index]) {
				max_index = index;
			}index++;
		}
		System.out.println(hakbuns[max_index]+"번(" + scores[max_index] + "점)");
	}

}
