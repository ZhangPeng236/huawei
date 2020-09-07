package No021_¼òµ¥ÃÜÂëÆÆÒë;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < src.length(); i++) {
				char temp = src.charAt(i);
				if (Character.isUpperCase(temp)) {
					if (temp == 'Z') {
						sb.append('a');
					} else {
						sb.append((char) (temp + 1 + 32));
					}
				} else if (Character.isLowerCase(temp)) {
					switch (temp) {
					case 'a':
					case 'b':
					case 'c':
						sb.append('2');
						break;
					case 'd':
					case 'e':
					case 'f':
						sb.append('3');
						break;
					case 'g':
					case 'h':
					case 'i':
						sb.append('4');
						break;
					case 'j':
					case 'k':
					case 'l':
						sb.append('5');
						break;
					case 'm':
					case 'n':
					case 'o':
						sb.append('6');
						break;
					case 'p':
					case 'q':
					case 'r':
					case 's':
						sb.append('7');
						break;
					case 't':
					case 'u':
					case 'v':
						sb.append('8');
						break;
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						sb.append('9');
						break;
					}
				} else {
					sb.append(temp);
				}
			}
			System.out.println(sb);
		}
		scanner.close();
	}
}