package Variable;

class Player{
	String name;
	int[] points;
	
	public Player(String name, int[] points) {
		this.name = name;
		this.points = points;
	}
	void printTotalPoints() {
		System.out.println(name + " -> " + totalPoints() + " 점");
	}
	int totalPoints() {
		int sum = 0;
		for (int num : points) {
			sum += num;
		}
		return sum;
	}
}

public class RefrenceEx {

	public static void main(String[] args) {

		int[] points0 = {10,9,9,8};
		int[] points1 = {9,10,9,9};
		int[] points2 = {10,9,10,10};
		
		Player[] list = new Player[3];
		Player p0 = new Player("Kim", points0);
		Player p1 = new Player("Lee", points1);
		Player p2 = new Player("Park", points2);
		
		list[0] = p0;
		list[1] = p1;
		list[2] = p2;
		
		for (Player player : list) {
			player.printTotalPoints();
		}
		
	}

}
