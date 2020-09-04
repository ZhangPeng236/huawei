package No008_合并表记录;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int count = scanner.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < count; i++) {
				int key = scanner.nextInt();
				int value = scanner.nextInt();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + value);
				} else {
					map.put(key, value);
				}
			}
			for (Integer key : map.keySet()) {
				System.out.println(key + " " + map.get(key));
			}
		}
		scanner.close();
	}
}