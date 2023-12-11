package k_Struct;

import java.util.Scanner;

public class j614ver1 {

	public static void main(String[] args) {
		Procedure p = new Procedure();
		p.input();
		p.print();
	}
}

class Student {
	int grade;
	String schoolName;
	final int grade2 = 6;
	final String schoolName2 = "Jejuelemetary";
}

class Procedure extends Student {
	void input() {
		Scanner sc = new Scanner(System.in);
		this.schoolName = sc.next();
		this.grade = sc.nextInt();
		sc.close();
	}

	void print() {
		System.out.printf("%d grade in %s School\n", grade2, schoolName2);
		System.out.printf("%d grade in %s School", grade, schoolName);
	}
}
