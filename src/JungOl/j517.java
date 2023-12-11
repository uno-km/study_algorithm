package JungOl;

import java.util.Scanner;

public class j517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n1 = scanner.nextLine();
		String n2 = scanner.nextLine();
		String n3 = scanner.nextLine();

		double a = Float.parseFloat(n1);
		double b = Float.parseFloat(n2);
		double c = Float.parseFloat(n3);

		scanner.close();
		System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);
	}

}
