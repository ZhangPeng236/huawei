package No001_�ַ������һ�����ʵĳ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			String[] words = src.split(" ");
			int len = words.length;
			System.out.println(words[len - 1].length());
		}
		scanner.close();
	}
}