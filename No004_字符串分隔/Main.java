package No004_×Ö·û´®·Ö¸ô;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.nextLine();
			StringBuilder sb = new StringBuilder(src);
			int len = sb.length();
			int addZero = 8 - len % 8;
			if (addZero != 8) {
				for (int i = 0; i < addZero; i++) {
					sb.append("0");
				}
			}
			int n = sb.length() / 8;
			String[] newArray = new String[n];
			for (int i = 0; i < n; i++) {
				newArray[i] = sb.substring(i * 8, i * 8 + 8);
			}
			for (String s : newArray) {
				System.out.println(s);
			}
		}
		scanner.close();
	}
}