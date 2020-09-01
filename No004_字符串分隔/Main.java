package No004_×Ö·û´®·Ö¸ô;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			StringBuilder stringBuilder = new StringBuilder();
			String str = scanner.nextLine();
			stringBuilder.append(str);
			int size = stringBuilder.length();
			int addZero = 8 - size % 8;
			if (addZero > 0 && addZero < 8) {
				while (addZero > 0) {
					stringBuilder.append('0');
					addZero--;
				}
			}
			String str1 = stringBuilder.toString();
			while (str1.length() > 0) {
				System.out.println(str1.substring(0, 8));
				str1 = str1.substring(8);
			}

		}
	}
}