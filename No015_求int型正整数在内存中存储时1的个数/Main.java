package No015_��int�����������ڴ��д洢ʱ1�ĸ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int src = scanner.nextInt();
			String str = Integer.toBinaryString(src);
			System.out.println(str.replaceAll("0+", "").length());
		}
		scanner.close();
	}
}