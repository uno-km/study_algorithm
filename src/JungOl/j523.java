package JungOl;

import java.util.Scanner;

public class j523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d > %d --- %b%n", a, b, a > b);
		System.out.printf("%d < %d --- %b%n", a, b, a < b);
		System.out.printf("%d >= %d --- %b%n", a, b, a >= b);
		System.out.printf("%d <= %d --- %b%n", a, b, a <= b);
		sc.close();
	}

}
