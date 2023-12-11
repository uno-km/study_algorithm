package JungOl;

import java.util.Scanner;

public class j110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("yard? ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double yard = 91.44;

		System.out.printf("%.1fyard = %.1fcm", a, a * yard);
		sc.close();
	}

}
