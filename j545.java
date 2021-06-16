package f_RepeatedControl2;

import java.util.Scanner;

public class j545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = 0, n = 0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if (a % 3 == 0) {
				m++;

			}
			if (a % 5 == 0) {
				n++;
			}
		}
		System.out.printf("Multiples of 3 : %d%nMultiples of 5 : %d", m, n);
	}

}
