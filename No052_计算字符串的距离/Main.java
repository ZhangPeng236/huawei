package No052_¼ÆËã×Ö·û´®µÄ¾àÀë;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String charA = scanner.nextLine();
			String charB = scanner.nextLine();
			System.out.println(calStringDistance(charA, charB));
		}
		scanner.close();
	}

	public static int calStringDistance(String charA, String charB) {
		int i = charA.length();
		int j = charB.length();
		int[][] len = new int[i + 1][j + 1];
		for (int x = 0; x < i + 1; x++) {
			len[x][0] = x;
		}
		for (int y = 0; y < j + 1; y++) {
			len[0][y] = y;
		}
		for (int x = 1; x < i + 1; x++) {
			for (int y = 1; y < j + 1; y++) {
				if (charA.charAt(x - 1) == charB.charAt(y - 1)) {
					len[x][y] = len[x - 1][y - 1];
				} else {
					len[x][y] = Math.min(Math.min(len[x - 1][y], len[x][y - 1]), len[x - 1][y - 1]) + 1;
				}
			}
		}
		return len[i][j];
	}
}