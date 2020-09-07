package No107_求解立方根;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextDouble()) {
			double input = scanner.nextDouble();
			System.out.printf("%.1f\n", getCubeRoot(input));
		}
		scanner.close();
	}

	public static double getCubeRoot(double input) {
		double xn = input;
		double xm = xn - (xn * xn * xn - input) / (3 * xn * xn);
		while (xm - xn >= 0.01 || xm - xn <= -0.01) {
			xn = xm;
			xm = xn - (xn * xn * xn - input) / (3 * xn * xn);
		}
		return xm;
	}
}