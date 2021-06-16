package f_RepeatedControl3;

import java.util.Scanner;

public class j146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), cnt = 0;
		char a = 'A';
		for (int i = 0; i < c; i++) {
			for (int j = c; j - i > 0; j--) {
				System.out.print(a++ + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
