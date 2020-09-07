package No069_æÿ’Û≥À∑®;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int ax = scanner.nextInt();
			int xy = scanner.nextInt();
			int by = scanner.nextInt();
			int[][] a = new int[ax][xy];
			int[][] b = new int[xy][by];
			int[][] c = new int[ax][by];
			for (int i = 0; i < ax; i++) {
				for (int j = 0; j < xy; j++) {
					a[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < xy; i++) {
				for (int j = 0; j < by; j++) {
					b[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < ax; i++) {
				for (int j = 0; j < by; j++) {
					int temp = 0;
					for (int k = 0; k < xy; k++) {
						temp += a[i][k] * b[k][j];
					}
					c[i][j] = temp;
				}
			}
			for (int[] tempx : c) {
				for (int tempxy : tempx) {
					System.out.print(tempxy + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}