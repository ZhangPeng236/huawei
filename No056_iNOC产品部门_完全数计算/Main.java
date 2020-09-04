package No056_iNOC��Ʒ����_��ȫ������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			System.out.println(count(n));
		}
		scanner.close();
	}

	public static int count(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (is(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean is(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	}
}