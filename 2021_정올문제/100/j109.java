package b_nput;

import java.util.Scanner;

public class j109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		double avg = sum / 3;

		System.out.printf("sum = %d%navg = %.0f", sum, avg);
		sc.close();
	}

}
