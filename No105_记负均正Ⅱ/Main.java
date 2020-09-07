package No105_记负均正Ⅱ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while (scanner.hasNextInt()) {
			arrayList.add(scanner.nextInt());
		}
		int count1 = 0;
		int count2 = 0;
		double sum = 0;
		for (Integer i : arrayList) {
			if (i < 0)
				count1++;
			else {
				count2++;
				sum += i;
			}
		}
		System.out.println(count1);
		if (count2 == 0) {
			System.out.println(0);
		} else {
			System.out.printf("%.1f", sum / count2);
		}
		scanner.close();
	}
}