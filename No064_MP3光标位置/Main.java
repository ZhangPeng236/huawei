package No064_MP3¹â±êÎ»ÖÃ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = Integer.valueOf(scanner.next());
			String str = scanner.next();
			int top = 1, cur = 1;
			if (num > 4) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == 'U') {
						if (cur == top) {
							top = top == 1 ? num - 3 : top - 1;
						}
						cur = cur == 1 ? num : cur - 1;
					} else if (str.charAt(i) == 'D') {
						if (cur == top + 3) {
							top = cur == num ? 1 : top + 1;
						}
						cur = cur == num ? 1 : cur + 1;
					}
				}
				for (int i = 0; i < 3; i++) {
					System.out.print(top + i + " ");
				}
				System.out.println(top + 3);
				System.out.println(cur);
			} else if (num >= 1 && num <= 3) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == 'U') {
						cur = cur == 1 ? num : cur - 1;
					} else if (str.charAt(i) == 'D') {
						cur = cur == num ? 1 : cur + 1;
					}
				}
				for (int i = 1; i < num; i++) {
					System.out.print(i + " ");
				}
				System.out.println(num);
				System.out.println(cur);
			}
		}
	}
}