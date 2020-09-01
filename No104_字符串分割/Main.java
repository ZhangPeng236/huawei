package No104_×Ö·û´®·Ö¸î;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int count = Integer.valueOf(scanner.next());
			String[] strValue = new String[count];
			for (int i = 0; i < count; i++) {
				strValue[i] = scanner.next();
				while (strValue[i].length() % 8 != 0) {
					strValue[i] += "0";
				}
			}
			for (int i = 0; i < count; i++) {
				while (strValue[i].length() != 0) {
					System.out.println(strValue[i].substring(0, 8));
					strValue[i] = strValue[i].substring(8);
				}
			}
		}
	}
}