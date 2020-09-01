package No046_°´×Ö½Ú½ØÈ¡×Ö·û´®;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			int n = Integer.parseInt(scanner.nextLine());
			byte[] bys = string.getBytes();
			if (n <= 0) {
				System.out.println("");
			} else if (n >= bys.length) {
				System.out.println(string);
			} else {
				if (isCut(bys, n)) {
					System.out.println(new String(bys, 0, n - 1));
				} else {
					System.out.println(new String(bys, 0, n));
				}
			}
		}
	}

	public static boolean isCut(byte[] bys, int n) {
		if (n == 1) {
			byte begin = bys[0];
			if (begin > 0) {
				return false;
			} else {
				return true;
			}
		} else {
			if (isCut(bys, n - 1)) {
				return false;
			} else {
				byte begin = bys[n - 1];
				if (begin > 0) {
					return false;
				} else {
					return true;
				}
			}
		}
	}
}