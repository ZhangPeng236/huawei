package No059_�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			boolean flag = false;
			for (int i = 0; i < src.length(); i++) {
				char c = src.charAt(i);
				if (src.indexOf(c) == src.lastIndexOf(c)) {
					System.out.println(c);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}