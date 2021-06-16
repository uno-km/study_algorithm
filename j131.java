package f_RepeatedControl2;

import java.util.Scanner;

public class j131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		int max = 0;
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		for (int i = min; i <= max; i++) {
			System.out.printf(i + " ");
		}
		sc.close();
	}
}
