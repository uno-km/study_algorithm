package c_Operator;

import java.util.Scanner;

public class j115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.printf("%b", a > c && b > d);
		sc.close();
	}

}
