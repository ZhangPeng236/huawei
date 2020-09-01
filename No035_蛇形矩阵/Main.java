package No035_ÉßĞÎ¾ØÕó;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[][] num = new int[n][];
			for (int i = 0; i < n; i++) {
				num[i] = new int[n - i];
			}

			num[0][0] = 1;
			for (int i = 1; i < n; i++) {
				num[i][0] = num[i - 1][0] + i;
				for (int j = 1; j <= i; j++) {
					num[i - j][j] = num[i][0] + j;
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(num[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}