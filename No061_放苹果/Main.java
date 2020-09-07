package No061_·ÅÆ»¹û;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			System.out.println(count(m, n));
		}
		scanner.close();
	}

	public static int count(int m, int n) {
		if (m < 0 || n < 1) {
			return 0;
		} else if (m == 0 || n == 1 || m == 1) {
			return 1;
		} else {
			return count(m, n - 1) + count(m - n, n);
		}
	}
}