package No081_×Ö·û´®Æ¥Åä;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			char[] pShortString = scanner.next().toCharArray();
			char[] pLongString = scanner.next().toCharArray();
			System.out.println(isAllCharExist(pShortString, pLongString));
		}
		scanner.close();
	}

	private static boolean isAllCharExist(char[] pShortString, char[] pLongString) {
		String longer = new String(pLongString);
		for (char c : pShortString) {
			if (!longer.contains(String.valueOf(c))) {
				return false;
			}
		}
		return true;
	}
}