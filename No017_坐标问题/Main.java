package No017_×ø±êÎÊÌâ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.nextLine();
			String[] strs = src.split(";+");
			int x = 0;
			int y = 0;
			for (String str : strs) {
				try {
					int step = Integer.valueOf(str.substring(1));
					if (str.startsWith("A") || str.startsWith("D") || str.startsWith("W")
							|| str.startsWith("S") && step > 0 && step < 100) {
						switch (str.substring(0, 1)) {
						case "A":
							x -= step;
							break;
						case "D":
							x += step;
							break;
						case "W":
							y += step;
							break;
						case "S":
							y -= step;
							break;
						}
					}
				} catch (Exception e) {
					continue;
				}
			}
			System.out.println(x + "," + y);
		}
		scanner.close();
	}
}