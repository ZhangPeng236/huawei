package No096_±íÊ¾Êý×Ö;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.next();
			System.out.println(input.replaceAll("([0-9]+)", "*$1*"));
		}
		scanner.close();
	}
}