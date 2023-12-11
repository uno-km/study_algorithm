package c_Operator;

import java.util.Scanner;

public class j524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean c = (a != 0);
		boolean d = (b != 0);

		System.out.printf("%b %b", c && d, c || d);
		sc.close();
		
	}

}
