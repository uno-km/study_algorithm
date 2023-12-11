package f_RepeatedControl3;

import java.util.Scanner;

public class j147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), cnt = 1;
		for (int i = 0; i < c; i++) {
			for (int k = 0; k <= i - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < c - i; j++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();

		}
		sc.close();
	}

}
