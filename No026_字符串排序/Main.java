package No026_×Ö·û´®ÅÅÐò;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			List<Character> list = new LinkedList<Character>();
			char[] ss = str.toCharArray();
			for (char c : ss) {
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
			int totalLen = 0;
			for (char temp : ss) {
				if (Character.isLetter(temp) && totalLen < list.size()) {
					sb.append(list.get(totalLen));
					totalLen += 1;
				} else {
					sb.append(temp);
				}

			}
			System.out.println(sb.toString());
		}

	}
}