package JungOl;

import java.util.Scanner;

public class j613ver3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		Person p = new Person(name, school, grade);
		p.print_Inform();
	}

}

class Person {
	private String name;
	private String school;
	private int grade;

	public Person(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void print_Inform() {
		System.out.printf("Name : %s\n", name);
		System.out.printf("School : %s\n", school);
		System.out.printf("grade : %d\n", grade);
	}

}
