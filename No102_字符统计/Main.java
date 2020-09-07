package No102_×Ö·ûÍ³¼Æ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			System.out.println(sort(src));
		}
		scanner.close();
	}

	private static String sort(String src) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || (c + "" == " ")) {
				if (hashMap.containsKey(c)) {
					hashMap.put(c, hashMap.get(c) + 1);
				} else {
					hashMap.put(c, 1);
				}
			}
		}
		ArrayList<Map.Entry<Character, Integer>> arrayList = new ArrayList<Map.Entry<Character, Integer>>(
				hashMap.entrySet());
		Collections.sort(arrayList, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				int num = o2.getValue().compareTo(o1.getValue());
				int num2 = num == 0 ? o1.getKey().compareTo(o2.getKey()) : num;
				return num2;
			}
		});
		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Character, Integer> m : arrayList) {
			stringBuilder.append(m.getKey());
		}
		return stringBuilder.toString();
	}
}