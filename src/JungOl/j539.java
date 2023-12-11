package JungOl;

import java.util.Scanner;

public class j539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		double sum = 0;
		double avg = 0;
		int i = 0;
		boolean bb = true;
		Scanner sc = new Scanner(System.in);
		while (bb) {

			num = sc.nextInt();
			if (num < 100) {
				sum += num;
				++i;
			} else {
				bb = false;

			}
		}
		sum += num;
		avg = sum / ++i;
		System.out.printf("%.0f%n%.1f", sum, avg);
		sc.close();
	}

}
