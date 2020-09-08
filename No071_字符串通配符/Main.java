package No071_×Ö·û´®Í¨Åä·û;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String regex = scanner.nextLine();
			String src = scanner.nextLine();
			regex = regex.replaceAll("\\?", "[a-zA-Z0-9]");
			regex = regex.replaceAll("\\*", "[a-zA-Z0-9]*");
			regex = regex.replaceAll("\\.", "\\\\.");
			System.out.println(src.matches(regex));
		}
		scanner.close();
	}
}