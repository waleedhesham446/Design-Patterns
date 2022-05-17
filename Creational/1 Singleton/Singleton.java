/**
 * Singleton
 */

public class Singleton {

    public static void main(String[] args) {
        new Thread(new Runnable() {
			public void run() {
                Counter counter1 = Counter.getInstance();
                counter1.addOne();
                System.out.println(counter1.count);
            }
		}).start();

        new Thread(new Runnable() {
			public void run() {
                Counter counter2 = Counter.getInstance();
                counter2.addOne();
                System.out.println(counter2.count);
            }
		}).start();
    }
}