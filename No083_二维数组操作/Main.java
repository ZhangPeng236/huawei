package No083_二维数组操作;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int exAx = scanner.nextInt();
			int exAy = scanner.nextInt();
			int exBx = scanner.nextInt();
			int exBy = scanner.nextInt();
			int inX = scanner.nextInt();
			int inY = scanner.nextInt();
			int seX = scanner.nextInt();
			int seY = scanner.nextInt();
			boolean inBo = x >= 0 && x <= 9 && y >= 0 & y <= 9;
			System.out.println(inBo ? 0 : -1);
			boolean exBo = inBo && exAx >= 0 && exAx < x && exAy >= 0 && exAy < y && exBx >= 0 && exBx < x && exBy >= 0
					&& exBy < y;
			System.out.println(exBo ? 0 : -1);
			boolean inXBo = inBo && inX >= 0 && inX <= x && x <= 8;
			System.out.println(inXBo ? 0 : -1);
			boolean inYBo = inBo && inY >= 0 && inY <= y && y <= 8;
			System.out.println(inYBo ? 0 : -1);
			boolean seBo = inBo && seX >= 0 && seX < x && seY >= 0 && seY < y;
			System.out.println(seBo ? 0 : -1);
		}
		scanner.close();
	}
}