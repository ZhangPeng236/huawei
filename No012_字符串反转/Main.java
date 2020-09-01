package No012_×Ö·û´®·´×ª;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		System.out.println(sb);
	}
}