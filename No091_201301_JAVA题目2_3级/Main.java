package No091_201301_JAVAÌâÄ¿2_3¼¶;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(result(n, m));
		}
		scanner.close();
	}

	private static int result(int n, int m) {
		if (n == 0 || m == 0) {
			return 1;
		} else {
			return result(n - 1, m) + result(n, m - 1);
		}
	}
}