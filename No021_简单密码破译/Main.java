package No021_¼òµ¥ÃÜÂëÆÆÒë;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String newS = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				if (c[i] == 'Z') {
					c[i] = 'a';
				} else {
					c[i] = (char) (Character.toLowerCase(c[i]) + 1);
				}
			} else if (Character.isLowerCase(c[i])) {
				switch (c[i]) {
				case 'a':
				case 'b':
				case 'c':
					c[i] = '2';
					break;
				case 'd':
				case 'e':
				case 'f':
					c[i] = '3';
					break;
				case 'g':
				case 'h':
				case 'i':
					c[i] = '4';
					break;
				case 'j':
				case 'k':
				case 'l':
					c[i] = '5';
					break;
				case 'm':
				case 'n':
				case 'o':
					c[i] = '6';
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					c[i] = '7';
					break;
				case 't':
				case 'u':
				case 'v':
					c[i] = '8';
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					c[i] = '9';
					break;
				}
			}
			newS += c[i];
		}
		System.out.println(newS);
	}
}