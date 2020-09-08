package No032_�ַ������������ȡ;

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
		int max = 0;// ��¼�Ѿ���Ѱ���Ļ��İ뾶�ܵ����Ҷ˵�����ֵ
		int id = 0;// ��¼���İ뾶�ܵ������ж˵Ļ����ַ���������
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