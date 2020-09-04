package No006_质数因子;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLong()) {
			long src = scanner.nextLong();
			System.out.println(getResult(src));
		}
		scanner.close();
	}

	public static String getResult(long src) {
		StringBuilder result = new StringBuilder();
		for (long i = 2; i <= src; i++) {
			if (src % i == 0) {
				result.append(i + " ");
				src = src / i;
				i = 1;
			}
		}
		return result.toString();
	}
}