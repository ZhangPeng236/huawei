package No029_×Ö·û´®¼Ó½âÃÜ;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src1 = scanner.next();
			String src2 = scanner.next();
			System.out.println(encrypt(src1));
			System.out.println(unEncrypt(src2));
		}
		scanner.close();
	}

	private static String encrypt(String src1) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src1.length(); i++) {
			char temp = src1.charAt(i);
			if (temp == 'z') {
				sb.append('A');
			} else if (temp == 'Z') {
				sb.append('a');
			} else if (temp == '9') {
				sb.append('0');
			} else if (temp >= 'a' && temp <= 'y') {
				sb.append((char) (temp + 1 - 32));
			} else if (temp >= 'A' && temp <= 'Y') {
				sb.append((char) (temp + 1 + 32));
			} else if (temp >= '0' && temp <= '8') {
				sb.append((char) (temp + 1));
			}
		}
		return sb.toString();
	}

	private static String unEncrypt(String src2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src2.length(); i++) {
			char temp = src2.charAt(i);
			if (temp == 'a') {
				sb.append('Z');
			} else if (temp == 'A') {
				sb.append('z');
			} else if (temp == '0') {
				sb.append('9');
			} else if (temp >= 'b' && temp <= 'z') {
				sb.append((char) (temp - 1 - 32));
			} else if (temp >= 'B' && temp <= 'Z') {
				sb.append((char) (temp - 1 + 32));
			} else if (temp >= '1' && temp <= '9') {
				sb.append((char) (temp - 1));
			}
		}
		return sb.toString();
	}
}