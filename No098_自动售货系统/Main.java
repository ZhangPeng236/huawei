package No098_自动售货系统;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	static List<Good> goods = new ArrayList<>();
	static List<Coin> boxs = new ArrayList<>();
	static List<Coin> cannels = new ArrayList<>();
	static {
		Good good = new Good();
		good.name = "A1";
		good.price = 2;
		goods.add(good);
		good = new Good();
		good.name = "A2";
		good.price = 3;
		goods.add(good);
		good = new Good();
		good.name = "A3";
		good.price = 4;
		goods.add(good);
		good = new Good();
		good.name = "A4";
		good.price = 5;
		goods.add(good);
		good = new Good();
		good.name = "A5";
		good.price = 8;
		goods.add(good);
		good = new Good();
		good.name = "A6";
		good.price = 6;
		goods.add(good);
		Coin coin = new Coin();
		coin.name = "1 yuan coin number";
		coin.price = 1;
		boxs.add(coin);
		coin = new Coin();
		coin.name = "2 yuan coin number";
		coin.price = 2;
		boxs.add(coin);
		coin = new Coin();
		coin.name = "5 yuan coin number";
		coin.price = 5;
		boxs.add(coin);
		coin = new Coin();
		coin.name = "10 yuan coin number";
		coin.price = 10;
		boxs.add(coin);
		coin = new Coin();
		coin.name = "1 yuan coin number";
		coin.price = 1;
		cannels.add(coin);
		coin = new Coin();
		coin.name = "2 yuan coin number";
		coin.price = 2;
		cannels.add(coin);
		coin = new Coin();
		coin.name = "5 yuan coin number";
		coin.price = 5;
		cannels.add(coin);
		coin = new Coin();
		coin.name = "10 yuan coin number";
		coin.price = 10;
		cannels.add(coin);
	}
	static int payNum = 0;
	static int goodsTotalNum = 0;

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		while ((str = br.readLine()) != null) {
			String[] data = str.split(";");
			for (int i = 0; i < data.length; i++) {
				if (data[i].startsWith("r")) {
					initData(data[i]);
				} else if (data[i].startsWith("p")) {
					pay(data[i]);
				} else if (data[i].startsWith("b")) {
					buy(data[i]);
				} else if (data[i].startsWith("c")) {
					canncel();
				} else if (data[i].startsWith("q")) {
					query(data[i]);
				}
			}
		}
	}

	private static void initData(String data) {
		payNum = 0;
		goodsTotalNum = 0;
		String[] datas = data.split(" ");
		String[] goodsNum = datas[1].split("-");
		for (int i = 0; i < goodsNum.length; i++) {
			goods.get(i).num = Integer.parseInt(goodsNum[i]);
			goodsTotalNum += goods.get(i).num;
		}
		String[] coinNum = datas[2].split("-");
		for (int i = 0; i < coinNum.length; i++) {
			boxs.get(i).num = Integer.parseInt(coinNum[i]);
		}
		System.out.println("S001:Initialization is successful");
	}

	private static void pay(String data) {
		String[] datas = data.split(" ");
		if (datas.length != 2) {
			System.out.println("E010:Parameter error");
			return;
		}
		int coin = Integer.parseInt(datas[1]);
		boolean verify = true;
		int index = 0;
		for (int i = 0; i < boxs.size(); i++) {
			Coin tmp = boxs.get(i);
			if (tmp.price == coin) {
				index = i;
				verify = false;
				break;
			}
		}
		if (verify) {
			System.out.println("E002:Denomination error");
			return;
		}
		if (coin != 1 && coin != 2) {
			Coin c1 = boxs.get(0);
			Coin c2 = boxs.get(1);
			if (c1.num * c1.price + c2.num * c2.price < coin) {
				System.out.println("E003:Change is not enough, pay fail");
				return;
			}
		}
		if (coin > 10) {
			System.out.println("E004:Pay the balance is beyond the scope biggest");
			return;
		}
		if (goodsTotalNum == 0) {
			System.out.println("E005:All the goods sold out");
			return;
		}
		payNum += coin;
		System.out.println("S002:Pay success,balance=" + payNum);
		boxs.get(index).num++;
	}

	private static void buy(String data) {
		String[] datas = data.split(" ");
		if (datas.length != 2) {
			System.out.println("E010:Parameter error");
			return;
		}
		String goodName = datas[1];
		boolean verify = true;
		Good buy = null;
		for (Good good : goods) {
			if (good.name.equals(goodName)) {
				verify = false;
				buy = good;
				break;
			}
		}
		if (verify) {
			System.out.println("E006:Goods does not exist");
			return;
		}
		if (buy.num == 0) {
			System.out.println("E007:The goods sold out");
			return;
		}
		if (buy.price > payNum) {
			System.out.println("E008:Lack of balance");
			return;
		}
		buy.num--;
		payNum -= buy.price;
		goodsTotalNum--;
		System.out.println("S003:Buy success,balance=" + payNum);
	}

	private static void canncel() {
		if (payNum == 0) {
			// 结果没换行
			System.out.print("E009:Work failure");
			return;
		}
		for (int i = 0; i < cannels.size(); i++) {
			cannels.get(i).num = 0;
		}
		cost(cannels, 3);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < cannels.size(); i++) {
			Coin tmp = cannels.get(i);
			sb.append(tmp.name).append("=").append(tmp.num).append("\n");
		}
		sb.setLength(sb.length() - 1);
		System.out.println(sb.toString().trim());
	}

	private static void cost(List<Coin> cannels, int n) {
		if (payNum == 0 || n < 0) {
			return;
		}
		if (boxs.get(n).num > 0) {
			Coin coin = cannels.get(n);
			int num = payNum / coin.price;
			if (boxs.get(n).num >= num) {
				boxs.get(n).num -= num;
			} else {
				num = boxs.get(n).num;
				boxs.get(n).num = 0;
			}
			payNum = payNum - coin.price * num;
			coin.num = num;
		}
		cost(cannels, n - 1);
	}

	private static void query(String data) {
		String[] datas = data.split(" ");
		if (datas.length != 2) {
			// 结果没换行
			System.out.print("E010:Parameter error");
			return;
		}
		int choise = Integer.parseInt(datas[1]);
		switch (choise) {
		case 0:
			StringBuffer sb1 = new StringBuffer();
			goods.sort(new Comparator<Good>() {
				@Override
				public int compare(Good o1, Good o2) {
					if (o1.num > o2.num) {
						return 1;
					} else if (o1.num < o2.num) {
						return -1;
					}
					return o1.name.compareTo(o2.name);
				}
			});
			for (int i = 0; i < goods.size(); i++) {
				Good good = goods.get(i);
				sb1.append(good.name).append(" ").append(good.price).append(" ").append(good.num).append("\n");
			}
			sb1.setLength(sb1.length() - 1);
			System.out.println(sb1.toString().trim());
			break;
		case 1:
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < boxs.size(); i++) {
				Coin coin = boxs.get(i);
				sb2.append(coin.name).append("=").append(coin.num).append("\n");
			}
			sb2.setLength(sb2.length() - 1);
			System.out.println(sb2.toString().trim());
			break;
		default:
			// 结果没换行
			System.out.print("E010:Parameter error");
			break;
		}
	}

	private static class Good {
		String name;
		int price;
		int num;
	}

	private static class Coin {
		String name;
		int price;
		int num;
	}
}