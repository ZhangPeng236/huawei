package No046_°´×Ö½Ú½ØÈ¡×Ö·û´®;

import java.util.Scanner;

public class Main_YangRenfei {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			int n = Integer.valueOf(scanner.nextLine());
			char[] chs = string.toCharArray();
			byte[] bys = string.getBytes();
			int length = string.length();
			int l = 0;
			int count = 0;
			for (char c : chs) {
				if (c >= '\u4e00' && c <= '\u9fa5')
					l += 2;
				else
					l++;
				count++;
				if (n <= 0) {
					System.out.println("");
					break;
				} else if (n == l) {
					System.out.println(string.substring(0, count));
					break;
				} else if (n < l) {
					System.out.println(string.substring(0, count - 1));
					break;
				} else if (n >= bys.length) {
					System.out.println(string);
					break;
				}
			}
		}
	}
}