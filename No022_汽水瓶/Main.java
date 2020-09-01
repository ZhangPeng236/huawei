package No022_ÆûË®Æ¿;

import java.util.Scanner;

public class Main {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i = sc.nextInt();
			if (i != 0) {
				System.out.println(i >> 1);
			} else {
				break;
			}
		}
	}
}