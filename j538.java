package f_RepeatedControl1;

import java.util.Scanner;

public class j538 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			for (;;) {
				System.out.print("number? ");
				int num = sc.nextInt();
				if (num > 0) {
					System.out.println("positive integer");

				} else if (num < 0) {
					System.out.println("negative number");
				} else {
					sc.close();
					break;
				}

			}

		}
	}

}
