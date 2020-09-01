package No014_字串的连接最长路径查找;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			int num = Integer.parseInt(input.nextLine());
			ArrayList<String> list = new ArrayList<String>();
			while (num > 0) {
				list.add(input.nextLine());
				num--;
			}
			Collections.sort(list);
			for (String s : list)
				System.out.println(s);
		}
	}
}