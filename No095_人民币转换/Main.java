package No095_�����ת��;

import java.util.Scanner;

public class Main_Error {
	static String[] china = { "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
	static String[] shi = { "", "ʰ", "��", "Ǫ" };
	static String[] wang = { "", "��", "��" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			if (input.contains("\\.")) {
				String[] arr = input.split("\\.");
				String sb_left = zhengshu(arr[0]);
				String sb_right = xiaoshu(arr[1]);
				StringBuilder sb = new StringBuilder();
				sb.insert(0, sb_right);
				if (!sb_left.equals("")) {
					sb.insert(0, "Ԫ");
				}
				sb.insert(0, sb_left);
				sb.insert(0, "�����");
				System.out.println(sb.toString());
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(zhengshu(input)).append("Ԫ��");
				sb.insert(0, "�����");
				System.out.println(sb.toString());
			}
		}
	}

	public static String zhengshu(String input) {
		if ("0".equals(input))
			return "";
		StringBuilder sb = new StringBuilder();
		int len = input.length();
		int index = len - 1;
		int k = 0;
		while (index >= 0 && index - 3 >= 0) {
			String temp = siweishu(input.substring(index - 3, index + 1));
			if (!"��".equals(temp)) {
				sb.insert(0, wang[k]);
			}
			sb.insert(0, temp);
			index = index - 4;
			k++;
		}
		if (index != -1) {
			String temp = siweishu(input.substring(0, index + 1));
			sb.insert(0, wang[k]);
			sb.insert(0, temp);
		}
		return sb.toString();
	}

	public static String siweishu(String input) {
		StringBuilder sb = new StringBuilder();
		int temp = Integer.valueOf(input);
		if (temp == 0)
			return "��";
		int index = 0;
		boolean flag = false;
		while (temp / 10 != 0) {
			int a = temp % 10;
			if (a == 0) {
				if (!flag && index != 0) {
					sb.insert(0, "��");
					flag = true;
				}
			} else {
				sb.insert(0, shi[index]);
				sb.insert(0, china[a - 1]);
			}

			index++;
			temp = temp / 10;
		}
		if (index == 1 && temp == 1) {
			sb.insert(0, shi[index]);
		} else {
			sb.insert(0, shi[index]);
			sb.insert(0, china[temp % 10 - 1]);
		}
		return sb.toString();
	}

	public static String xiaoshu(String input) {
		StringBuilder sb = new StringBuilder();
		if (input.charAt(0) == '0' && input.charAt(1) == '0') {
			sb.append("��");
		} else {
			if (input.charAt(0) != '0') {
				sb.append(china[Integer.valueOf(input.substring(0, 1)) - 1] + "��");
			}
			if (input.charAt(1) != '0') {
				sb.append(china[Integer.valueOf(input.substring(1, 2)) - 1] + "��");
			}
		}
		return sb.toString();
	}
}