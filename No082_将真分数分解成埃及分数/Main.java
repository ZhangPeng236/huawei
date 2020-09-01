package No082_将真分数分解成埃及分数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			int fenZi = Integer.valueOf(src.split("/")[0]);
			int fenMu = Integer.valueOf(src.split("/")[1]);
			for (int i = 0; i < fenZi - 1; i++) {
				System.out.print("1/" + fenMu + "+");
			}
			System.out.println("1/" + fenMu);
		}
		scanner.close();
	}
}