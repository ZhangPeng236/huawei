package No089_24������;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���ڳ�����ȡString����
		LinkedList<String> list1 = new LinkedList<>();
		// ���ڽ�Stringת����int����
		LinkedList<Integer> list = new LinkedList<>();
		// ���ڻ�ԭ����1->A; 13->K��
		LinkedList<String> list2 = new LinkedList<>();

		list2.add("0");
		list2.add("A");
		for (int i = 2; i <= 10; i++) {
			list2.add(Integer.toString(i));
		}
		list2.add("J");
		list2.add("Q");
		list2.add("K");
		// ��ȡString��
		while (sc.hasNext()) {
			list1.add(sc.next());
		}
		int flag = 0;
		// ת����Integer��//����JOKER ֱ�����ERROR
		for (int i = 0; i < 4; i++) {
			String cur = list1.get(i);
			if (cur.equals("JOKER") || cur.equals("joker")) {
				System.out.println("ERROR");
				flag = -1;
				break;
			} else if (cur.equals("A")) {
				list.add(1);
			} else if (cur.equals("K")) {
				list.add(13);
			} else if (cur.equals("Q")) {
				list.add(12);
			} else if (cur.equals("J")) {
				list.add(11);
			} else {
				list.add(Integer.valueOf(cur));
			}
		}
		// ���������ĸ�����������ϣ�
		if (flag == 0) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (j == i)
						continue;
					if (flag == 1)
						break;
					for (int k = 0; k < 4; k++) {
						if (k == i || k == j)
							continue;
						if (flag == 1)
							break;
						for (int p = 0; p < 4; p++) {
							if (p == i || p == j || p == k)
								continue;
							if (flag == 1)
								break;
							// ���ĸ�������helper function���жϣ�
							String out = helper(list.get(i), list.get(j), list.get(k), list.get(p));
							// �����NONE�����ɴ𰸣�
							if (!out.equals("NONE")) {
								String res = "";
								res += list2.get(list.get(i));
								res += out.substring(0, 1);
								res += list2.get(list.get(j));
								res += out.substring(1, 2);
								res += list2.get(list.get(k));
								res += out.substring(2, 3);
								res += list2.get(list.get(p));
								System.out.println(res);
								flag = 1;
							}
						}
					}
				}
			}
			// helepr function���ΪNONE���NONE��
			if (flag == 0)
				System.out.println("NONE");
		}
	}

	// ������2-sum --> 3-sum -->4-sum˼·��
	static public String helper(int a, int b) {
		if (a * b == 24)
			return "*";
		else if (a + b == 24)
			return "+";
		else if (b != 0 && a % b == 0 && a / b == 24)
			return "/";
		else if (a - b == 24)
			return "-";
		else
			return "NONE";
	}

	// ����
	static public String helper(int a, int b, int c) {
		if (!helper(a * b, c).equals("NONE"))
			return "*" + helper(a * b, c);
		else if (!helper(a + b, c).equals("NONE"))
			return "+" + helper(a + b, c);
		else if (!helper(a - b, c).equals("NONE"))
			return "-" + helper(a - b, c);
		else if (b != 0 && a % b == 0 && !helper(a / b, c).equals("NONE"))
			return "/" + helper(a * b, c);
		else
			return "NONE";
	}

	// ���أ�����������������������
	static public String helper(int a, int b, int c, int d) {
		if (!helper(a * b, c, d).equals("NONE"))
			return "*" + helper(a * b, c, d);
		else if (!helper(a + b, c, d).equals("NONE"))
			return "+" + helper(a + b, c, d);
		else if (!helper(a - b, c, d).equals("NONE"))
			return "-" + helper(a - b, c, d);
		else if (b != 0 && a % b == 0 && !helper(a / b, c, d).equals("NONE"))
			return "/" + helper(a * b, c, d);
		else
			return "NONE";
	}
}