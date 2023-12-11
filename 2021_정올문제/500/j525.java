package c_Operator;

import java.util.Scanner;

public class j525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("%b%n", a > b && a > c);
		System.out.printf("%b", a == b && b == c);
		sc.close();
	}

}
