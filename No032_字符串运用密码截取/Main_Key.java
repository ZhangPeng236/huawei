package No032_字符串运用密码截取;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			System.out.println(manacher(src));
		}
		scanner.close();
	}

	public static int manacher(String src) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char[] cs = src.toCharArray();
		sb.append("#");
		for (int i = 0; i < cs.length; i++) {
			sb.append(cs[i]);
			sb.append("#");
		}
		int[] rad = new int[sb.length()];
		char[] cl = sb.toString().toCharArray();
		int max = 0;// 记录已经搜寻到的回文半径能到达右端的最达大值
		int id = 0;// 记录回文半径能到达最有端的回文字符串的中心
		for (int i = 1; i < cl.length; i++) {
			if (max > i) {
				rad[i] = Math.min(rad[2 * id - i], max - i);
			} else {
				rad[i] = 1;
			}
			while (i - rad[i] >= 0 && i + rad[i] < cl.length && cl[(i - rad[i])] == cl[(i + rad[i])]) {
				rad[i]++;
			}
			if (i + rad[i] > max) {
				max = i + rad[i];
				id = i;
			}
			count = Math.max(count, rad[i] - 1);
		}

		return count;
	}
}