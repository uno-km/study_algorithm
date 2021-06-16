package f_RepeatedControl2;

import java.util.Scanner;

public class j139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			for (int i = 1; i <= 9; i++) {
				for (int j = a; j <= b; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, i * j);
				}
				System.out.println();
			}
		} else if (a > b) {
			for (int i = 1; i <= 9; i++) {
				for (int j = a; j >= b; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, i * j);
				}
				System.out.println();
			}
		} else if (a == b) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %2d%n", a, i, a * i);
			}
		}
		sc.close();
	}

}
