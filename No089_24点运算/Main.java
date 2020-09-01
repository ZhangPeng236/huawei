package No089_24µ„‘ÀÀ„;

import java.security.Policy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			ArrayList<String> elements = new ArrayList<String>();
			for (int i = 0; i < 4; i++) {
				elements.add(scanner.next());
			}
			double aim = 24;
			check(elements, aim);
		}
		scanner.close();
	}

	private static void check(ArrayList<String> elements, double aim) {
		if (elements.contains("joker") || elements.contains("JOKER")) {
			System.out.println("ERROR");
		}
		HashMap<String, Integer> pokers = new HashMap<String, Integer>();
		pokers.put("A", 1);
		pokers.put("2", 2);
		pokers.put("3", 3);
		pokers.put("4", 4);
		pokers.put("5", 5);
		pokers.put("6", 6);
		pokers.put("7", 7);
		pokers.put("8", 8);
		pokers.put("9", 9);
		pokers.put("10", 10);
		pokers.put("J", 11);
		pokers.put("Q", 12);
		pokers.put("K", 13);
		if (elements.size() == 1) {
			if (pokers.get(elements.get(0)) == aim) {
				System.out.println(elements.get(0));
			} else {
				System.out.println("ERROR");
			}
		} else {
			boolean flag = false;
			for (int i = 0; i < elements.size(); i++) {
				ArrayList<String> temp = new ArrayList<String>(elements);
				temp.remove(i);
				if (check(temp, aim + elements.get(i)) || check(temp, aim - elements.get(i))
						|| check(temp, aim * elements.get(i)) || check(temp, aim / elements.get(i))) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}
}