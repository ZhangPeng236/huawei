package No084_统计大写字母个数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.next();
			System.out.println(calcCapital(str));
		}
		scanner.close();
	}

	private static int calcCapital(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				count++;
		return count;
	}
}