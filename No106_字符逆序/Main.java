package No106_×Ö·ûÄæÐò;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String in = scanner.nextLine();
			StringBuilder sb = new StringBuilder(in);
			System.out.println(sb.reverse().toString());
		}
		scanner.close();
	}
}