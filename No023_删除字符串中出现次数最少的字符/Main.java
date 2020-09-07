package No023_删除字符串中出现次数最少的字符;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			System.out.println(deleteMin(src));
		}
		scanner.close();
	}

	private static String deleteMin(String src) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < src.length(); i++) {
			char temp = src.charAt(i);
			if (!lhm.containsKey(temp)) {
				lhm.put(temp, 1);
			} else {
				lhm.put(temp, lhm.get(temp) + 1);
			}
		}
		ArrayList<Map.Entry<Character, Integer>> arrayList = new ArrayList<Map.Entry<Character, Integer>>(
				lhm.entrySet());
		Collections.sort(arrayList, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		int min = arrayList.get(0).getValue();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src.length(); i++) {
			char temp = src.charAt(i);
			if (lhm.get(temp) != min) {
				sb.append(temp);
			}
		}
		return sb.toString();
	}
}