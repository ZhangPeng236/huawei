package No076_尼科彻斯定理;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();
			System.out.println(getSequeOddNum(m));
		}
	}

	public static String getSequeOddNum(int m) {
		StringBuilder sb = new StringBuilder();
		int a1 = m * m - m + 1;
		sb.append(a1);
		for (int i = 1; i < m; i++) {
			sb.append("+");
			sb.append(a1 + 2 * i);
		}
		return sb.toString();
	}
}