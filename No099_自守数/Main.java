package No099_здЪиЪ§;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			System.out.println(calcAutomorphicNumbers(scanner.nextInt()));
		}
		scanner.close();
	}

	public static int calcAutomorphicNumbers(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (String.valueOf(i * i).endsWith(String.valueOf(i)))
				count++;
		}
		return count;
	}
}