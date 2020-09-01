package No009_提取不重复的整数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			String a = str.substring(str.length() - 1);
			for (int i = str.length() - 2; i >= 0; i--) {
				if (!a.contains(str.substring(i, i + 1)))
					a += str.substring(i, i + 1);
			}
			System.out.println(a);
		}
	}
}