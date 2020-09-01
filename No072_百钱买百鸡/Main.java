package No072_°ÙÇ®Âò°Ù¼¦;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			for (int x = 0; x <= 14; x++) {
				if ((100 - 7 * x) % 4 == 0) {
					int y = (100 - 7 * x) / 4;
					int z = 100 - x - y;
					if (z >= 0) {
						System.out.println(x + " " + y + " " + z);
					}
				}
			}
		}
	}
}