package No022_ÆûË®Æ¿;

import java.util.Scanner;

public class Main {
	public static void main(String[] arge) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			if (src == 0) {
				System.exit(0);
			} else {
				System.out.println(src >> 1);
			}
		}
		scanner.close();
	}
}