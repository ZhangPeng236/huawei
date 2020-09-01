package No010_�ַ�����ͳ��;

import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		BitSet bitSet = new BitSet(128);
		for (char c : line.toCharArray()) {
			if (!bitSet.get(c)) {
				bitSet.set(c);
			}
		}
		System.out.println(bitSet.cardinality());
	}
}