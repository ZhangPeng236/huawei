package No108_最小公倍数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a * b / getGreatestCommonDivisor(a, b));
		}
		scanner.close();
	}

	private static int getGreatestCommonDivisor(int a, int b) {
		if (a == b)
			return a;
		else {
			int big = a > b ? a : b;
			int small = a < b ? a : b;
			return getGreatestCommonDivisor(big - small, small);
		}
	}
}