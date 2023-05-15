package Thread_wait_notify;

public class Main {

	public static void main(String[] args) {

		final Dish d = new Dish();
		new Thread(new Customer(d)).start();
		new Thread(new Cook(d)).start();
	}

}
