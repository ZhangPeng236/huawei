package No060_�������һ��ż����ӽ�����������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int src = scanner.nextInt();
			for (int i = src / 2; i >= 2; i--) {
				if (isSushu(i) && isSushu(src - i)) {
					System.out.println(i);
					System.out.println(src - i);
					break;
				}
			}
		}
		scanner.close();
	}

	private static boolean isSushu(int n) {
		if (n == 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}