package No017_��������;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<String> list;// ��̬��list��Ź��˺�����꣬�������ж�������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] str = s.split(";");
			list = new ArrayList<>();
			// ����һ��0��99���ַ�������
			String[] numstr = new String[100];
			for (int i = 0; i < 100; i++) {
				numstr[i] = i + "";// int + "" ʹint����ת��ΪString���ͣ�
			}
			// ���˵�û�õ�������ӵ�list***��
			for (int i = 0; i < str.length; i++) {
				// ��A0 ~A9 ����Ϊ2��A10~A99 ����Ϊ3 �� A~Z���ַ�ASCII�� Ϊ 65~90
				if (str[i].length() == 3 || str[i].length() == 2 && str[i].charAt(0) <= 90 && str[i].charAt(0) >= 65) {
					String num = str[i].substring(1);
					for (int j = 0; j < numstr.length; j++) {
						if (num.equals(numstr[j]))
							list.add(str[i]);
					}
				}
			}
			// ���������ƶ�����
			go(0, 0);
		}
	}

	private static void go(int x, int y) {
		for (int i = 0; i < list.size(); i++) {
			// ��
			if (list.get(i).substring(0, 1).equals("W")) {
				x += 0;
				y += Integer.parseInt(list.get(i).substring(1));
			}
			// ��
			if (list.get(i).substring(0, 1).equals("S")) {
				x -= 0;
				y -= Integer.parseInt(list.get(i).substring(1));
			}
			// ��
			if (list.get(i).substring(0, 1).equals("A")) {
				x -= Integer.parseInt(list.get(i).substring(1));
				y -= 0;
			}
			// ��
			if (list.get(i).substring(0, 1).equals("D")) {
				x += Integer.parseInt(list.get(i).substring(1));
				y += 0;
			}
		}
		System.out.println(x + "," + y);
	}
}
