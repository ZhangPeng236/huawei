package No045_Ãû×ÖµÄÆ¯ÁÁ¶È;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = Integer.parseInt(scanner.nextLine());
			String[] name = new String[N];
			for (int i = 0; i < N; i++) {
				name[i] = scanner.nextLine().toLowerCase();
			}
			for (int i = 0; i < N; i++) {
				System.out.println(getPretty(name[i]));
			}
		}
	}

	public static long getPretty(String name) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int x = 0; x < name.length(); x++) {
			if (!hm.containsKey(name.charAt(x))) {
				hm.put(name.charAt(x), 1);
			} else {
				hm.put(name.charAt(x), hm.get(name.charAt(x)) + 1);
			}
		}
		Collection<Integer> collection = hm.values();
		int size = collection.size();
		int[] counts = new int[size];
		int temp = 0;
		for (Integer integer : collection) {
			counts[temp] = integer;
			temp++;
		}
		Arrays.sort(counts);
		long pretty = 0L;
		for (int x = size - 1, y = 26; x >= 0; x--, y--) {
			pretty += counts[x] * y;
		}
		return pretty;
	}
}