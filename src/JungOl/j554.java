package JungOl;

import java.util.Scanner;

public class j554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), sum = 0;
		char b = (int) 65;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i; j++) {
				sum += 1;
				System.out.printf("%d ", sum);
			}
			for (int k = 0; k <= i; k++) {
				System.out.printf("%c ", b++);
			}
			System.out.println();
		}
		sc.close();
	}
}
