package No041_≥ÀÌ¿¬Î;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int n = Integer.valueOf(scanner.nextLine());
			String weight = scanner.nextLine();
			String num = scanner.nextLine();

			String[] weights = weight.split(" ");
			String[] nums = num.split(" ");
			if (n == weights.length && n == nums.length) {
				System.out.println(getHash(n, weights, nums).size());
			}
		}
		scanner.close();
	}

	public static HashSet<Integer> getHash(int n, String[] weights, String[] nums) {
		if (n == 1) {
			HashSet<Integer> hashSet1 = new HashSet<Integer>();
			for (int i = 0; i <= Integer.valueOf(nums[0]); i++) {
				hashSet1.add(Integer.valueOf(weights[0]) * i);
			}
			return hashSet1;
		} else {
			HashSet<Integer> hashSetn = getHash(n - 1, weights, nums);
			HashSet<Integer> hashSetnew = getHash(n - 1, weights, nums);
			for (int i = 1; i <= Integer.valueOf(nums[n - 1]); i++) {
				for (Integer integer : hashSetn) {
					Integer fama = integer + Integer.valueOf(weights[n - 1]) * i;
					hashSetnew.add(fama);
				}
			}
			return hashSetnew;
		}
	}
}