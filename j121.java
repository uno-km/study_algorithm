package e_SelectAndControl;

import java.util.Scanner;

public class j121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if (a != 0) {
			if (a > 0) {
				System.out.println("plus");
			} else {
				System.out.println("minus");
			}
		} else {
			System.out.println("zero");
		}

	}

}
