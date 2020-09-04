package No058_����n����_���������С��k��;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = scanner.nextInt();
			}
			Arrays.sort(numbers);
			for (int i = 0; i < k - 1; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println(numbers[k - 1]);
		}
		scanner.close();
	}
}