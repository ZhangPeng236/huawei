package No057_无线OSS_高精度整数加法;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String num1 = scanner.next();
			String num2 = scanner.next();
			System.out.println(new BigInteger(num1).add(new BigInteger(num2)));
		}
		scanner.close();
	}
}