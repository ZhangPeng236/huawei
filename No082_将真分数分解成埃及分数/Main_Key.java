package No082_将真分数分解成埃及分数;

import java.util.Scanner;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			int a = Integer.valueOf(src.split("/")[0]);
			int b = Integer.valueOf(src.split("/")[1]);
			StringBuilder result = new StringBuilder();
			while (true) {
				if (a == 1) {
					result.append(a + "/" + b);
					break;
				} else if (a > 1 && b % a == 0) {
					result.append(1 + "/" + b / a);
					break;
				} else {
					int p = b / a;
					int r = b % a;
					result.append(1 + "/" + (p + 1) + "+");
					a = a - r;
					b = b * (p + 1);
				}
			}
			System.out.println(result.toString());
		}
		scanner.close();
	}
}