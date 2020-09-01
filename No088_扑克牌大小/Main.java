package No088_ÆË¿ËÅÆ´óÐ¡;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String poker = "345678910JQKA2jokerJOKER";
		while (scanner.hasNext()) {
			String src = scanner.nextLine();
			String[] left = src.split("-")[0].split(" ");
			String[] right = src.split("-")[1].split(" ");
			int leftA = poker.indexOf(left[0]);
			int rightA = poker.indexOf(right[0]);
			if (isDoubleKing(left)) {
				System.out.println(left[0] + " " + left[1]);
			} else if (isDoubleKing(right)) {
				System.out.println(right[0] + " " + right[1]);
			} else if (isBoom(left) && isBoom(right)) {
				if (leftA > rightA) {
					System.out.println(left[0] + " " + left[0] + " " + left[0] + " " + left[0]);
				} else if (leftA < rightA) {
					System.out.println(right[0] + " " + right[0] + " " + right[0] + " " + right[0]);
				}
			} else if (isBoom(left) && !isBoom(right)) {
				System.out.println(left[0] + " " + left[0] + " " + left[0] + " " + left[0]);
			} else if (!isBoom(left) && isBoom(right)) {
				System.out.println(right[0] + " " + right[0] + " " + right[0] + " " + right[0]);
			} else if (left.length != right.length) {
				System.out.println("ERROR");
			} else {
				if (left.length == 5) {
					if (leftA > rightA) {
						System.out.println(left[0] + " " + left[1] + " " + left[2] + " " + left[3] + " " + left[4]);
					} else if (leftA < rightA) {
						System.out
								.println(right[0] + " " + right[1] + " " + right[2] + " " + right[3] + " " + right[4]);
					}
				} else if (left.length == 3) {
					if (leftA > rightA) {
						System.out.println(left[0] + " " + left[0] + " " + left[0]);
					} else if (leftA < rightA) {
						System.out.println(right[0] + " " + right[0] + " " + right[0]);
					}
				} else if (left.length == 2) {
					if (leftA > rightA) {
						System.out.println(left[0] + " " + left[0]);
					} else if (leftA < rightA) {
						System.out.println(right[0] + " " + right[0]);
					}
				} else if (left.length == 1) {
					if (leftA > rightA) {
						System.out.println(left[0]);
					} else if (leftA < rightA) {
						System.out.println(right[0]);
					}
				} else {
					System.out.println("ERROR");
				}
			}
		}
		scanner.close();

	}

	private static boolean isDoubleKing(String[] str) {
		if (str.length != 2) {
			return false;
		} else {
			if (str[0].equals("joker") && str[1].equals("JOKER") || str[0].equals("JOKER") && str[1].equals("joker")) {
				return true;
			} else {
				return false;
			}
		}
	}

	private static boolean isBoom(String[] str) {
		if (str.length != 4) {
			return false;
		} else {
			if (str[0].equals(str[1]) && str[0].equals(str[2]) && str[0].equals(str[3])
					&& "345678910JQKA2".contains(str[0])) {
				return true;
			} else {
				return false;
			}
		}
	}
}