package JungOl;

import java.util.Scanner;

public class j129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0;
		int h = 0, base = 0;
		boolean bb = true;
		do {
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			h = sc.nextInt();
			a = (double) base * h / 2;
			System.out.printf("Triangle width = %.1f%n", a);
			System.out.print("Continue? ");
			String y = sc.next();
			char yes = y.charAt(0);
			if (yes != 'y' && yes != 'Y') {
				bb = false;
				sc.close();
			}

		} while (bb);
	}

}
