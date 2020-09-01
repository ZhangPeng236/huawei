package No015_求int型正整数在内存中存储时1的个数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int count = 0;
			String toBinary = Integer.toBinaryString(num);
			for (int i = 0; i < toBinary.length(); i++) {
				char c = toBinary.charAt(i);
				if (c == '1') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}