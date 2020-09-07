package No027_≤È’“–÷µ‹µ•¥ ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			String[] srcs = src.split("\\s+");
			int num = Integer.valueOf(srcs[0]);
			ArrayList<String> dic = new ArrayList<String>();
			for (int i = 0; i < num; i++) {
				dic.add(srcs[i + 1]);
			}
			String key = srcs[num + 1];
			int n = Integer.valueOf(srcs[num + 2]);

			ArrayList<String> brothers = new ArrayList<String>();
			for (String s : dic) {
				if (brother(key, s)) {
					brothers.add(s);
				}
			}
			System.out.println(brothers.size());
			Collections.sort(brothers);
			if (n <= brothers.size()) {
				System.out.println(brothers.get(n - 1));
			}
		}
		scanner.close();
	}

	private static boolean brother(String key, String word) {
		if (key.equals(word) || key.length() != word.length()) {
			return false;
		}
		char[] keys = key.toCharArray();
		Arrays.sort(keys);
		char[] words = word.toCharArray();
		Arrays.sort(words);
		return Arrays.equals(keys, words);
	}
}