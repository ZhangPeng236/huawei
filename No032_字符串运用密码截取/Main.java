package No032_�ַ������������ȡ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			wc: for (int max = src.length(); max > 0; max--) {
				for (int j = 0; j < src.length() - max; j++) {
					String temp = src.substring(j, j + max);
					if (temp.equals(new StringBuilder(temp).reverse().toString())) {
						System.out.println(max);
						break wc;
					}
				}
			}
		}
		scanner.close();
	}
}