package f_RepeatedControl1;

import java.util.Scanner;

public class j126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int i = 0;
		do {
			ar[i] = sc.nextInt();

		} while (ar[i++] != 0);
		sc.close();

		int odd = 0, even = 0;
		for (int j = 0; j < i - 1; j++) {
			if (ar[j] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
