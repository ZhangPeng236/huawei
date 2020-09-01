package No011_Êý×Öµßµ¹;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		while (i > 0) {
			sb.append(i % 10);
			i /= 10;
		}
		System.out.print(sb);
	}
}