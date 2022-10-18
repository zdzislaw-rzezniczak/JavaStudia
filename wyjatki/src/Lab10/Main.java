package Lab10;


public class Main {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("watek " + i);
			}
		});
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("watek " + i);
		}
	}
}
