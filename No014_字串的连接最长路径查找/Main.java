package No014_字串的连接最长路径查找;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			String[] strings = new String[num];
			for (int i = 0; i < num; i++) {
				strings[i] = scanner.next();
			}
			Arrays.sort(strings);
			for (String s : strings)
				System.out.println(s);
		}
		scanner.close();
	}
}