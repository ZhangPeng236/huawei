package No007_È¡½üËÆÖµ;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextDouble()) {
			double src = scanner.nextDouble();
			System.out.println((long) (src + 0.5));
		}
		scanner.close();
	}
}