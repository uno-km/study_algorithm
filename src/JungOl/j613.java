package JungOl;

import java.util.Scanner;

public class j613 {
	private String name;
	private String school;
	private int grade;

	j613() {
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.school = sc.next();
		this.grade = sc.nextInt();
		sc.close();
	}

	public void print_Inform() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}

	public static void main(String[] args) {
		j613 m = new j613();
		m.print_Inform();
	}

}
