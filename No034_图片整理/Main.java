package No034_НјЖ¬ХыАн;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			char[] chs = src.toCharArray();
			Arrays.sort(chs);
			String output = new String(chs);
			System.out.println(output);
		}
		scanner.close();
	}
}