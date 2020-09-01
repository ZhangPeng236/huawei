package No074_²ÎÊı½âÎö;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			string.trim();
			String[] strings = string.split(" ");
			ArrayList<String> params = new ArrayList<String>();
			StringBuilder temp = new StringBuilder();
			boolean flag = false;
			for (int i = 0; i < strings.length; i++) {
				if (flag == false) {
					if (!strings[i].contains("\"")) {
						params.add(strings[i]);
					} else if (strings[i].startsWith("\"") && strings[i].endsWith("\"")) {
						params.add(strings[i].substring(1, strings[i].length() - 1));
					} else if (strings[i].startsWith("\"") && !strings[i].endsWith("\"")) {
						temp.append(strings[i].substring(1));
						flag = true;
						continue;
					}
				} else {
					if (!strings[i].contains("\"")) {
						temp.append(" ").append(strings[i]);
					} else if (!strings[i].startsWith("\"") && strings[i].endsWith("\"")) {
						temp.append(" ").append(strings[i].substring(0, strings[i].length() - 1));
						params.add(temp.toString());
						temp.delete(0, temp.length());
						flag = false;
					}
				}
			}
			System.out.println(params.size());
			for (String s : params) {
				System.out.println(s);
			}
		}
	}
}