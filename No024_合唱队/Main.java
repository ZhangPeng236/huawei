package No024_ºÏ³ª¶Ó;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if (num <= 2) {
				System.out.println(0);
				continue;
			}
			int[] members = new int[num];
			int[] left_queue = new int[num];
			int[] right_queue = new int[num];
			for (int i = 0; i < num; i++) {
				members[i] = scanner.nextInt();
				left_queue[i] = 1;
				right_queue[i] = 1;
			}
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < i; j++) {
					if (members[i] > members[j] && left_queue[j] + 1 > left_queue[i]) {
						left_queue[i] = left_queue[j] + 1;
					}
				}
			}
			for (int i = num - 1; i >= 0; i--) {
				for (int j = num - 1; j > i; j--) {
					if (members[i] > members[j] && right_queue[j] + 1 > right_queue[i]) {
						right_queue[i] = right_queue[j] + 1;
					}
				}
			}
			int max = 0;
			for (int i = 0; i < num; i++) {
				if (left_queue[i] + right_queue[i] > max) {
					max = left_queue[i] + right_queue[i];
				}
			}
			System.out.println(num - max + 1);
		}
		scanner.close();
	}
}