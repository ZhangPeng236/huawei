package No092_在字符串中找出连续最长的数字串;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			method(scanner.next());
		}
	}

	private static void method(String src) {
		LinkedHashMap<StringBuilder, Integer> linkedHashMap = new LinkedHashMap<StringBuilder, Integer>();
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < src.length(); i++) {
			if (src.charAt(i) >= '0' && src.charAt(i) <= '9') {
				temp.append(src.charAt(i));
			}
			if (temp.length() != 0 && i == src.length() - 1
					|| temp.length() != 0 && !(src.charAt(i + 1) >= '0' && src.charAt(i + 1) <= '9')) {
				linkedHashMap.put(temp, temp.length());
				temp = new StringBuilder();
			}
		}
		Collection<Integer> collection = linkedHashMap.values();
		int max = Collections.max(collection);
		Set<StringBuilder> set = linkedHashMap.keySet();
		StringBuilder result = new StringBuilder();
		for (StringBuilder sb : set) {
			if (linkedHashMap.get(sb).equals(max)) {
				result.append(sb).append(",").append(linkedHashMap.get(sb));
			}
		}
		int lastIndex = result.lastIndexOf(",");
		System.out.println(result.substring(0, lastIndex).replaceAll("," + max, "") + "," + max);
	}
}