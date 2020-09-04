package No011_Êý×Öµßµ¹;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			String str = String.valueOf(src);
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse().toString());
		}
		scanner.close();
	}
}