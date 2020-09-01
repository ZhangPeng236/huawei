package No066_ÅäÖÃÎÄ¼ş»Ö¸´;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String command = scanner.nextLine();
			LinkedHashMap<String, String> lists = new LinkedHashMap<String, String>();
			lists.put("reset board", "board fault");
			lists.put("board add", "where to add");
			lists.put("board delete", "no board at all");
			lists.put("reboot backplane", "impossible");
			lists.put("backplane abort", "install first");
			exec(command, lists);
		}
	}

	private static void exec(String command, LinkedHashMap<String, String> lists) {
		if (command.split(" ").length < 1 || command.split(" ").length > 2) {
			System.out.println("unknown command");
		} else if (command.split(" ").length == 1) {
			if ("reset".startsWith(command)) {
				System.out.println("reset what");
			} else {
				System.out.println("unknown command");
			}
		} else {
			Set<String> set = lists.keySet();
			ArrayList<String> maybe = new ArrayList<String>();
			for (String key : set) {
				if (key.split(" ")[0].startsWith(command.split(" ")[0])
						&& key.split(" ")[1].startsWith(command.split(" ")[1])) {
					maybe.add(key);
				}
			}
			if (maybe.size() != 1) {
				System.out.println("unknown command");
			} else {
				System.out.println(lists.get(maybe.get(0)));
			}
		}
	}
}