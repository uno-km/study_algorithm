package e_SelectAndControl;

import java.util.Scanner;

public class j533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char g = sc.next().charAt(0);
		int y = sc.nextInt();
		sc.close();
		if (g == 'M') {
			if (y >= 18) {
				System.out.println("MAN");

			} else {
				System.out.println("BOY");
			}
		}
		if (g == 'F') {
			if (y >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}

}
