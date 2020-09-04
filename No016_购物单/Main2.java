package No016_���ﵥ;

import java.util.Scanner;

public class Main2 {
	private static class good {
		private int v; // ��Ʒ�ļ۸�
		private int p; // ��Ʒ����Ҫ��
		private int q; // ��Ʒ������ID
		public int a1 = 0; // ����1ID
		public int a2 = 0; // ����2ID

		public good(int v, int p, int q) {
			this.v = v;
			this.p = p;
			this.q = q;
		}

		public void setA1(int a1) {
			this.a1 = a1;
		}

		public void setA2(int a2) {
			this.a2 = a2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int n = sc.nextInt();
		if (n <= 0 || money <= 0)
			System.out.println(0);
		good[] Gs = new good[n + 1];
		for (int i = 1; i <= n; i++) {
			int v = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			Gs[i] = new good(v, p, q);

			if (q > 0) {
				if (Gs[q].a1 == 0) {
					Gs[q].setA1(i);
				} else {
					Gs[q].setA2(i);
				}
			}
		}
		int[][] dp = new int[n + 1][money + 1];
		for (int i = 1; i <= n; i++) {
			int v = 0, v1 = 0, v2 = 0, v3 = 0, tempdp = 0, tempdp1 = 0, tempdp2 = 0, tempdp3 = 0;
			v = Gs[i].v;
			tempdp = Gs[i].p * v; // ֻ������
			if (Gs[i].a1 != 0) {// �����Ӹ���1
				v1 = Gs[Gs[i].a1].v + v;
				tempdp1 = tempdp + Gs[Gs[i].a1].v * Gs[Gs[i].a1].p;
			}
			if (Gs[i].a2 != 0) {// �����Ӹ���2
				v2 = Gs[Gs[i].a2].v + v;
				tempdp2 = tempdp + Gs[Gs[i].a2].v * Gs[Gs[i].a2].p;
			}
			if (Gs[i].a1 != 0 && Gs[i].a2 != 0) {// �����Ӹ���1�͸���2
				v3 = Gs[Gs[i].a1].v + Gs[Gs[i].a2].v + v;
				tempdp3 = tempdp + Gs[Gs[i].a1].v * Gs[Gs[i].a1].p + Gs[Gs[i].a2].v * Gs[Gs[i].a2].p;
			}
			for (int j = 1; j <= money; j++) {
				if (Gs[i].q > 0) { // ����Ʒi�Ǹ���ʱ,�൱������
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
					if (j >= v && v != 0)
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v] + tempdp);
					if (j >= v1 && v1 != 0)
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v1] + tempdp1);
					if (j >= v2 && v2 != 0)
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v2] + tempdp2);
					if (j >= v3 && v3 != 0)
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v3] + tempdp3);
				}
			}
		}
		System.out.println(dp[n][money]);
		sc.close();
	}
}