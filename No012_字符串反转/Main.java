package No012_×Ö·û´®·´×ª;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			StringBuilder sb = new StringBuilder(src);
			System.out.println(sb.reverse().toString());
		}
		scanner.close();
	}
}