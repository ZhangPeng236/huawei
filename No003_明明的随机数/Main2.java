package No003_明明的随机数;

import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				numbers.add(scanner.nextInt());
			}
			for (int number : numbers) {
				System.out.println(number);
			}
			numbers.clear();
		}
		scanner.close();
	}
}