package No055_¡∑œ∞Ã‚_ÃÙ7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			int count = 0;
			for (int i = 1; i <= src; i++) {
				if (i % 7 == 0 || String.valueOf(i).contains("7")) {
					count++;
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
}