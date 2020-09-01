package No096_±íÊ¾Êý×Ö;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String pInStr = scanner.nextLine();
			System.out.println(markNum(pInStr));
		}
	}

	public static String markNum(String pInStr) {
		StringBuilder result = new StringBuilder(pInStr);
		boolean begin = false;
		if (result.charAt(0) >= '0' && result.charAt(0) <= '9') {
			begin = true;
			result.insert(0, '*');
		}
		if (begin) {
			for (int x = 2; x < result.length(); x++) {
				if (result.charAt(x) >= '0' && result.charAt(x) <= '9'
						&& (result.charAt(x - 1) < '0' || result.charAt(x - 1) > '9')) {
					result.insert(x, '*');
					x++;
				}
			}
		} else {
			for (int x = 1; x < result.length(); x++) {
				if (result.charAt(x) >= '0' && result.charAt(x) <= '9'
						&& (result.charAt(x - 1) < '0' || result.charAt(x - 1) > '9')) {
					result.insert(x, '*');
					x++;
				}
			}
		}
		boolean end = false;
		if (result.charAt(result.length() - 1) >= '0' && result.charAt(result.length() - 1) <= '9') {
			end = true;
			result.append('*');
		}
		if (end) {
			for (int x = result.length() - 3; x >= 0; x--) {
				if (result.charAt(x) >= '0' && result.charAt(x) <= '9'
						&& (result.charAt(x + 1) < '0' || result.charAt(x + 1) > '9')) {
					result.insert(x + 1, '*');
					x--;
				}
			}
		} else {
			for (int x = result.length() - 2; x >= 0; x--) {
				if (result.charAt(x) >= '0' && result.charAt(x) <= '9'
						&& (result.charAt(x + 1) < '0' || result.charAt(x + 1) > '9')) {
					result.insert(x + 1, '*');
					x--;
				}
			}
		}
		return result.toString();
	}
}