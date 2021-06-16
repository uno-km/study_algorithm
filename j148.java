package f_RepeatedControl3;

import java.util.Scanner;

public class j148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), cnt = 1, d = c - 1;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int i = 0; i < c - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < c - i - 1; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		sc.close();
	}

}
