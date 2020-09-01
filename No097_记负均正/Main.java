package No097_记负均正;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int count1 = 0;
			int count2 = 0;
			double sum = 0;
			for (int i = 0; i < n; i++) {
				int temp = scanner.nextInt();
				if (temp < 0)
					count1++;
				else if (temp > 0) {
					count2++;
					sum += temp;
				}
			}
			System.out.print(count1 + " ");
			System.out.printf("%.1f\n", sum / count2);
		}
		scanner.close();
	}
}