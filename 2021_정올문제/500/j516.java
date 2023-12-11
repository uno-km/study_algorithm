package b_nput;

import java.util.Scanner;

public class j516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		String c1 = scanner.nextLine();

		double a = Float.parseFloat(num1);
		double b = Float.parseFloat(num2);

		System.out.printf("%.2f%n", a);
		System.out.printf("%.2f%n", b);
		System.out.printf("%s%n", c1);
		scanner.close();
	}

}
