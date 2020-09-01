package No002_¼ÆËã×Ö·û¸öÊý;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toLowerCase();
		Character c = scanner.nextLine().charAt(0);
		Character.toLowerCase(c);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}