package f_RepeatedControl3;

import java.util.Scanner;

public class j552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 2 * i; j < 2 * a - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
