package No011_���ֵߵ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			StringBuilder sb = new StringBuilder();
			while (src > 0) {
				sb.append(src % 10);
				src /= 10;
			}
			System.out.println(sb.toString());
		}
		scanner.close();
	}
}