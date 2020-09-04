package No090_ºÏ·¨IP;

import java.net.InetAddress;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			try {
				InetAddress ia = InetAddress.getByName(src);
			} catch (Exception e) {
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
		}
		scanner.close();
	}
}