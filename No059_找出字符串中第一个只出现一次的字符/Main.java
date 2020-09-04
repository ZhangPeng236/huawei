package No059_找出字符串中第一个只出现一次的字符;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			found(src);
		}
		scanner.close();
	}

	private static void found(String src) {
		LinkedHashMap<Character, Integer> lhs = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (!lhs.containsKey(c)) {
				lhs.put(c, 1);
			} else {
				lhs.put(c, lhs.get(c) + 1);
			}
		}
		if (!lhs.containsValue(1)) {
			System.out.println(-1);
		} else {
			Set<Character> set = lhs.keySet();
			for (Character c : set) {
				if (lhs.get(c) == 1) {
					System.out.println(c);
				}
			}
		}
	}
}