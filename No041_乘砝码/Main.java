package No041_≥ÀÌ¿¬Î;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String nString = scanner.nextLine();
			String weight = scanner.nextLine();
			String num = scanner.nextLine();

			int n = Integer.valueOf(nString);
			String[] weights = weight.split(" ");
			String[] nums = num.split(" ");
			if (n == weights.length && n == nums.length) {
				System.out.println(getHash(n, weights, nums).size());
			}
		}
	}

	public static HashSet<Integer> getHash(int n, String[] weight, String[] nums) {
		if (n == 1) {
			HashSet<Integer> hashSet1 = new HashSet<Integer>();
			hashSet1.add(0);
			int fama = 0;
			for (int i = 0; i < Integer.valueOf(nums[0]); i++) {
				fama += Integer.valueOf(weight[0]);
				hashSet1.add(fama);
			}
			return hashSet1;
		} else {
			HashSet<Integer> hashSetn = getHash(n - 1, weight, nums);
			HashSet<Integer> hashSetnew = getHash(n - 1, weight, nums);
			for (int i = 0; i < Integer.valueOf(nums[n - 1]); i++) {
				for (Integer integer : hashSetn) {
					Integer fama = integer + Integer.valueOf(weight[n - 1]) * (i + 1);
					hashSetnew.add(fama);
				}
			}
			return hashSetnew;
		}
	}
}