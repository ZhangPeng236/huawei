package No020_密码验证合格程序;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			if (check(src))
				System.out.println("OK");
			else
				System.out.println("NG");
		}
		scanner.close();
	}

	private static boolean check(String src) {
		if (src.length() <= 8) {
			return false;
		}
		int cB = 0;
		int cS = 0;
		int cD = 0;
		int cO = 0;
		for (int i = 0; i < src.length(); i++) {
			char tempC = src.charAt(i);
			if (Character.isUpperCase(tempC))
				cB++;
			else if (Character.isLowerCase(tempC))
				cS++;
			else if (Character.isDigit(tempC))
				cD++;
			else
				cO++;
		}
		int fB = cB == 0 ? 0 : 1;
		int fS = cS == 0 ? 0 : 1;
		int fD = cD == 0 ? 0 : 1;
		int fO = cO == 0 ? 0 : 1;
		if (fB + fS + fD + fO < 3) {
			return false;
		}
		boolean flag = true;
		wc: for (int i = src.length() / 2; i > 2; i--) {
			for (int j = 0; j <= src.length() - 2 * i; j++) {
				for (int k = j + i; k <= src.length() - i; k++) {
					if (src.substring(j, j + i).equals(src.substring(k, k + i))) {
						flag = false;
						break wc;
					}
				}
			}
		}
		return flag;
	}
}