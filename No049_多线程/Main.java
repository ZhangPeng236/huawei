package No049_∂‡œﬂ≥Ã;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < src; i++) {
				sb.append("ABCD");
			}
			System.out.println(sb.toString());
		}
		scanner.close();
	}
}