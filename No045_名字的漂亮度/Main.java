package No045_Ãû×ÖµÄÆ¯ÁÁ¶È;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int n = Integer.valueOf(scanner.nextLine());
			String[] names = new String[n];
			for (int i = 0; i < n; i++) {
				names[i] = scanner.nextLine().toLowerCase();
			}
			for (int i = 0; i < n; i++) {
				System.out.println(getPretty(names[i]));
			}
		}
		scanner.close();
	}

	public static long getPretty(String name) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (!hm.containsKey(name.charAt(i))) {
				hm.put(name.charAt(i), 1);
			} else {
				hm.put(name.charAt(i), hm.get(name.charAt(i)) + 1);
			}
		}
		ArrayList<Map.Entry<Character, Integer>> arrayList = new ArrayList<Map.Entry<Character, Integer>>(
				hm.entrySet());
		Collections.sort(arrayList, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});
		long pretty = 0L;
		int num = 26;
		for (Map.Entry<Character, Integer> m : arrayList) {
			pretty += m.getValue() * (num--);
		}
		return pretty;
	}
}