package No063_DNA–Ú¡–;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.next();
			int n = Integer.valueOf(scanner.next());
			System.out.println(maxLength(src, n));
		}
	}

	private static String maxLength(String src, int n) {
		LinkedHashMap<Integer, Double> part = new LinkedHashMap<Integer, Double>();
		for (int i = 0; i <= src.length() - n; i++) {
			String tmp = src.substring(i, i + n);
			part.put(i, rate(tmp, n));
		}
		ArrayList<Map.Entry<Integer, Double>> arrayList = new ArrayList<Map.Entry<Integer, Double>>(part.entrySet());
		Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Double>>() {
			@Override
			public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
				int num = o2.getValue().compareTo(o1.getValue());
				int num2 = num == 0 ? o1.getKey().compareTo(o2.getKey()) : num;
				return num2;
			}
		});
		Map.Entry<Integer, Double> maxEntry = arrayList.get(0);
		int maxIndex = maxEntry.getKey();
		return src.substring(maxIndex, maxIndex + n);
	}

	private static double rate(String tmp, int n) {
		int count = 0;
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == 'G' || tmp.charAt(i) == 'C') {
				count++;
			}
		}
		return count / (double) n;
	}
}