package No034_НјЖ¬ХыАн;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			char[] chs = string.toCharArray();
			Arrays.sort(chs);
			String newString = new String(chs);
			System.out.println(newString);
		}
	}
}