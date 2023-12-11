package c_Operator;

import java.util.Scanner;

public class j111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int sum = a + b + c + d;
		double avg = sum / 4;

		System.out.printf("sum %d%navg %.0f", sum, avg);
		sc.close();
	}

}
