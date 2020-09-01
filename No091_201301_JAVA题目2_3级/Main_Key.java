package No091_201301_JAVAÌâÄ¿2_3¼¶;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(jc(n + m) / jc(n) / jc(m));
		}
	}

	private static int jc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}