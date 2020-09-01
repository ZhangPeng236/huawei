package No008_合并表记录;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = Integer.valueOf(sc.nextLine());
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < count; i++) {
				String[] array = sc.nextLine().split(" ");
				Integer key = Integer.valueOf(array[0]);
				Integer num = Integer.valueOf(array[1]);
				if (map.containsKey(key)) {
					Integer value = map.get(key) + num;
					map.put(key, value);
				} else {
					map.put(key, num);
				}
			}
			for (Integer key : map.keySet()) {
				System.out.println(key + " " + map.get(key));
			}
		}
	}
}