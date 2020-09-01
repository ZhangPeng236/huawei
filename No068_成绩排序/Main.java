package No068_≥…º®≈≈–Ú;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student1 {
	String name;
	int score;

	public Student1(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			ArrayList<Student1> score = new ArrayList<Student1>();
			int n = Integer.valueOf(scanner.next());
			int upDown = Integer.valueOf(scanner.next());
			for (int i = 0; i < n; i++) {
				Student1 temp = new Student1(scanner.next(), scanner.nextInt());
				score.add(temp);
			}
			Collections.sort(score, new Comparator<Student1>() {
				@Override
				public int compare(Student1 o1, Student1 o2) {
					if (upDown == 0) {
						return o2.score - o1.score;
					} else if (upDown == 1) {
						return o1.score - o2.score;
					} else {
						return 0;
					}
				}
			});
			for (Student1 s : score) {
				System.out.println(s.name + " " + s.score);
			}
		}
		scanner.close();
	}
}