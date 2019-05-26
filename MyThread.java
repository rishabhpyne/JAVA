import java.util.Scanner;

public class MyThread {
	private  boolean running = true;

	public void stopRunning() {
		running = false;
	}

	Thread t7 = new Thread(new Runnable() {
		public void run() {
			while (running) {
				System.out.println("run..");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
 
			}
		}
	});

	public static void main(String[] args) {
		Thread2 a = new Thread2();
 
		a.t7.start();
		System.out.println("press any key to stop");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have pressed " + sc.next() + "\n now calling stopRunning()");
		sc.close();
		a.stopRunning();
	}

}

