package No065_查找两个字符串a_b中的最长公共子串;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			String shorter = a.length() >= b.length() ? b : a;
			String longer = a.length() >= b.length() ? a : b;
			int maxLength = shorter.length();
			wc: for (int i = maxLength; i > 0; i--) {
				for (int j = 0; j <= shorter.length() - i; j++) {
					String temp = shorter.substring(j, j + i);
					if (longer.contains(temp)) {
						System.out.println(temp);
						break wc;
					}
				}
			}
		}
		scanner.close();
	}
}