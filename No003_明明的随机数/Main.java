package No003_明明的随机数;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = scanner.nextInt();
			}
			Arrays.sort(numbers);
			for (int i = 0; i < n; i++) {
				if (i == 0 || numbers[i] != numbers[i - 1]) {
					System.out.println(numbers[i]);
				}
			}
		}
		scanner.close();
	}
}