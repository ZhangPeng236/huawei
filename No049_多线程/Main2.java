package No049_∂‡œﬂ≥Ã;

import java.util.Scanner;

class MyThread implements Runnable {
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("th1")) {
			System.out.print("A");
		} else if (Thread.currentThread().getName().equals("th2")) {
			System.out.print("B");
		} else if (Thread.currentThread().getName().equals("th3")) {
			System.out.print("C");
		} else if (Thread.currentThread().getName().equals("th4")) {
			System.out.print("D");
		}
	}
}

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			MyThread myThread = new MyThread();
			for (int i = 0; i < src; i++) {
				Thread t1 = new Thread(myThread, "th1");
				Thread t2 = new Thread(myThread, "th2");
				Thread t3 = new Thread(myThread, "th3");
				Thread t4 = new Thread(myThread, "th4");
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				t3.start();
				t3.join();
				t4.start();
				t4.join();
			}
			System.out.println();
		}
		scanner.close();
	}
}