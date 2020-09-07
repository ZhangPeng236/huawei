package No046_°´×Ö½Ú½ØÈ¡×Ö·û´®;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			String str = src.split("\\s+")[0];
			int n = Integer.valueOf(src.split("\\s+")[1]);
			StringBuilder result = new StringBuilder();
			while (n > 0 && str.length() > 0) {
				String temp = str.substring(0, 1);
				if (temp.getBytes().length == 1) {
					result.append(temp);
					n--;
					str = str.substring(1);
				} else if (temp.getBytes().length == 2 && n >= 2) {
					result.append(temp);
					n -= 2;
					str = str.substring(1);
				} else if (temp.getBytes().length == 2 && n == 1) {
					break;
				}
			}
			System.out.println(result.toString());
		}
		scanner.close();
	}
}