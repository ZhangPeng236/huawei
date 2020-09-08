package No032_×Ö·û´®ÔËÓÃÃÜÂë½ØÈ¡;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			wc: for (int max = src.length(); max > 0; max--) {
				for (int j = 0; j <= src.length() - max; j++) {
					if (src.contains(new StringBuilder(src.substring(j, j + max)).reverse())) {
						System.out.println(max);
						break wc;
					}
				}
			}
		}
		scanner.close();
	}
}