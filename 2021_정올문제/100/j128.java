package f_RepeatedControl1;

import java.util.Scanner;

public class j128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bb = true;
		int i = 0;
		do {
			int input = sc.nextInt();
			i++;

			if (input == 0) {
				i = i - 1;
				bb = false;
			} else if (input % 3 == 0 || input % 5 == 0) {
				i = i - 1;

			}
		} while (bb);
		System.out.println(i);
		sc.close();
	}

}
