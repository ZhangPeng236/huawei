package No062_��������������������1�ĸ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			int count = 0;
			while (src != 0) {
				src &= src - 1;
				count++;
			}
			System.out.println(count);
		}
		scanner.close();
	}
}