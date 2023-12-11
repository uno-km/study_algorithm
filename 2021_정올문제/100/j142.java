package f_RepeatedControl3;

import java.util.Scanner;

public class j142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i = 0; i < s; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		int a = s;
		for (int i = s; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				--a;
				System.out.print("*");

			}
			System.out.println();
		}
		sc.close();
	}

}
