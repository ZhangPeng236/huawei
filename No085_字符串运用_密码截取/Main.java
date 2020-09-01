package No085_×Ö·û´®ÔËÓÃ_ÃÜÂë½ØÈ¡;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			StringBuilder sb = new StringBuilder(src);
			sb.reverse();
			wc: for (int max = src.length(); max > 0; max--) {
				for (int j = 0; j <= src.length() - max; j++) {
					if (src.contains(sb.substring(j, j + max))) {
						System.out.println(max);
						break wc;
					}
				}
			}
		}
		scanner.close();
	}
}