package No073_�������ڵ�����ת��;

import java.util.Calendar;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int date = scanner.nextInt();
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month - 1, date);
			System.out.println(calendar);
			System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		}
	}
}