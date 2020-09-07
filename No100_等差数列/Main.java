package No100_µÈ²îÊýÁÐ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String inputString = scanner.next();
			int n = Integer.valueOf(inputString);
			System.out.println((3 * n * n + n) / 2);
		}
		scanner.close();
	}
}