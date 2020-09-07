package No062_查找输入整数二进制中1的个数;

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