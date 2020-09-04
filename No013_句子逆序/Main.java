package No013_¾ä×ÓÄæÐò;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			System.out.println(reverse(src));
		}
		scanner.close();
	}

	public static String reverse(String sentence) {
		String[] strings = sentence.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = strings.length - 1; i >= 0; i--) {
			sb.append(strings[i]).append(" ");
		}
		return sb.toString().trim();
	}
}