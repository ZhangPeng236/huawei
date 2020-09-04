package No051_输出单向链表中倒是第k个结点;

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
			int k = scanner.nextInt();
			if (k > 0 && k <= n) {
				System.out.println(numbers[n - k]);
			} else {
				System.out.println(k);
			}
		}
		scanner.close();
	}
}