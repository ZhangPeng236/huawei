package No036_×Ö·û´®¼ÓÃÜ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String key = scanner.nextLine();
			String data = scanner.nextLine();
			encrypt(key, data);
		}
		scanner.close();
	}

	static void encrypt(String key, String data) {
		String encrypt = new String();
		for (int i = 0; i < key.length(); i++) {
			String temp = key.substring(i, i + 1);
			if (!encrypt.contains(temp.toUpperCase())) {
				encrypt = encrypt + temp.toUpperCase();
			}
		}
		String o = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 26; i++) {
			String temp = o.substring(i, i + 1);
			if (!encrypt.contains(temp)) {
				encrypt = encrypt + temp;
			}
		}
		encrypt = encrypt + encrypt.toLowerCase();
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			String temp = data.substring(i, i + 1);
			int index = o.indexOf(temp);
			if (index != -1) {
				result = result + encrypt.charAt(index);
			} else {
				result = result + temp;
			}
		}
		System.out.println(result);
	}
}