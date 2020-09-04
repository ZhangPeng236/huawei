package No002_¼ÆËã×Ö·û¸öÊý;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			char c = scanner.next().charAt(0);
			int count = 0;
			for (int i = 0; i < src.length(); i++) {
				if (src.substring(i, i + 1).equalsIgnoreCase(String.valueOf(c))) {
					count++;
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
}