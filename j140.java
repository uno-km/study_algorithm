package f_RepeatedControl3;

import java.util.Scanner;

public class j140 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			int sum = 0, a = 0, i = 0;
			for (i = 0; i < 20; i++) {
				a = sc.nextInt();
				sum += a;
				if (a == 0) {
					System.out.printf("%d %d", sum, sum / i);
					System.exit(0);
				}

			}
			System.out.printf("%d %d", sum, sum / i);
			sc.close();
		}
	}

}
