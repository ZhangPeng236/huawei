package No007_ȡ����ֵ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextDouble()) {
			double src = scanner.nextDouble();
			System.out.println(Math.round(src));
		}
		scanner.close();
	}
}