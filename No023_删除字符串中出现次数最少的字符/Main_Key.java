package No023_删除字符串中出现次数最少的字符;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int[] count = new int[26];
			String lineIn = scanner.nextLine();
			String lineOut = "";
			for (int i = 0; i < lineIn.length(); i++) {
				char c = lineIn.charAt(i);
				int n = c - 'a';
				count[n]++;
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 26; i++) {
				if (count[i] != 0 && count[i] < min) {
					min = count[i];
				}
			}
			for (int i = 0; i < lineIn.length(); i++) {
				char c = lineIn.charAt(i);
				int n = c - 'a';
				if (count[n] != min) {
					lineOut += c;
				}
			}
			System.out.println(lineOut);
		}
		scanner.close();
	}
}