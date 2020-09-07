package No026_×Ö·û´®ÅÅÐò;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			LinkedList<Character> list = new LinkedList<Character>();
			char[] cs = src.toCharArray();
			for (char c : cs) {
				if (Character.isLetter(c))
					list.add(c);
			}
			Collections.sort(list, new Comparator<Character>() {
				@Override
				public int compare(Character o1, Character o2) {
					return Character.toLowerCase(o1) - Character.toLowerCase(o2);
				}
			});
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < src.length(); i++) {
				if (Character.isLetter(src.charAt(i))) {
					sb.append(list.removeFirst());
				} else {
					sb.append(src.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
		scanner.close();
	}
}