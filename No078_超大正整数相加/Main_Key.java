package No078_超大正整数相加;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			System.out.println(add(scanner.next(), scanner.next()));
		}
		scanner.close();
	}

	private static String add(String a, String b) {
		int maxLength = a.length() > b.length() ? a.length() : b.length();
		int[] arrayA = new int[maxLength + 1];
		for (int i = 0; i < a.length(); i++) {
			arrayA[i] = a.charAt(a.length() - 1 - i) - '0';
		}
		int[] arrayB = new int[maxLength + 1];
		for (int i = 0; i < b.length(); i++) {
			arrayB[i] = b.charAt(b.length() - 1 - i) - '0';
		}
		int[] result = new int[maxLength + 1];
		for (int i = 0; i < result.length - 1; i++) {
			int temp = result[i] + arrayA[i] + arrayB[i];
			result[i] = temp % 10;
			result[i + 1] = temp / 10;
		}
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = result.length - 1; i >= 0; i--) {
			if (!flag) {
				if (result[i] == 0) {
					continue;
				} else {
					flag = true;
				}
			}
			sb.append(result[i]);
		}
		return sb.toString();
	}
}