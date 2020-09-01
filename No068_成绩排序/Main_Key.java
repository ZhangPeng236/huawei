package No068_≥…º®≈≈–Ú;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	private String name;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = Integer.valueOf(scanner.next());
			Student[] students = new Student[n];
			int upDown = Integer.valueOf(scanner.next());
			for (int i = 0; i < n; i++) {
				students[i] = new Student(scanner.next(), Integer.valueOf(scanner.next()));
			}
			Arrays.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (upDown == 0) {
						return o2.getScore() - o1.getScore();
					} else if (upDown == 1) {
						return o1.getScore() - o2.getScore();
					} else {
						return 0;
					}
				}

			});
			for (Student student : students) {
				System.out.println(student.getName() + " " + student.getScore());
			}
		}
	}
}