package No037_统计每个月兔子的总数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int month = scanner.nextInt();
			System.out.println(getTotalCount(month));
		}
	}

	public static int getTotalCount(int monthCount) {
		if (monthCount == 1 || monthCount == 2) {
			return 1;
		} else {
			return getTotalCount(monthCount - 2) + getTotalCount(monthCount - 1);
		}
	}
}