package k_Struct;

import java.text.MessageFormat;
import java.util.Scanner;

public class j614ver3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String scName = "Jejuelementary";
		int grade = 6;
		Students st1 = new Students(scName, grade);

		scName = sc.next();
		grade = sc.nextInt();
		sc.close();
		Students st2 = new Students(scName, grade);

		st1.printStu();
		st2.printStu();
	}

}

class Students {
	private String scName;
	private int grade;

	public Students(String scName, int grade) {
		this.scName = scName;
		this.grade = grade;
	}

	void printStu() {
		String base = "{1} grade in {0} School";
		String result = MessageFormat.format(base, this.scName, this.grade);
		System.out.println(result);
	}
}