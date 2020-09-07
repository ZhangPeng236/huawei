package No030_字符串合并处理;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src1 = scanner.next();
			String src2 = scanner.next();
			String src = src1 + src2;
			LinkedList<Character> even = new LinkedList<Character>();
			LinkedList<Character> odd = new LinkedList<Character>();
			for (int i = 0; i < src.length(); i++) {
				if (i % 2 == 0) {
					even.add(src.charAt(i));
				} else {
					odd.add(src.charAt(i));
				}
			}
			Collections.sort(even);
			Collections.sort(odd);
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < src.length(); i++) {
				if (i % 2 == 0) {
					sBuilder.append(even.removeFirst());
				} else {
					sBuilder.append(odd.removeFirst());
				}
			}
			StringBuilder result = new StringBuilder();
			String s1 = "abcdefABCDEF0123456789";
			String s2 = "5D3B7F5D3B7F084C2A6E19";
			for (int i = 0; i < src.length(); i++) {
				int index = s1.indexOf(sBuilder.substring(i, i + 1));
				if (index != -1) {
					result.append(s2.charAt(index));
				} else {
					result.append(sBuilder.charAt(i));
				}
			}
			System.out.println(result.toString());
		}
		scanner.close();
	}
}