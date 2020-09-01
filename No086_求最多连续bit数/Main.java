package No086_求最多连续bit数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			String string = Integer.toBinaryString(src);
			String[] strings = string.split("0+");
			int max = 0;
			for (String s : strings) {
				max = s.length() > max ? s.length() : max;
			}
			System.out.println(max);
		}
		scanner.close();
	}
}