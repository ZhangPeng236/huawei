package No009_提取不重复的整数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			String str = String.valueOf(src);
			StringBuilder sb = new StringBuilder();
			for (int i = str.length() - 1; i >= 0; i--) {
				if (!sb.toString().contains(String.valueOf(str.charAt(i)))) {
					sb.append(str.charAt(i));
				}
			}
			System.out.println(Integer.valueOf(sb.toString()));
		}
		scanner.close();
	}
}