package No090_ºÏ·¨IP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			String[] srcs = src.split("\\.");
			if (srcs.length != 4) {
				System.out.println("NO");
			} else {
				if (Integer.valueOf(srcs[0]) < 0 || Integer.valueOf(srcs[0]) > 255) {
					System.out.println("NO");
				} else if (Integer.valueOf(srcs[1]) < 0 || Integer.valueOf(srcs[1]) > 255) {
					System.out.println("NO");
				} else if (Integer.valueOf(srcs[2]) < 0 || Integer.valueOf(srcs[2]) > 255) {
					System.out.println("NO");
				} else if (Integer.valueOf(srcs[3]) < 0 || Integer.valueOf(srcs[3]) > 255) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
		}
		scanner.close();
	}
}