package No005_����ת��;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			System.out.println(Integer.valueOf(src.substring(2), 16).toString());
		}
		scanner.close();
	}
}