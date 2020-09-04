package No014_字串的连接最长路径查找;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < num; i++) {
				list.add(scanner.next());
			}
			Collections.sort(list);
			for (String s : list)
				System.out.println(s);
		}
		scanner.close();
	}
}