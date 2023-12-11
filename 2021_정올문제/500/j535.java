package e_SelectAndControl;

import java.util.Scanner;

public class j535 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if (a >= 4.0) {
			System.out.print("scholarship");
		} else if (a >= 3.0) {
			System.out.print("next semester");
		} else if (a >= 2.0) {
			System.out.print("seasonal semester");
		} else if (a < 2.0) {
			System.out.print("retake");
		}
		sc.close();
	}

}
