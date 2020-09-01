package No017_坐标问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<String> list;// 静态的list存放过滤后的坐标，整个类中都可以用

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] str = s.split(";");
			list = new ArrayList<>();
			// 定义一个0到99的字符串数组
			String[] numstr = new String[100];
			for (int i = 0; i < 100; i++) {
				numstr[i] = i + "";// int + "" 使int类型转换为String类型；
			}
			// 过滤掉没用的坐标添加到list***中
			for (int i = 0; i < str.length; i++) {
				// 如A0 ~A9 长度为2；A10~A99 长度为3 ； A~Z的字符ASCII码 为 65~90
				if (str[i].length() == 3 || str[i].length() == 2 && str[i].charAt(0) <= 90 && str[i].charAt(0) >= 65) {
					String num = str[i].substring(1);
					for (int j = 0; j < numstr.length; j++) {
						if (num.equals(numstr[j]))
							list.add(str[i]);
					}
				}
			}
			// 调用坐标移动方法
			go(0, 0);
		}
	}

	private static void go(int x, int y) {
		for (int i = 0; i < list.size(); i++) {
			// 上
			if (list.get(i).substring(0, 1).equals("W")) {
				x += 0;
				y += Integer.parseInt(list.get(i).substring(1));
			}
			// 下
			if (list.get(i).substring(0, 1).equals("S")) {
				x -= 0;
				y -= Integer.parseInt(list.get(i).substring(1));
			}
			// 左
			if (list.get(i).substring(0, 1).equals("A")) {
				x -= Integer.parseInt(list.get(i).substring(1));
				y -= 0;
			}
			// 右
			if (list.get(i).substring(0, 1).equals("D")) {
				x += Integer.parseInt(list.get(i).substring(1));
				y += 0;
			}
		}
		System.out.println(x + "," + y);
	}
}
