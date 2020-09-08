package No070_矩阵乘法计算量估计;

import java.util.Scanner;
import java.util.Stack;

public class Main_Bug {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int num = Integer.parseInt(scanner.nextLine());
			int[][] arr = new int[num][2];
			for (int i = 0; i < num; i++) {
				String[] matrix = scanner.nextLine().split(" ");
				arr[i][0] = Integer.parseInt(matrix[0]);
				arr[i][1] = Integer.parseInt(matrix[1]);
			}
			char[] rule = scanner.nextLine().toCharArray();
			Stack<Integer> stack = new Stack<>();
			int n = 0;
			int sum = 0;
			for (int i = 0; i <= rule.length - 1; i++) {
				char c = rule[i];
				if (c == '(') {
					stack.push(-1);
				} else if (c == ')') {
					int n2 = stack.pop();
					int n1 = stack.pop();
					sum += arr[n1][0] * arr[n1][1] * arr[n2][1];
					arr[n1][1] = arr[n2][1];
					stack.pop();
					stack.push(n1);
				} else {
					stack.push(n);
					n++;
				}
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}