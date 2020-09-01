package No040_����һ���ַ�_�ֱ�ͳ�Ƴ�����Ӣ����ĸ_�ո�_���ֺ������ַ��ĸ���;

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