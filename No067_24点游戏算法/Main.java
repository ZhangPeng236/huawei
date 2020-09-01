package No067_24µ„”Œœ∑À„∑®;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			ArrayList<Integer> elements = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				elements.add(Integer.valueOf(scanner.next()));
			}
			double aim = 24;
			System.out.println(check(elements, aim));
		}
		scanner.close();
	}

	private static boolean check(ArrayList<Integer> elements, double aim) {
		if (elements.size() == 1) {
			if (elements.get(0) == aim) {
				return true;
			} else {
				return false;
			}
		} else {
			boolean flag = false;
			for (int i = 0; i < elements.size(); i++) {
				ArrayList<Integer> temp = new ArrayList<Integer>(elements);
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