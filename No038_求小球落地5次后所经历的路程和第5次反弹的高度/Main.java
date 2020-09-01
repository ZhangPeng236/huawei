package No038_��С�����5�κ���������·�̺͵�5�η����ĸ߶�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int height = scanner.nextInt();
			System.out.println(getTotal(height, 5));
			System.out.println(getLast(height, 5));
		}
	}

	public static double getTotal(int height, int times) {
		if (times == 1) {
			return height;
		} else {
			return getTotal(height, times - 1) + getLast(height, times - 1) * 2;
		}
	}

	public static double getLast(int height, int times) {
		if (times == 1) {
			return height / 2.0;
		} else {
			return getLast(height, times - 1) / 2.0;
		}
	}
}