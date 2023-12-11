package e_SelectAndControl;

import java.util.Scanner;

public class j530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later", 20 - a);
		}
		sc.close();
	}

}
