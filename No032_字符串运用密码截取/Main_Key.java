package No032_�ַ������������ȡ;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.nextLine();
			System.out.println(manacher(s));
		}
	}

	public static int manacher(String s) {
		int count = 0;// ��¼������
		StringBuffer sb = new StringBuffer();
		char[] c = s.toCharArray();
		sb.append("#");
		// ���ַ������з�װ
		for (int i = 0; i < c.length; i++) {
			sb.append(c[i]);
			sb.append("#");
		}
		int[] rad = new int[sb.length()];// ��¼���ַ�����ÿ���ַ�Ϊ���ĵ������İ뾶
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