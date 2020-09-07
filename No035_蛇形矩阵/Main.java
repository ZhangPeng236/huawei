package No035_ÉßĞÎ¾ØÕó;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int[][] num = new int[n][n];
			num[0][0] = 1;
			for (int i = 1; i < n; i++) {
				num[i][0] = num[i - 1][0] + i;
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = 1; j < n - i; j++) {
					num[i][j] = num[i][j - 1] + i + j + 1;
				}
			}
			for (int i = 0; i < n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < n - i; j++) {
					sb.append(num[i][j]).append(" ");
				}
				System.out.println(sb.toString().trim());
			}
		}
		scanner.close();
	}
}