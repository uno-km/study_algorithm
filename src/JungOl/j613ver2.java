package JungOl;

import java.util.Scanner;

public class j613ver2 {
	private String name;
	private String school;
	private int grade;

	void setName(String name) {
		this.name = name;
	}

	void setSchool(String school) {
		this.school = school;
	}

	void setGrade(int grade) {
		this.grade = grade;
	}

	public void print_Inform() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		j613ver2 m = new j613ver2();
		String a = sc.next();
		String b = sc.next();
		int c = sc.nextInt();
		sc.close();
		m.setName(a);
		m.setSchool(b);
		m.setGrade(c);

		m.print_Inform();
	}

}
