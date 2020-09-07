package No073_计算日期到天数转换;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			System.out.println(iConverDateToDay(year, month, day));
		}
		scanner.close();
	}

	public static int iConverDateToDay(int year, int month, int day) {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("y M d");
		try {
			date = sdf1.parse(year + " " + month + " " + day);
		} catch (ParseException e) {
			return -1;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
		String day_of_year = simpleDateFormat.format(date);
		return Integer.parseInt(day_of_year);
	}
}