package No040_输入一行字符_分别统计出包含英文字母_空格_数字和其它字符的个数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			System.out.println(getEnglishCharCount(string));
			System.out.println(getBlankCharCount(string));
			System.out.println(getNumberCharCount(string));
			System.out.println(getOtherCharCount(string));
		}
	}

	public static int getEnglishCharCount(String str) {
		char[] chs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chs.length; i++) {
			if (Character.isLetter(chs[i])) {
				count++;
			}
		}
		return count;
	}

	public static int getBlankCharCount(String str) {
		char[] chs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == ' ') {
				count++;
			}
		}
		return count;
	}

	public static int getNumberCharCount(String str) {
		char[] chs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chs.length; i++) {
			if (Character.isDigit(chs[i])) {
				count++;
			}
		}
		return count;
	}

	public static int getOtherCharCount(String str) {
		char[] chs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chs.length; i++) {
			if (!(Character.isLetter(chs[i]) || chs[i] == ' ' || Character.isDigit(chs[i]))) {
				count++;
			}
		}
		return count;
	}
}