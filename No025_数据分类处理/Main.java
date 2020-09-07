package No025_数据分类处理;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String iString = scanner.nextLine();
			int in = Integer.valueOf(iString.split("\\s+")[0]);
			int[] is = new int[in];
			for (int i = 0; i < in; i++) {
				is[i] = Integer.valueOf(iString.split("\\s+")[i + 1]);
			}
			String rString = scanner.nextLine();
			TreeSet<Integer> rs = new TreeSet<Integer>();
			for (int i = 0; i < Integer.valueOf(rString.split("\\s+")[0]); i++) {
				rs.add(Integer.valueOf(rString.split("\\s+")[i + 1]));
			}
			LinkedList<LinkedList<Integer>> big = new LinkedList<LinkedList<Integer>>();
			for (int temp : rs) {
				LinkedList<Integer> small = new LinkedList<Integer>();
				for (int i = 0; i < in; i++) {
					if (String.valueOf(is[i]).contains(String.valueOf(temp))) {
						small.add(i);
						small.add(is[i]);
					}
				}
				if (small.size() != 0) {
					small.addFirst(small.size() / 2);
					small.addFirst(temp);
					big.add(small);
				}
			}
			int first = 0;
			for (int i = 0; i < big.size(); i++) {
				first += big.get(i).size();
			}
			System.out.print(first + " ");
			for (LinkedList<Integer> small : big) {
				for (Integer i : small) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}