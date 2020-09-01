package No036_×Ö·û´®¼ÓÃÜ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String key = scanner.nextLine();
			String data = scanner.nextLine();
			StringBuilder encrypt = new StringBuilder();
			StringBuilder oldOrder = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			StringBuilder newOrder = new StringBuilder();

			int i = 0;
			for (int j = 0; j < key.length(); j++) {
				boolean flag = false;
				for (int k = 0; k < i; k++) {
					if (newOrder.charAt(k) == Character.toUpperCase(key.charAt(j))) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					newOrder.append(Character.toUpperCase(key.charAt(j)));
					i++;
				}
			}

			for (char c = 'A'; c <= 'Z'; c++) {
				boolean flag = false;
				for (int k = 0; k < i; k++) {
					if (newOrder.charAt(k) == c) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					newOrder.append(c);
					i++;
				}
			}

			for (int x = 0; x < data.length(); x++) {
				if (Character.isLowerCase(data.charAt(x))) {
					encrypt.append(Character.toLowerCase(
							newOrder.charAt(oldOrder.indexOf(Character.toUpperCase(data.charAt(x)) + ""))));
				} else if (Character.isUpperCase(data.charAt(x))) {

					encrypt.append(newOrder.charAt(oldOrder.indexOf(data.charAt(x) + "")));
				} else {
					encrypt.append(data.charAt(x));
				}
			}
			System.out.println(encrypt);
		}
	}
}