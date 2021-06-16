package k_Struct;

import java.util.Scanner;

public class j614ver2 {
	public static void main(String[] args) {
		School school = new School("Jejuelementary", 6);

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int grade = scanner.nextInt();
		scanner.close();

		School school2 = new School(name, grade);

		System.out.println(school);
		System.out.println(school2);
	}
}

class School {
	private String name;
	private int grade;

	public School(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String toString() {
		return grade + " grade in " + name + " School";
	}
}