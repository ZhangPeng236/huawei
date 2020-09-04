package No053_iNOC产品部_杨辉三角的变形;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		wc: while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int[][] numbers = new int[n][2 * n + 1];
			numbers[0][n] = 1;
			for (int i = 1; i < n; i++) {
				for (int j = n - i; j <= n + i; j++) {
					numbers[i][j] = numbers[i - 1][j - 1] + numbers[i - 1][j] + numbers[i - 1][j + 1];
				}
			}
			for (int j = 1; j < 2 * n; j++) {
				if (numbers[n - 1][j] % 2 == 0) {
					System.out.println(j);
					continue wc;
				}
			}
			System.out.println(-1);
		}
		scanner.close();
	}
}