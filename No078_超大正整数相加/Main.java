package No078_超大正整数相加;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			System.out.println(add(a, b));
		}
		scanner.close();
	}

	private static String add(String a, String b) {
		BigInteger b1 = new BigInteger(a);
		BigInteger b2 = new BigInteger(b);
		return b1.add(b2).toString();
	}
}