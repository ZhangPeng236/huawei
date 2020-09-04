package No010_字符个数统计;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			HashSet<Character> hs = new HashSet<Character>();
			for (int i = 0; i < src.length(); i++) {
				char c = src.charAt(i);
				if (c >= 0 && c <= 127 && !hs.contains(c)) {
					hs.add(src.charAt(i));
				}
			}
			System.out.println(hs.size());
		}
		scanner.close();
	}
}