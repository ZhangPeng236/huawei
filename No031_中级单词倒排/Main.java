package No031_ÖÐ¼¶µ¥´Êµ¹ÅÅ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			String[] srcs = src.split("[^a-zA-Z]+");
			StringBuilder sb = new StringBuilder();
			for (int i = srcs.length - 1; i >= 0; i--) {
				sb.append(srcs[i]).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
		scanner.close();
	}
}