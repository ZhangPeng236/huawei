package No001_�ַ������һ�����ʵĳ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] words = str.split("\\s+");
		int len = words.length;
		System.out.println(words[len - 1].length());
	}
}